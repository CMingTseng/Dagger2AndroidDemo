package com.github.lany192.dagger2.demo.di.component;


import com.github.lany192.dagger2.demo.MyApp;
import com.github.lany192.dagger2.demo.di.module.ActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        ActivityModule.class,
})
public interface MyAppComponent extends AndroidInjector<MyApp> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApp> {

    }


}