package com.github.lany192.dagger2.demo;

import com.github.lany192.dagger2.demo.di.component.DaggerMyAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MyApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMyAppComponent.builder().create(this);
    }
}
