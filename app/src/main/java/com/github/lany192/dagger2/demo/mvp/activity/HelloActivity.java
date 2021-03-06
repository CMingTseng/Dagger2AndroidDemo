package com.github.lany192.dagger2.demo.mvp.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.github.lany192.dagger2.demo.R;
import com.github.lany192.dagger2.demo.entity.Student;
import com.lany.box.activity.BaseDaggerActivity;

import javax.inject.Inject;

import butterknife.BindView;

public class HelloActivity extends BaseDaggerActivity {
    @Inject
    String className;
    @Inject
    Student student;

    @Inject
    int random;

    @BindView(R.id.my_text_view)
    TextView showText;

    public static void start(Context ctx) {
        Intent i = new Intent(ctx, HelloActivity.class);
        ctx.startActivity(i);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_hello;
    }

    @Override
    protected void init(Bundle bundle) {
        showText.setText(className + "    \n" + student.toString() + "\n随机数:" + random);
    }
}
