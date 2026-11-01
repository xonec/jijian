package cn.jianyun.workplan.util;

import android.util.Base64;
import com.adgain.sdk.base.models.AdConstants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public class MyEncryptTool {
    private static final String ALGORITHMSTR = "AES/ECB/PKCS5Padding";
    public static final String MD5 = "MD5";
    public static final Charset UTF8 = Charset.forName("UTF-8");

    public static String uid(String s) {
        String strMd5 = md5(s);
        return strMd5.length() < 10 ? strMd5 : strMd5.substring(0, 10);
    }

    public static String md5(String s) {
        if (MyStringTool.isBlank(s)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(s.getBytes(UTF8));
            return parseByte2HexStr(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String parseByte2HexStr(byte[] buf) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : buf) {
            String hexString = Integer.toHexString(b2 & UByte.MAX_VALUE);
            if (hexString.length() == 1) {
                hexString = AdConstants.FAIL + hexString;
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    private static String aesEncrypt(String content, String encryptKey) throws Exception {
        return base64Encode(aesEncryptToBytes(content, encryptKey));
    }

    public static String base64Encode(byte[] bytes) {
        return Base64.encodeToString(bytes, 0);
    }

    public static byte[] base64Decode(String base64Code) throws Exception {
        if (MyStringTool.isBlank(base64Code)) {
            return null;
        }
        return Base64.decode(base64Code, 0);
    }

    private static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
        KeyGenerator.getInstance("AES").init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(1, new SecretKeySpec(encryptKey.getBytes(), "AES"));
        return cipher.doFinal(content.getBytes("utf-8"));
    }

    private static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
        KeyGenerator.getInstance("AES").init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(2, new SecretKeySpec(decryptKey.getBytes(), "AES"));
        return new String(cipher.doFinal(encryptBytes));
    }

    private static String aesDecrypt(String encryptStr, String decryptKey) throws Exception {
        if (MyStringTool.isBlank(encryptStr)) {
            return null;
        }
        return aesDecryptByBytes(base64Decode(encryptStr), decryptKey);
    }

    private static String makeKey(String k) {
        return md5(k).substring(0, 16).toUpperCase();
    }

    public static String encrypt(String content) {
        try {
            return cbcEncrypt(content, "qiangzi", "plan");
        } catch (Exception unused) {
            return content;
        }
    }

    public static String decrypt(String content) {
        String strCbcDecrypt = cbcDecrypt(content, "qiangzi", "plan");
        return strCbcDecrypt == null ? content : strCbcDecrypt;
    }

    private static String cbcEncrypt(String content, String iv, String key) throws Exception {
        byte[] bytes = md5(key).toUpperCase().substring(0, 16).getBytes("utf-8");
        String strSubstring = md5(iv).toUpperCase().substring(0, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(strSubstring.getBytes()));
        return Base64.encodeToString(cipher.doFinal(content.getBytes()), 0);
    }

    private static String cbcDecrypt(String content, String iv, String key) {
        try {
            byte[] bytes = md5(key).toUpperCase().substring(0, 16).getBytes("utf-8");
            String strSubstring = md5(iv).toUpperCase().substring(0, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(strSubstring.getBytes()));
            return new String(cipher.doFinal(Base64.decode(content, 0)));
        } catch (Exception unused) {
            return null;
        }
    }
}