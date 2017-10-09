package com.github.lany192.dagger2.demo.mvp.presenter;

import com.github.lany192.dagger2.demo.mvp.contract.LoginContract;
import com.github.lany192.dagger2.demo.mvp.model.LoginModel;
import com.github.lany192.dagger2.demo.mvp.model.MainModel;

import javax.inject.Inject;

public class LoginPresenter implements LoginContract.Presenter {
    private final LoginModel model;

    @Inject
    public LoginPresenter(LoginModel model) {
        this.model = model;
    }

    @Override
    public String showToast() {
        return "哈哈，我是登录";
    }

    @Override
    public void login(String email, String password) {

    }
}
