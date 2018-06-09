package com.example.dilara.arabamapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class CarProperties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_properties);
    }
    public void kayit1(View view){
        Intent kayit1 =new Intent(this,CarProperties2.class);
        startActivity(kayit1);
    }
}
