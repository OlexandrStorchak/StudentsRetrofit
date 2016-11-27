package com.example.alex.studentsretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Alex on 25.11.2016.
 */
public class DetailUser extends AppCompatActivity{
    TextView textName;
    TextView textMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textName = (TextView) findViewById(R.id.detail_user_name_id);
        textMail = (TextView) findViewById(R.id.detail_user_name_mail);
        textName.setText((CharSequence) getIntent().getExtras().get("name"));
        textMail.setText((CharSequence) getIntent().getExtras().get("mail"));
    }

}
