package com.example.parstagram;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("User")
public class User extends ParseObject {

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";

    public void setUsername(String username){
        put(USERNAME, username);
    }
    public void setPassword(String password){
        put(PASSWORD, password);
    }
    public void setEmail(String email){
        put(EMAIL, email);
    }


}
