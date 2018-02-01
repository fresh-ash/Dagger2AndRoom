package com.example.ss.daggerandroidexample.di;

import android.app.Application;

import com.example.ss.daggerandroidexample.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by ss on 12.01.2018.
 */
@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityBuilder.class, NetModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication>{
    void inject(App app);

    @Override
    void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}
