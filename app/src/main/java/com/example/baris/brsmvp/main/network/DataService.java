package com.example.baris.brsmvp.main.network;

import com.example.baris.brsmvp.main.models.MainModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataService {

    @GET("getPosts.php")
    Call<List<MainModel>> getPosts();
}
