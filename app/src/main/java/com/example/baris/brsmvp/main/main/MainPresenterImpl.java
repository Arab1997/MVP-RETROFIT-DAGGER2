package com.example.baris.brsmvp.main.main;

import com.example.baris.brsmvp.main.models.MainModel;

import java.util.List;

import javax.inject.Inject;

public class MainPresenterImpl implements MainContract.MainPresenter, MainContract.MainIntractor.OnFinishListener {

    MainContract.MainView mainView;
    MainContract.MainIntractor mainIntractor;

    @Inject
    public MainPresenterImpl(MainContract.MainView mainView, MainContract.MainIntractor mainIntractor) {
        this.mainView = mainView;
        this.mainIntractor = mainIntractor;
    }


    @Override
    public void requestDataFromServer() {
        mainIntractor.getDataList(this);
    }


    @Override
    public void onFinished(List<MainModel> mainModelList) {
        mainView.setDataToRecyclerView(mainModelList);
    }
}
