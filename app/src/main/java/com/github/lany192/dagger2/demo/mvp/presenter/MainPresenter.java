package com.github.lany192.dagger2.demo.mvp.presenter;

import com.github.lany192.dagger2.demo.mvp.activity.MainActivity;
import com.github.lany192.dagger2.demo.mvp.contract.MainContract;
import com.github.lany192.dagger2.demo.mvp.model.MainModel;

import javax.inject.Inject;

public class MainPresenter implements MainContract.Presenter {
    private final MainActivity view;
    private final MainModel model;

    @Inject
    public MainPresenter(MainActivity view, MainModel model) {
        this.view = view;
        this.model = model;
    }

    public void requestHttp() {
        view.onGetMessage(model.returnMessage());
    }
}
