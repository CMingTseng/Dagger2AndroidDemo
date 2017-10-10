package com.github.lany192.dagger2.demo.mvp.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.github.lany192.dagger2.demo.R;
import com.github.lany192.dagger2.demo.entity.AddressBean;
import com.github.lany192.dagger2.demo.mvp.contract.LoginContract;
import com.github.lany192.dagger2.demo.mvp.presenter.LoginPresenter;
import com.github.lany192.dagger2.demo.request.APIService;
import com.lany.box.activity.BaseDaggerActivity;
import com.lany.box.utils.RxUtils;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import rx.Subscriber;

public class LoginActivity extends BaseDaggerActivity implements LoginContract.View {
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

    @Inject
    APIService mAPIService;

    public static void start(Context ctx) {
        Intent i = new Intent(ctx, LoginActivity.class);
        ctx.startActivity(i);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void init(Bundle bundle) {
        showText.setText(presenter.showToast() + "   " + number + "  " + mAPIService);
    }

    @OnClick(R.id.button)
    public void loginClicked() {
        String email = emailEdit.getText().toString();
        String password = passwordEdit.getText().toString();
        presenter.login(email, password);

        mAPIService.getCities()
                .compose(RxUtils.<AddressBean>applySchedulers())
                .subscribe(new Subscriber<AddressBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(AddressBean s) {
                        Log.i(TAG, "onNext: " + s);
                    }
                });
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
