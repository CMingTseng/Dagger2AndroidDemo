package com.github.lany192.dagger2.demo.mvp.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.github.lany192.dagger2.demo.R;
import com.github.lany192.dagger2.demo.entity.Student;

import javax.inject.Inject;

public class HelloActivity extends BaseActivity {
    @Inject
    String className;
    @Inject
    Student student;

    @Inject
    int random;


    TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        showText = (TextView) findViewById(R.id.my_text_view);
        showText.setText(className + "    \n" + student.toString() + "\n随机数:" + random);
    }
}
