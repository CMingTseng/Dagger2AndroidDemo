package com.github.lany192.dagger2.demo.di.component;

import com.github.lany192.dagger2.demo.mvp.activity.BaseActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Subcomponent(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
})
public interface BaseActivityComponent extends AndroidInjector<BaseActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity> {

    }
}
