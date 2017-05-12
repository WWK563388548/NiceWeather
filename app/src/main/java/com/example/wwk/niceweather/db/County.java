package com.example.wwk.niceweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wwk on 17/5/12.
 */

public class County extends DataSupport {

    private int id;
    // Record name of county
    private String countyName;
    // weather id of corresponding county
    private String weatherId;
    // Record id of cities that counties are belong to
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
