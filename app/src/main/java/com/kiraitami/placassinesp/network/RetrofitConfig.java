package com.kiraitami.placassinesp.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    public static Retrofit retrofit = new Retrofit.Builder().
            addConverterFactory(GsonConverterFactory.create()).
            baseUrl("https://api.directdigital.com.br/sinesp/").build();

    public static EndPoint getEndPoint(){
        return retrofit.create(EndPoint.class);
    }

}
