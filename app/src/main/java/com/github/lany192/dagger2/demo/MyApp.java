package com.github.lany192.dagger2.demo;

import com.github.lany192.dagger2.demo.di.component.DaggerAppComponent;
import com.lany.box.BaseDaggerApp;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.PrettyFormatStrategy;

import dagger.android.AndroidInjector;

public class MyApp extends BaseDaggerApp {

    @Override
    protected AndroidInjector<? extends MyApp> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }

    @Override
    public AndroidLogAdapter getAndroidLogAdapter() {
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
                .methodCount(1)         // (Optional) How many method line to show. Default 2
                .methodOffset(2)        // (Optional) Hides internal method calls up to offset. Default 5
//                //.logStrategy(customLog) // (Optional) Changes the log strategy to print out. Default LogCat
                .tag("CZTM")   // (Optional) Global tag for everyLogger. Default PRETTY_LOGGER
                .build();
        return new AndroidLogAdapter(formatStrategy) {
            @Override
            public boolean isLoggable(int priority, String tag) {
                return true;
            }
        };
    }
}
