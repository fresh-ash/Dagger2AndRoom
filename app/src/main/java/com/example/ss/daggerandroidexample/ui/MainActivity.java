package com.example.ss.daggerandroidexample.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;

import com.example.ss.daggerandroidexample.R;
import com.example.ss.daggerandroidexample.databinding.ActivityMainBinding;

import com.example.ss.daggerandroidexample.dbinding.ErrorMessage;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.Single;

public class MainActivity extends DaggerAppCompatActivity implements MainView {

    @Inject
    MainPresenter mainPresenter;
    @Inject
    ErrorMessage message;
    @Inject
    InteractiveMain interactiveMain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setErrMess(message);
    }

    @Override
    public void onMainLoaded() {

    }
}
