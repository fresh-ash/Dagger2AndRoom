package com.example.ss.daggerandroidexample.db.repos.user;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.ss.daggerandroidexample.db.BaseDao;

import io.reactivex.Maybe;
import io.reactivex.Single;

/**
 * Created by ss on 19.01.2018.
 */
@Dao
public interface UserDao extends BaseDao<User>{

    @Query("SELECT * FROM users")
    Maybe<User> getAllUsers();

    @Query("SELECT * FROM users WHERE id = :id")
    Single<User> getUserbyId(Long id);

}
