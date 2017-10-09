package com.github.lany192.dagger2.demo.mvp.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.github.lany192.dagger2.demo.R;
import com.github.lany192.dagger2.demo.entity.Student;
import com.github.lany192.dagger2.demo.mvp.contract.MainContract;
import com.github.lany192.dagger2.demo.mvp.presenter.MainPresenter;

import javax.inject.Inject;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements MainContract.View {
    @Inject
    String className;
    @Inject
    SharedPreferences sp;
    @Inject
    MainPresenter presenter;
    @Inject
    Student s1;
    @Inject
    Student s2;

    @BindView(R.id.tv_content)
    TextView tvContent;

    public static void start(Context ctx) {
        Intent i = new Intent(ctx, MainActivity.class);
        ctx.startActivity(i);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        tvContent.setText(className + "\n" +
                s2.toString() + "\n" +
                s1.toString());
    }

    public void gotoSecond(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void gotoHello(View view) {
        startActivity(new Intent(this, HelloActivity.class));
    }

    public void requestHttp(View view) {
        presenter.requestHttp();
    }

    public void onGetMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void gotoLogin(View view) {
        LoginActivity.start(this);
    }

}
