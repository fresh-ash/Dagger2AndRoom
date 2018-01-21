package com.example.ss.daggerandroidexample.di;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.ss.daggerandroidexample.db.CoffeDB;
import com.example.ss.daggerandroidexample.db.repos.user.IUserService;
import com.example.ss.daggerandroidexample.db.repos.user.UserDao;
import com.example.ss.daggerandroidexample.db.repos.user.UserService;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ss on 19.01.2018.
 */
@Module
public class RoomModule {

    private CoffeDB db;


   /* public RoomModule(Application application){
        db = Room.databaseBuilder(application, CoffeDB.class, "coffe-db").build();
    }*/

    @Singleton
    @Provides
    CoffeDB providesRoomDB(Context context){
        return db = Room.databaseBuilder(context, CoffeDB.class, "coffe-db").build();
    }

    @Singleton
    @Provides
    UserDao providesUserDao(CoffeDB coffeDB){
        return db.getUserDao();
    }

    @Singleton
    @Provides
    IUserService providesUserService(UserDao userDao){
        return new UserService(userDao);
    }

    @Singleton
    @Provides
    public Executor getExecutor(){
        return  Executors.newFixedThreadPool(2);
    }


}
