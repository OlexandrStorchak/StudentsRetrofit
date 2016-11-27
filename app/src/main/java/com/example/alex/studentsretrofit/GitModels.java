package com.example.alex.studentsretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GitModels {

        @SerializedName("login")
        @Expose
        private String login;
        @SerializedName("avatar_url")
        @Expose
        private String avatarUrl;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("email")
        @Expose
        private String email;


        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }


        public String getAvatarUrl() {
            return avatarUrl;
        }


        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }


        public String getEmail() {
            return email;
        }


        public void setEmail(String email) {
            this.email = email;
        }

    }

