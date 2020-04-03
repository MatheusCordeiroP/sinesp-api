package com.kiraitami.placassinesp.network;

import com.kiraitami.placassinesp.models.BaseResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EndPoint {

    @GET("veiculo")
    public Call<BaseResult> getPlaca(
            @Query("token") String token,
            @Query("placa") String placa,
            @Query("format") String format
            );

}
