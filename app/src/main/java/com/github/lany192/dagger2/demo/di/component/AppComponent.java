package com.github.lany192.dagger2.demo.di.component;


import com.github.lany192.dagger2.demo.MyApp;
import com.github.lany192.dagger2.demo.di.module.ActivityModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        ActivityModule.class,
})
public interface AppComponent extends AndroidInjector<MyApp> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApp> {

    }


}