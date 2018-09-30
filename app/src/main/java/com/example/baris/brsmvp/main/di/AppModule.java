package com.example.baris.brsmvp.main.di;

import android.app.Application;
import android.content.Context;

import com.example.baris.brsmvp.main.network.DataService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Module
class AppModule {

    private String baseUrl = "http://whichoneapp.site/whichone/";
    //https://appapi.mottojoy.com


    @Provides
    DataService dataService() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        return new retrofit2.Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build().create(DataService.class);
    }

}
