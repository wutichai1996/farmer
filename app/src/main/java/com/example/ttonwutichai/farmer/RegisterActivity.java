package com.example.ttonwutichai.farmer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("สมัครสมาชิก");
        getSupportFragmentManager().beginTransaction().add(R.id.contenContainer,RegisterFragment.newInstance()).commit();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(getAssets().open("provinces.csv")));
            String readLine = null;

            while ((readLine = br.readLine()) != null){
                Log.i("ff",readLine);
            }

        } catch (IOException e) {

        }

    }
}
