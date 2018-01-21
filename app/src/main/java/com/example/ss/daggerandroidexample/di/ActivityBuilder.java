package com.example.ss.daggerandroidexample.di;

import com.example.ss.daggerandroidexample.ui.MainActivity;
import com.example.ss.daggerandroidexample.ui.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by ss on 12.01.2018.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
}
