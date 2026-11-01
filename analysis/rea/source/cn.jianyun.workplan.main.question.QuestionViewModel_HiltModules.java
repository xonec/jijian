package cn.jianyun.workplan.main.question;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* JADX INFO: loaded from: classes2.dex */
public final class QuestionViewModel_HiltModules {
    private QuestionViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("cn.jianyun.workplan.main.question.QuestionViewModel")
        public abstract ViewModel binds(QuestionViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "cn.jianyun.workplan.main.question.QuestionViewModel";
        }

        private KeyModule() {
        }
    }
}