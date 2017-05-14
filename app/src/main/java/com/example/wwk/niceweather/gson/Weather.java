package com.example.wwk.niceweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wwk on 17/5/14.
 */

public class Weather {

    // Returned data will include data of status
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    // There is an Array in the daily_forecast
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
