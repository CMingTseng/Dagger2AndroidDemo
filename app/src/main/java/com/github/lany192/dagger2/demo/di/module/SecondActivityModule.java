package com.github.lany192.dagger2.demo.di.module;

import com.github.lany192.dagger2.demo.mvp.activity.SecondActivity;

import dagger.Module;
import dagger.Provides;

@Module(includes = BaseModule.class)
public abstract class SecondActivityModule {

    @Provides
    static String provideName() {
        return SecondActivity.class.getSimpleName();
    }
}
