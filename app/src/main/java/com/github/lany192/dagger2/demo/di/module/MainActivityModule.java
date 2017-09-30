package com.github.lany192.dagger2.demo.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.github.lany192.dagger2.demo.di.scope.ActivityScope;
import com.github.lany192.dagger2.demo.entity.Student;
import com.github.lany192.dagger2.demo.mvp.activity.MainActivity;

import dagger.Module;
import dagger.Provides;


@Module
public abstract class MainActivityModule {

    @Provides
    static String provideName() {
        return MainActivity.class.getSimpleName();
    }

    @Provides
    static SharedPreferences provideSp(MainActivity activity) {
        return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
    }

    @Provides
    @ActivityScope
    static Student provideStudent() {
        return new Student("张三", 16);
    }

}
