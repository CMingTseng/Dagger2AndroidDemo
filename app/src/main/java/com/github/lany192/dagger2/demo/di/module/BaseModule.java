package com.github.lany192.dagger2.demo.di.module;

import java.util.Random;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class BaseModule {

    @Provides
    static int provideId() {
        return new Random().nextInt();
    }
}
