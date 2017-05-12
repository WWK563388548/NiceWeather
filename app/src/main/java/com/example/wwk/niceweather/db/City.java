package com.example.wwk.niceweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wwk on 17/5/12.
 */

public class City extends DataSupport {
    private int id;
    // Record name of city
    private String cityName;
    // Record code of city
    private int cityCode;
    // Record id of provinces that cities are belong to
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
