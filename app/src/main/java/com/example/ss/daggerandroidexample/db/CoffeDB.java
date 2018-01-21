package com.example.ss.daggerandroidexample.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.ss.daggerandroidexample.db.repos.user.User;
import com.example.ss.daggerandroidexample.db.repos.user.UserDao;

/**
 * Created by ss on 19.01.2018.
 */
@Database(entities = {User.class}, version = 1)
public abstract class CoffeDB extends RoomDatabase {

    public abstract UserDao getUserDao();
}
