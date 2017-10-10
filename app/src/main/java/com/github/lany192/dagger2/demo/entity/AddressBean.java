package com.github.lany192.dagger2.demo.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

@Data
public class AddressBean {

    @SerializedName("citylist")
    private List<ProvinceInfo> provinceLists;

    @Data
    public class ProvinceInfo {
        @SerializedName("p")
        private String provinceName;
        @SerializedName("pid")
        private String provinceId;
        @SerializedName("c")
        private List<CityInfo> cityLists;
    }

    @Data
    public class CityInfo {
        @SerializedName("n")
        private String cityName;
        @SerializedName("nid")
        private String cityId;
        @SerializedName("a")
        private List<AreaInfo> areaLists;
    }

    @Data
    public class AreaInfo {
        @SerializedName("s")
        private String areaName;
        @SerializedName("sid")
        private String areaId;
    }
}
