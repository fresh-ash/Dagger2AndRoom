package com.example.ss.daggerandroidexample.retrofit;

import com.example.ss.daggerandroidexample.data.ResponseIP;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ss on 02.02.2018.
 */

public interface ApiHttpbin {

    @GET("/ip")
    Call<ResponseIP> getIP();
}
