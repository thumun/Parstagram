package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3y2Z4i0A9UBAXdRhbCASG3EK7pSb8vhzc0mcDG5R")
                .clientKey("17jq5ABRlkGrQK7hALODJY3KzOAbNmtzzIk9J5mQ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
