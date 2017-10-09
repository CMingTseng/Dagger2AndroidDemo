package com.github.lany192.dagger2.demo.mvp.activity;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

import com.github.lany192.dagger2.demo.R;
import com.github.lany192.dagger2.demo.mvp.presenter.LoginPresenter;

import javax.inject.Inject;

import butterknife.BindView;

public class LoginActivity extends BaseActivity {
    @BindView(R.id.haha)
    TextView showText;
    @Inject
    LoginPresenter presenter;
    @Inject
    int number;

    public static void start(Context ctx) {
        Intent i = new Intent(ctx, LoginActivity.class);
        ctx.startActivity(i);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void init() {
        showText.setText(presenter.showToast() + "   " + number);

    }
}
