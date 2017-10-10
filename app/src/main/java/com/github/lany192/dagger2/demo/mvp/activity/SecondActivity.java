package com.github.lany192.dagger2.demo.mvp.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.github.lany192.dagger2.demo.R;
import com.lany.box.activity.BaseDaggerActivity;

import javax.inject.Inject;

import butterknife.BindView;

public class SecondActivity extends BaseDaggerActivity {

    @Inject
    String className;

    @Inject
    int random;

    @BindView(R.id.tv_content)
    TextView tv;
    public static void start(Context ctx) {
        Intent i = new Intent(ctx, SecondActivity.class);
        ctx.startActivity(i);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_second;
    }

    @Override
    protected void init(Bundle bundle) {
        tv.setText(className + "    \n随机数:" + random);
    }
}
