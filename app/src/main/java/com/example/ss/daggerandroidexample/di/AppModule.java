package com.example.ss.daggerandroidexample.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by ss on 12.01.2018.
 */
@Module
public abstract class AppModule {
    @Binds
    abstract Context provideContext(Application application);

}
