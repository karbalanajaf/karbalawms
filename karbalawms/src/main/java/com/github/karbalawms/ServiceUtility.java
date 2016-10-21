package com.github.karbalawms;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ServiceUtility {
    public static Retrofit getRetrofit() {
        return new Retrofit.Builder().baseUrl(ConfigMap.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
