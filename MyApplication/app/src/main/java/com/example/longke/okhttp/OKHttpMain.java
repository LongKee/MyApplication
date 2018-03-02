package com.example.longke.okhttp;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by longke on 2018/3/2.
 */

public class OKHttpMain {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        OKHttpMain okHttpMain = new OKHttpMain();
        String response = okHttpMain.run("https://raw.github.com/square/okhttp/master/README.md");
        System.out.println(response);
    }
}
