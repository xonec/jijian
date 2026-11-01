package cn.jianyun.workplan.main;

import com.adgain.sdk.base.models.point.PointEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Router.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0019\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0019 !\"#$%&'()*+,-./012345678¨\u00069"}, d2 = {"Lcn/jianyun/workplan/main/Router;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "Borrow", "Countdown", "Diary", PointEvent.FEEDBACK, "Gift", "Home", "LocalBackup", "NotifySetting", "Password", "Piecework", "PrivatePolicy", "Question", "Schedule", "Setting", "TestMainView", "Time", "TodoList", "Travel", "UserDetail", "UserPolicy", "Vip", "WebDAV", "WebDAVManage", "Wechat", "Widget", "Lcn/jianyun/workplan/main/Router$Borrow;", "Lcn/jianyun/workplan/main/Router$Countdown;", "Lcn/jianyun/workplan/main/Router$Diary;", "Lcn/jianyun/workplan/main/Router$Feedback;", "Lcn/jianyun/workplan/main/Router$Gift;", "Lcn/jianyun/workplan/main/Router$Home;", "Lcn/jianyun/workplan/main/Router$LocalBackup;", "Lcn/jianyun/workplan/main/Router$NotifySetting;", "Lcn/jianyun/workplan/main/Router$Password;", "Lcn/jianyun/workplan/main/Router$Piecework;", "Lcn/jianyun/workplan/main/Router$PrivatePolicy;", "Lcn/jianyun/workplan/main/Router$Question;", "Lcn/jianyun/workplan/main/Router$Schedule;", "Lcn/jianyun/workplan/main/Router$Setting;", "Lcn/jianyun/workplan/main/Router$TestMainView;", "Lcn/jianyun/workplan/main/Router$Time;", "Lcn/jianyun/workplan/main/Router$TodoList;", "Lcn/jianyun/workplan/main/Router$Travel;", "Lcn/jianyun/workplan/main/Router$UserDetail;", "Lcn/jianyun/workplan/main/Router$UserPolicy;", "Lcn/jianyun/workplan/main/Router$Vip;", "Lcn/jianyun/workplan/main/Router$WebDAV;", "Lcn/jianyun/workplan/main/Router$WebDAVManage;", "Lcn/jianyun/workplan/main/Router$Wechat;", "Lcn/jianyun/workplan/main/Router$Widget;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Router {
    public static final int $stable = 0;
    private final String route;

    public /* synthetic */ Router(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Home;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Home extends Router {
        public static final int $stable = 0;
        public static final Home INSTANCE = new Home();

        private Home() {
            super("Home", null);
        }
    }

    private Router(String str) {
        this.route = str;
    }

    public String getRoute() {
        return this.route;
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$TestMainView;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TestMainView extends Router {
        public static final int $stable = 0;
        public static final TestMainView INSTANCE = new TestMainView();

        private TestMainView() {
            super("TestMainView", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$PrivatePolicy;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PrivatePolicy extends Router {
        public static final int $stable = 0;
        public static final PrivatePolicy INSTANCE = new PrivatePolicy();

        private PrivatePolicy() {
            super("PrivatePolicy", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$UserPolicy;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UserPolicy extends Router {
        public static final int $stable = 0;
        public static final UserPolicy INSTANCE = new UserPolicy();

        private UserPolicy() {
            super("UserPolicy", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$TodoList;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TodoList extends Router {
        public static final int $stable = 0;
        public static final TodoList INSTANCE = new TodoList();

        private TodoList() {
            super("TodoList", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Password;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Password extends Router {
        public static final int $stable = 0;
        public static final Password INSTANCE = new Password();

        private Password() {
            super("Password", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Piecework;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Piecework extends Router {
        public static final int $stable = 0;
        public static final Piecework INSTANCE = new Piecework();

        private Piecework() {
            super("Piecework", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Schedule;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Schedule extends Router {
        public static final int $stable = 0;
        public static final Schedule INSTANCE = new Schedule();

        private Schedule() {
            super("Schedule", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Gift;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Gift extends Router {
        public static final int $stable = 0;
        public static final Gift INSTANCE = new Gift();

        private Gift() {
            super("Gift", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Countdown;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Countdown extends Router {
        public static final int $stable = 0;
        public static final Countdown INSTANCE = new Countdown();

        private Countdown() {
            super("Countdown", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Time;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Time extends Router {
        public static final int $stable = 0;
        public static final Time INSTANCE = new Time();

        private Time() {
            super("Time", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Borrow;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Borrow extends Router {
        public static final int $stable = 0;
        public static final Borrow INSTANCE = new Borrow();

        private Borrow() {
            super("Borrow", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Diary;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Diary extends Router {
        public static final int $stable = 0;
        public static final Diary INSTANCE = new Diary();

        private Diary() {
            super("Diary", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Travel;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Travel extends Router {
        public static final int $stable = 0;
        public static final Travel INSTANCE = new Travel();

        private Travel() {
            super("Travel", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Setting;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Setting extends Router {
        public static final int $stable = 0;
        public static final Setting INSTANCE = new Setting();

        private Setting() {
            super("Setting", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Feedback;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Feedback extends Router {
        public static final int $stable = 0;
        public static final Feedback INSTANCE = new Feedback();

        private Feedback() {
            super(PointEvent.FEEDBACK, null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Vip;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Vip extends Router {
        public static final int $stable = 0;
        public static final Vip INSTANCE = new Vip();

        private Vip() {
            super("Vip", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Question;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Question extends Router {
        public static final int $stable = 0;
        public static final Question INSTANCE = new Question();

        private Question() {
            super("Question", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$UserDetail;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UserDetail extends Router {
        public static final int $stable = 0;
        public static final UserDetail INSTANCE = new UserDetail();

        private UserDetail() {
            super("UserDetail", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$WebDAVManage;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WebDAVManage extends Router {
        public static final int $stable = 0;
        public static final WebDAVManage INSTANCE = new WebDAVManage();

        private WebDAVManage() {
            super("WebDAVManage", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$WebDAV;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WebDAV extends Router {
        public static final int $stable = 0;
        public static final WebDAV INSTANCE = new WebDAV();

        private WebDAV() {
            super("WebDAV", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$LocalBackup;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LocalBackup extends Router {
        public static final int $stable = 0;
        public static final LocalBackup INSTANCE = new LocalBackup();

        private LocalBackup() {
            super("LocalBackup", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Wechat;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Wechat extends Router {
        public static final int $stable = 0;
        public static final Wechat INSTANCE = new Wechat();

        private Wechat() {
            super("Wechat", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$Widget;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Widget extends Router {
        public static final int $stable = 0;
        public static final Widget INSTANCE = new Widget();

        private Widget() {
            super("Widget", null);
        }
    }

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/main/Router$NotifySetting;", "Lcn/jianyun/workplan/main/Router;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotifySetting extends Router {
        public static final int $stable = 0;
        public static final NotifySetting INSTANCE = new NotifySetting();

        private NotifySetting() {
            super("NotifySetting", null);
        }
    }
}