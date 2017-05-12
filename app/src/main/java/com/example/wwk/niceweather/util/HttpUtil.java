package com.example.wwk.niceweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wwk on 17/5/12.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
       // Interact with database for traverse data of Province, City and County
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
