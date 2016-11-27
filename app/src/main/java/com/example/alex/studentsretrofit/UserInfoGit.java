package com.example.alex.studentsretrofit;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by Alex on 25.11.2016.
 */

public class UserInfoGit {



void getInfo(String git, final Context context) {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    GitInterface service = retrofit.create(GitInterface.class);

    Call<GitModels> gitModelsCall = service.gitUserInfo(git);
    gitModelsCall.enqueue(new Callback<GitModels>() {
        @Override
        public void onResponse(Response<GitModels> response, Retrofit retrofit) {
            String name=response.body().getName();
            String mail=response.body().getEmail();
            Log.d("log", "onResponse: "+name);
            Intent intent = new Intent(context,DetailUser.class);
            intent.putExtra("name",name);
            intent.putExtra("mail",mail);
            context.startActivity(intent);

        }

        @Override
        public void onFailure(Throwable t) {

        }
    });


}



}
