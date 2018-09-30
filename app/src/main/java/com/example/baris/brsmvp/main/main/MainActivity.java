package com.example.baris.brsmvp.main.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.baris.brsmvp.R;
import com.example.baris.brsmvp.main.models.MainModel;

import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements MainContract.MainView {

    @Inject
    MainContract.MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainPresenter.requestDataFromServer();

    }

    @Override
    public void setDataToRecyclerView(List<MainModel> mainModelList) {
        for (MainModel mainModel : mainModelList)
            Log.i("SERVIS", mainModel.getPostUserName().toString());
    }
}
