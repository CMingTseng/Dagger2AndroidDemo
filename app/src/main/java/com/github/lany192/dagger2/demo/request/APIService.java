package com.github.lany192.dagger2.demo.request;

import com.github.lany192.dagger2.demo.entity.AddressBean;

import retrofit2.http.GET;
import rx.Observable;

public interface APIService {

    @GET("city.json")
    Observable<AddressBean> getCities();
}