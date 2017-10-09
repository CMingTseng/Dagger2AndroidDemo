package com.github.lany192.dagger2.demo.di.module;


import com.github.lany192.dagger2.demo.di.component.BaseActivityComponent;
import com.github.lany192.dagger2.demo.di.scope.ActivityScope;
import com.github.lany192.dagger2.demo.mvp.activity.HelloActivity;
import com.github.lany192.dagger2.demo.mvp.activity.LoginActivity;
import com.github.lany192.dagger2.demo.mvp.activity.MainActivity;
import com.github.lany192.dagger2.demo.mvp.activity.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = {
        BaseActivityComponent.class
})
public abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivitytInjector();

    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity contributeSecondActivityInjector();

    @ContributesAndroidInjector(modules = HelloActivityModule.class)
    abstract HelloActivity contributeHelloActivityInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = BaseModule.class)
    abstract LoginActivity contributeLoginActivitytInjector();
}
