package com.example.ss.daggerandroidexample;

import android.app.Activity;
import android.app.Application;

import com.example.ss.daggerandroidexample.di.AppComponent;
import com.example.ss.daggerandroidexample.di.DaggerAppComponent;


import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by ss on 12.01.2018.
 */

public class App extends DaggerApplication implements HasActivityInjector {


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
