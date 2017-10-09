package com.github.lany192.dagger2.demo.mvp.model;


import com.github.lany192.dagger2.demo.mvp.contract.LoginContract;

import javax.inject.Inject;

public class LoginModel implements LoginContract.Model {

    @Inject
    public LoginModel() {

    }

    public String returnMessage() {
        return "Lany";
    }
}
