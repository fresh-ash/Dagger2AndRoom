package com.example.ss.daggerandroidexample.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.ss.daggerandroidexample.R;
import com.example.ss.daggerandroidexample.data.ResponseIP;
import com.example.ss.daggerandroidexample.databinding.ActivityMainBinding;

import com.example.ss.daggerandroidexample.dbinding.ErrorMessage;
import com.example.ss.daggerandroidexample.retrofit.ApiHttpbin;

import java.io.IOException;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends DaggerAppCompatActivity implements MainView {

    @Inject
    MainPresenter mainPresenter;
    @Inject
    ErrorMessage message;
    @Inject
    InteractiveMain interactiveMain;
    @Inject
    ApiHttpbin apiHttpbin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setErrMess(message);
        TextView textView = (TextView) findViewById(R.id.login_err_mess);
        Call<ResponseIP> responseIPCall = apiHttpbin.getIP();
        responseIPCall.enqueue(new Callback<ResponseIP>() {
            @Override
            public void onResponse(Call<ResponseIP> call, Response<ResponseIP> response) {
               textView.setText(response.body().getIp());


            }

            @Override
            public void onFailure(Call<ResponseIP> call, Throwable t) {

            }
        });

    }

    @Override
    public void onMainLoaded() {

    }
}
