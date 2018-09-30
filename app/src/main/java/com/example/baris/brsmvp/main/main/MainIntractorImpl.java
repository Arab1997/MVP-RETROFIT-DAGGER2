package com.example.baris.brsmvp.main.main;

import com.example.baris.brsmvp.main.models.MainModel;
import com.example.baris.brsmvp.main.network.DataService;
import com.example.baris.brsmvp.main.network.RetrofitInstance;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainIntractorImpl implements MainContract.MainIntractor {

    DataService dataService;

    @Inject
    public MainIntractorImpl(DataService dataService) {
        this.dataService = dataService;
    }


    @Override
    public void getDataList(final OnFinishListener onFinishListener) {
        // dataService = RetrofitInstance.getRetrofitInstance().create(DataService.class);
        dataService.getPosts().enqueue(new Callback<List<MainModel>>() {
            @Override
            public void onResponse(Call<List<MainModel>> call, Response<List<MainModel>> response) {
                onFinishListener.onFinished(response.body());
            }

            @Override
            public void onFailure(Call<List<MainModel>> call, Throwable t) {

            }
        });
    }
}
