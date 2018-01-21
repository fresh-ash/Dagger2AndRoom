package com.example.ss.daggerandroidexample.db;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by ss on 19.01.2018.
 */

public interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(T t);

    @Insert
    void insert(List<T> t);

    @Update
    void update(T t);

    @Delete
    void delete(T t);
}
