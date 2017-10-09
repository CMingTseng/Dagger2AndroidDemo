package com.github.lany192.dagger2.demo.mvp.activity;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.github.lany192.dagger2.demo.R;
import com.github.lany192.dagger2.demo.mvp.contract.LoginContract;
import com.github.lany192.dagger2.demo.mvp.presenter.LoginPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.View {
    @BindView(R.id.haha)
    TextView showText;
    @BindView(R.id.editText)
    EditText emailEdit;
    @BindView(R.id.editText2)
    EditText passwordEdit;
    @BindView(R.id.button)
    Button loginBtn;

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

    @OnClick(R.id.button)
    public void loginClicked() {
        String email = emailEdit.getText().toString();
        String password = passwordEdit.getText().toString();
        presenter.login(email, password);
    }

    @Override
    public void showOkToast() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailToast() {
        Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showEmailError() {
        Toast.makeText(this, "邮箱错误", Toast.LENGTH_SHORT).show();
    }
}
