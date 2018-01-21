package com.example.ss.daggerandroidexample.dbinding;

import javax.inject.Inject;

/**
 * Created by ss on 14.01.2018.
 */

public class ErrorMessage {

    private String mess;

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    @Inject
    public ErrorMessage(){

    }



}
