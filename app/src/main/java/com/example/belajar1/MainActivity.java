package com.example.belajar1;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //list komponen
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;
    // creating constant keys for shared preferences.
    public static final String SHARED_PREFS = "shared_prefs";

    // key for storing email.
    public static final String EMAIL_KEY = "email_key";

    // key for storing password.
    public static final String PASSWORD_KEY = "password_key";

    // variable for shared preferences.
    SharedPreferences sharedpreferences;
    String email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ini bagaikan psvm
        //konekkan semua komponen dengan xml nya
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnPassword);
       btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               //ada 2 cara
               //cara pertama ini pop up
//               if (username.equalsIgnoreCase("admin")&&
//                       password.equalsIgnoreCase("admin")){
//                   Toast.makeText(getApplicationContext(), "Sukses Login", Toast.LENGTH_SHORT).show();
//               }else{
//                   Toast.makeText(getApplicationContext(),"Gagal Login",Toast.LENGTH_SHORT).show();
//               }

               //cara kedua message box
//               if (username.equalsIgnoreCase("admin")&&
//                       password.equalsIgnoreCase("admin")){
//                   new AlertDialog.Builder(MainActivity.this)
//                           .setTitle("Sukses")
//                           .setMessage("Login Sukses")
//
//                           .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//                               public void onClick(DialogInterface dialog, int which) {
//
//                               }
//                           })
//                           .setNegativeButton(android.R.string.no,null)
//                           .setIcon(android.R.drawable.ic_dialog_alert)
//                           .show();
//               }else{
//                   //else nya make toast buat sementara
//                   Toast.makeText(getApplicationContext(),"Gagal Login",Toast.LENGTH_SHORT).show();



//               }
// in shared prefs inside het string method
               // we are passing key value as EMAIL_KEY and
               // default value is
               // set to null if not present.
               String username = txtUsername.getText().toString();
               String password = txtPassword.getText().toString();
               if (username.equalsIgnoreCase("admin")
                       &&password.equalsIgnoreCase("admin")){

                   // getting the data which is stored in shared preferences.
                   sharedpreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
                   SharedPreferences.Editor editor = sharedpreferences.edit();

                   // below two lines will put values for
                   // email and password in shared preferences.
                   editor.putString(EMAIL_KEY, txtUsername.getText().toString());
                   editor.putString(PASSWORD_KEY, txtPassword.getText().toString());

                   // to save our data with key and value.
                   editor.apply();
                   startActivity(new Intent(MainActivity.this,MainActivity2.class ));
                   finish();
               }else{
                   //else nya make toast buat sementara
                  Toast.makeText(getApplicationContext(),"Gagal Login",Toast.LENGTH_SHORT).show();
               }
           }
       });
    }
}