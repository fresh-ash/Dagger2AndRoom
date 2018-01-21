package com.example.ss.daggerandroidexample.ui;

import com.example.ss.daggerandroidexample.service.ApiService;
import com.example.ss.daggerandroidexample.service.NetService;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ss on 12.01.2018.
 */
@Module
public abstract class MainActivityModule {

    @Provides
    static MainPresenter provideMainPresenter(MainView mainView, ApiService apiService, NetService netService){
        return new MainPresenterImpl(mainView, apiService, netService);
    }

    @Binds
    abstract MainView provideMainView(MainActivity mainActivity);
}
