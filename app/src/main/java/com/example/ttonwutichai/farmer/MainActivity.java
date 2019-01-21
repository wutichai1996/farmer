package com.example.ttonwutichai.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRegister,btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = (Button)findViewById(R.id.btnHome) ;
        btnRegister = (Button)findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnRegister){
            Intent intent = new Intent(this,RegisterActivity.class);
            startActivity(intent);
        }else if(v==btnHome){
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        }
    }
}
