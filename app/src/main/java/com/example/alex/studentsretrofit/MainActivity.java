package com.example.alex.studentsretrofit;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerStudents;
    RecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerStudents = (RecyclerView) findViewById(R.id.student_recycler);

        ArrayList<StudentsModel> studentsModels = new ArrayList<>();
        for (int i = 0; i<= Data.studentsName.length-3; i=i+3) {

            studentsModels.add(new StudentsModel(Data.studentsName[i],
                    Data.studentsName[i+1],
                    Data.studentsName[i+2]));

        }
//        for (int i=0;i<studentsModels.size();i++){
//            Log.d("log", "onCreate: "+ studentsModels.get(i).getName());
//        }

        adapter = new RecyclerAdapter(studentsModels,getApplicationContext());
        recyclerStudents.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerStudents.setAdapter(adapter);
    }
}
