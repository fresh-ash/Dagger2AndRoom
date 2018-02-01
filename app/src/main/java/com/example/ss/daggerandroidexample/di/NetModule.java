package com.example.ss.daggerandroidexample.di;

import android.app.Application;

import com.example.ss.daggerandroidexample.retrofit.ApiHttpbin;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ss on 01.02.2018.
 */
@Module
public class NetModule {

    String baseUrl = "https://httpbin.org/";

    @Provides
    @Singleton
    Cache provideOkHttpCache(Application app){
        int cacheSize = 10 * 1024 * 1024;
        Cache cache = new Cache(app.getCacheDir(), cacheSize);
        return cache;
    }

    @Provides
    @Singleton
    Gson provideGson(){
        GsonBuilder builder = new GsonBuilder();
        builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return builder.create();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(Cache cache){
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client.cache(cache);
        return client.build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(baseUrl)
                .build();
        return retrofit;
    }

    @Provides
    @Singleton
    ApiHttpbin provideApiHtttpbin(Retrofit retrofit){
        ApiHttpbin service = retrofit.create(ApiHttpbin.class);
        return service;
    }

}
