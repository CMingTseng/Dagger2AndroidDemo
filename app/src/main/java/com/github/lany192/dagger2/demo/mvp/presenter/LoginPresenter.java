package com.github.lany192.dagger2.demo.mvp.presenter;

import com.github.lany192.dagger2.demo.mvp.contract.LoginContract;
import com.github.lany192.dagger2.demo.mvp.model.MainModel;

import javax.inject.Inject;

public class LoginPresenter implements LoginContract.Presenter {
    private final MainModel model;

    @Inject
    public LoginPresenter(MainModel model) {
        this.model = model;
    }

    @Override
    public String showToast() {
        return "哈哈，我是登录";
    }
}
