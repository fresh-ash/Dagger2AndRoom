package com.example.ss.daggerandroidexample.service;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by ss on 13.01.2018.
 */

public class NetService {

    @Inject
    public NetService(){}

    public void printLog(){
        Log.i("INFO", "Hello");
    }

}
