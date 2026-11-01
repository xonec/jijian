package cn.jianyun.workplan.replica;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/** 最小本地 HTTP 静态服务器：把 assets/www 提供给 WebView（解决 file:// 的模块加载与存储限制） */
public class AssetServer {
    private final AssetManager assets;
    private ServerSocket server;
    private Thread thread;
    private volatile boolean running;

    public AssetServer(Context ctx) {
        this.assets = ctx.getAssets();
    }

    public int start(int preferredPort) throws IOException {
        server = new ServerSocket(preferredPort);
        running = true;
        thread = new Thread(new Runnable() {
            @Override public void run() {
                while (running) {
                    try {
                        final Socket socket = server.accept();
                        new Thread(new Runnable() {
                            @Override public void run() { handle(socket); }
                        }).start();
                    } catch (IOException e) {
                        if (running) e.printStackTrace();
                    }
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        return server.getLocalPort();
    }

    public void stop() {
        running = false;
        try { if (server != null) server.close(); } catch (IOException ignored) {}
    }

    private void handle(Socket socket) {
        OutputStream out = null;
        try {
            socket.setSoTimeout(5000);
            InputStream in = socket.getInputStream();
            String requestLine = readLine(in);
            if (requestLine == null || requestLine.length() == 0) return;
            String path = "/index.html";
            String[] parts = requestLine.split(" ");
            if (parts.length >= 2) path = parts[1];
            String header;
            while ((header = readLine(in)) != null && header.length() > 0) { /* drain */ }
            if (path.equals("/")) path = "/index.html";
            path = URLDecoder.decode(path, "UTF-8");
            int q = path.indexOf('?');
            if (q >= 0) path = path.substring(0, q);
            out = socket.getOutputStream();
            if (path.contains("..")) {
                write(out, 403, "text/plain", "forbidden".getBytes(StandardCharsets.UTF_8));
                return;
            }
            byte[] data = readAsset("www" + path);
            if (data == null) {
                write(out, 404, "text/plain", "not found".getBytes(StandardCharsets.UTF_8));
                return;
            }
            write(out, 200, mimeOf(path), data);
        } catch (Exception e) {
            try {
                if (out != null) write(out, 500, "text/plain", "error".getBytes(StandardCharsets.UTF_8));
            } catch (Exception ignored) {}
        } finally {
            try { socket.close(); } catch (IOException ignored) {}
        }
    }

    private String readLine(InputStream in) throws IOException {
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        int c;
        while ((c = in.read()) != -1) {
            if (c == '\n') break;
            if (c != '\r') buf.write(c);
        }
        if (c == -1 && buf.size() == 0) return null;
        return buf.toString("UTF-8");
    }

    private byte[] readAsset(String path) {
        InputStream in = null;
        try {
            in = assets.open(path);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[8192];
            int n;
            while ((n = in.read(buf)) != -1) out.write(buf, 0, n);
            return out.toByteArray();
        } catch (IOException e) {
            return null;
        } finally {
            try { if (in != null) in.close(); } catch (IOException ignored) {}
        }
    }

    private void write(OutputStream out, int code, String mime, byte[] data) throws IOException {
        String head = "HTTP/1.1 " + code + " " + (code == 200 ? "OK" : "ERR") + "\r\n"
                + "Content-Type: " + mime + "\r\n"
                + "Content-Length: " + data.length + "\r\n"
                + "Cache-Control: no-cache\r\n"
                + "Connection: close\r\n\r\n";
        out.write(head.getBytes(StandardCharsets.UTF_8));
        out.write(data);
        out.flush();
    }

    private static final Map<String, String> MIME = new HashMap<String, String>();
    static {
        MIME.put("html", "text/html; charset=utf-8");
        MIME.put("js", "text/javascript; charset=utf-8");
        MIME.put("css", "text/css; charset=utf-8");
        MIME.put("json", "application/json; charset=utf-8");
        MIME.put("png", "image/png");
        MIME.put("jpg", "image/jpeg");
        MIME.put("svg", "image/svg+xml");
        MIME.put("woff2", "font/woff2");
        MIME.put("ttf", "font/ttf");
        MIME.put("ico", "image/x-icon");
    }

    private String mimeOf(String path) {
        int i = path.lastIndexOf('.');
        String ext = i >= 0 ? path.substring(i + 1).toLowerCase() : "";
        String m = MIME.get(ext);
        return m != null ? m : "application/octet-stream";
    }
}
