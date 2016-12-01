package com.example.alex.studentsretrofit;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


/**
 * Created by Alex on 25.11.2016.
 */
public class DetailUser extends AppCompatActivity{

    TextView textMail;
    ImageView imageAvatar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textMail = (TextView) findViewById(R.id.detail_user_name_mail);
        imageAvatar = (ImageView) findViewById(R.id.detail_user_avatar);

        textMail.setText((CharSequence) getIntent().getExtras().get("mail"));
        String avatarUrl = String.valueOf(getIntent().getExtras().get("avatar"));
        setTitle((CharSequence) getIntent().getExtras().get("name"));


        Picasso.with(getApplicationContext())
                .load(avatarUrl)
                .into(imageAvatar);


    }

}
