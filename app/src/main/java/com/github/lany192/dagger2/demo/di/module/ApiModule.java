package com.github.lany192.dagger2.demo.di.module;

import android.util.Log;

import com.github.lany192.dagger2.demo.request.APIService;
import com.github.lany192.dagger2.demo.request.UserService;
import com.lany.box.interceptor.HttpLogInterceptor;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiModule {
    private final String TAG="ApiModule";
    private final String BASE_URL = "https://lany192.github.io/json/";

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        HttpLogInterceptor logInterceptor = new HttpLogInterceptor();
        logInterceptor.setLevel(HttpLogInterceptor.Level.BODY);

        return new OkHttpClient
                .Builder()
                .addInterceptor(logInterceptor)
                .retryOnConnectionFailure(true)
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .client(client)
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    public APIService provideAPIService(Retrofit retrofit) {
        Log.i(TAG, "provideAPIService: ------------------------");
        return retrofit.create(APIService.class);
    }


    @Provides
    @Singleton
    public UserService provideUserService(Retrofit retrofit) {
        Log.i(TAG, "provideUserService: ------------------------");
        return retrofit.create(UserService.class);
    }
}