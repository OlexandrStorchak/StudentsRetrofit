package com.example.alex.studentsretrofit;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Alex on 25.11.2016.
 */

public interface GitInterface {
    @GET("/users/{user}")
    Call<GitModels> gitUserInfo(@Path("user") String user);
}
