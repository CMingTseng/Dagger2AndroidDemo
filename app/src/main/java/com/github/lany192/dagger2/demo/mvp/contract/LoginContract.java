package com.github.lany192.dagger2.demo.mvp.contract;


public interface LoginContract {

    interface View {
        void showOkToast();

        void showFailToast();

        void showEmailError();
    }

    interface Presenter {
        String showToast();

        void login(String email, String password);
    }

    interface Model {

    }
}
