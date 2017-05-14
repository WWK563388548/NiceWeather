package com.example.wwk.niceweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wwk on 17/5/14.
 */

public class Basic {

    // Using @SerializedName to make Json and java build relationship
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
