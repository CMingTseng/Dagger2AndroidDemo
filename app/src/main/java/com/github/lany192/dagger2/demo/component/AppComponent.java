package com.github.lany192.dagger2.demo.component;

import com.github.lany192.dagger2.demo.MyApp;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
//        MainModule.class,
//        FruitModule.class,
//        DrinkModule.class,
//        CoffeeModule.class,
//        BookModule.class
})
public interface AppComponent extends AndroidInjector<MyApp> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApp> {

    }
}