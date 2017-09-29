package com.github.lany192.dagger2.demo;

import android.os.Bundle;

import dagger.android.support.DaggerAppCompatActivity;

public class StudentActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }

}
