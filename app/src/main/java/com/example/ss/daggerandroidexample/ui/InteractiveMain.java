package com.example.ss.daggerandroidexample.ui;

import javax.inject.Inject;

/**
 * Created by ss on 16.01.2018.
 */

public class InteractiveMain {

    private String name;
    private String pass;

    @Inject
    public InteractiveMain(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }




}
