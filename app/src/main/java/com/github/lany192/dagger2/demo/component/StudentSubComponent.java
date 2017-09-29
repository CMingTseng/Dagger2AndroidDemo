package com.github.lany192.dagger2.demo.component;

import com.github.lany192.dagger2.demo.StudentActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface StudentSubComponent extends AndroidInjector<StudentActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<StudentActivity> {

    }
}
