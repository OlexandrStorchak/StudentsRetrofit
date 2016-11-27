package com.example.alex.studentsretrofit;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.Inflater;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by Alex on 25.11.2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolderOwn>  {
    private ArrayList<StudentsModel> list;
    private Context context;
    LayoutInflater inflater;

    public RecyclerAdapter(ArrayList<StudentsModel> list, Context context) {
        this.list = list;
        this.inflater=LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public ViewHolderOwn onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.student_row,parent,false);

        return new ViewHolderOwn(v);
    }

    @Override
    public void onBindViewHolder(ViewHolderOwn holder, int position) {
        TextView textName = (TextView) holder.itemView.findViewById(R.id.student_row_name_id);
        textName.setText(list.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolderOwn extends RecyclerView.ViewHolder implements RecyclerView.OnClickListener {
        TextView textName;
        public ViewHolderOwn(View itemView) {
            super(itemView);
            textName = (TextView) itemView.findViewById(R.id.student_row_name_id);
            textName.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (!list.get(getAdapterPosition()).getGit().isEmpty()) {
                new UserInfoGit().getInfo(list.get(getAdapterPosition()).getGit(), context);
            } else {
                Toast.makeText(context,"Empty git link",Toast.LENGTH_SHORT).show();
            }


//            Log.d("log", "onClick: " + list.get(getAdapterPosition()).getName());
//            Log.d("log", "onClick: "+list.get(getAdapterPosition()).getGoogle());
//            Log.d("log", "onClick: "+list.get(getAdapterPosition()).getGit());

        }
    }
}
