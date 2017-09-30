package com.github.lany192.dagger2.demo.mvp.model;


import com.github.lany192.dagger2.demo.mvp.contract.MainContract;

import javax.inject.Inject;

public class MainModel implements MainContract.Model {

    @Inject
    public MainModel() {

    }

    public String returnMessage() {
        return "Lany";
    }
}
