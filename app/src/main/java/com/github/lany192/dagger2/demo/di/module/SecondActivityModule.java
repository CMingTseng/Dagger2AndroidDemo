package com.github.lany192.dagger2.demo.di.module;

import com.github.lany192.dagger2.demo.mvp.activity.SecondActivity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class SecondActivityModule {

    @Provides
    static String provideName() {
        return SecondActivity.class.getName();
    }
}
