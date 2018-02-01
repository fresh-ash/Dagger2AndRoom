package com.example.ss.daggerandroidexample.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ss on 01.02.2018.
 */

public class ResponseIP {

    @SerializedName("origin")
    public String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


}
