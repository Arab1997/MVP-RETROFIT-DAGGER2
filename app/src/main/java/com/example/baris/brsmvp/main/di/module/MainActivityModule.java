package com.example.baris.brsmvp.main.di.module;

import com.example.baris.brsmvp.main.main.MainActivity;
import com.example.baris.brsmvp.main.main.MainContract;
import com.example.baris.brsmvp.main.main.MainIntractorImpl;
import com.example.baris.brsmvp.main.main.MainPresenterImpl;
import com.example.baris.brsmvp.main.network.DataService;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;


@Module
public abstract class MainActivityModule {

    @Provides
    static MainContract.MainPresenter provideMainPresenter(MainContract.MainView mainView, MainContract.MainIntractor mainIntractor) {
        return new MainPresenterImpl(mainView, mainIntractor);
    }

    @Provides
    static MainContract.MainIntractor provideMainIntractor(DataService dataService) {
        return new MainIntractorImpl(dataService);
    }

    @Binds
    abstract MainContract.MainView provideMainView(MainActivity mainActivity);
}
