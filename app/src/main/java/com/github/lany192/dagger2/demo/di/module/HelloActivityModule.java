package com.github.lany192.dagger2.demo.di.module;

import com.github.lany192.dagger2.demo.entity.Student;
import com.github.lany192.dagger2.demo.mvp.activity.HelloActivity;

import dagger.Module;
import dagger.Provides;


@Module(includes = BaseModule.class)
public abstract class HelloActivityModule{

    @Provides
    static String provideName() {
        return HelloActivity.class.getSimpleName();
    }

    @Provides
    static Student provideStudent() {
        return new Student("李四", 20);
    }

}
