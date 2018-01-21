package com.example.ss.daggerandroidexample.ui;

import com.example.ss.daggerandroidexample.service.ApiService;
import com.example.ss.daggerandroidexample.service.NetService;

import javax.inject.Inject;

/**
 * Created by ss on 12.01.2018.
 */

public class MainPresenterImpl implements MainPresenter {

    MainView mainView;
    ApiService apiService;
    NetService netService;

    @Inject
    public MainPresenterImpl(MainView mainView, ApiService apiService, NetService netService){
        this.mainView = mainView;
        this.apiService = apiService;
        this.netService = netService;
    }


    @Override
    public void loadMain() {
        netService.printLog();
    }
}
