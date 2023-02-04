package com.example.belajar1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {



    //list komponen
    EditText txtangka1;
    EditText txtangka2;
    Button btnplus;
    Button btnminus;
    Button btnkali;
    Button btnbagi;
    int n1,n2;
    double n11;
    double n22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtangka1 = (EditText) findViewById(R.id.txtangka1);
        txtangka2 = (EditText) findViewById(R.id.txtangka2);
        btnplus = (Button) findViewById(R.id.btn1);
        btnminus = (Button) findViewById(R.id.btnminus);
        btnkali = (Button) findViewById(R.id.btnkali);
        btnbagi = (Button) findViewById(R.id.btnbagi);




        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    n1 = Integer.parseInt(txtangka1.getText().toString());
                    n2 = Integer.parseInt(txtangka2.getText().toString());
                    int result = n1 + n2;
                    Toast.makeText(MainActivity2.this,"Hasil : " + result,Toast.LENGTH_SHORT).show();

            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    n1 = Integer.parseInt(txtangka1.getText().toString());
                    n2 = Integer.parseInt(txtangka2.getText().toString());
                    int result = n1 - n2;
                    Toast.makeText(MainActivity2.this,"Hasil : " + result,Toast.LENGTH_SHORT).show();


            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    n1 = Integer.parseInt(txtangka1.getText().toString());
                    n2 = Integer.parseInt(txtangka2.getText().toString());
                    int result = n1 * n2;
                    Toast.makeText(MainActivity2.this,"Hasil : " + result,Toast.LENGTH_SHORT).show();


            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    n11 = Double.parseDouble(txtangka1.getText().toString());
                     n22 = Double.parseDouble(txtangka2.getText().toString());
                    double result = n11 / n22;
                    Toast.makeText(MainActivity2.this,"Hasil : " + new DecimalFormat("##.##").format(result),Toast.LENGTH_SHORT).show();

            }
        });
    }
}