package com.example.alex.studentsretrofit;

/**
 * Created by Alex on 25.11.2016.
 */

public class StudentsModel {
    String name;
    String google;
    String git;

    public StudentsModel(String name, String google, String git) {
        this.name = name;
        this.google = google;
        this.git = git;
    }

    public String getName() {
        return name;
    }

    public String getGoogle() {
        return google;
    }

    public String getGit() {
        return git;
    }
}
