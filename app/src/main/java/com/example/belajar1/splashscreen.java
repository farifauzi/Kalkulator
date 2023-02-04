package com.example.belajar1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {
    // creating constant keys for shared preferences.
    public static final String SHARED_PREFS = "shared_prefs";

    // key for storing email.
    public static final String EMAIL_KEY = "email_key";

    // key for storing password.
    public static final String PASSWORD_KEY = "password_key";

    // variable for shared preferences.
    SharedPreferences sharedpreferences;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        // getting the data which is stored in shared preferences.
        sharedpreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        // in shared prefs inside het string method
        // we are passing key value as EMAIL_KEY and
        // default value is
        // set to null if not present.
        email = sharedpreferences.getString(EMAIL_KEY, null);
        password = sharedpreferences.getString(PASSWORD_KEY, null);
        if (email != null && password != null) {
            Intent i = new Intent(splashscreen.this, MainActivity2.class);
            startActivity(i);
        }else{
            Intent i = new Intent(splashscreen.this,MainActivity.class);
            startActivity(i);
        }
        finish();
    }
}