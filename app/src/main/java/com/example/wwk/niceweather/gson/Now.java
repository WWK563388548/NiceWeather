package com.example.wwk.niceweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wwk on 17/5/14.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
