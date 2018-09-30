package com.example.baris.brsmvp.main.di;

import com.example.baris.brsmvp.main.di.module.MainActivityModule;
import com.example.baris.brsmvp.main.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    /*@ContributesAndroidInjector(modules = {DetailActivityModule.class, DetailFragmentProvider.class})
    abstract DetailActivity bindDetailActivity();*/

}
