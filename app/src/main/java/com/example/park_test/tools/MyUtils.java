package com.example.park_test.tools;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MyUtils {

    public static String GET (String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response re = client.newCall(request).execute();
        return re.body().string();
    }

}
