package com.github.lany192.dagger2.demo.mvp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.github.lany192.dagger2.demo.R;

import javax.inject.Inject;

public class SecondActivity extends BaseActivity {

    @Inject
    String className;

    @Inject
    int random;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = (TextView) findViewById(R.id.tv_content);
        tv.setText(className + "    \n随机数:" + random);
    }
}
