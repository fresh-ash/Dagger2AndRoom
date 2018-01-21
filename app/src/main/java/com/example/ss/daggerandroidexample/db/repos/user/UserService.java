package com.example.ss.daggerandroidexample.db.repos.user;

import android.support.annotation.NonNull;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import io.reactivex.Maybe;
import io.reactivex.Single;

/**
 * Created by ss on 19.01.2018.
 */

public class UserService implements IUserService{

    @Inject
    Executor executor;

    private UserDao userDao;

    @Inject
    public UserService(UserDao userDao){

        this.userDao = userDao;

    }

    public void insertUser(final User user){
        executor.execute(()->{userDao.insert(user);});
    }

    public Single<User> getUserById(Long id){
        return userDao.getUserbyId(id);
    }

}
