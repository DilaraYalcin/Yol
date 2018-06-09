package com.example.dilara.arabamapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class CarProperties4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_properties4);
    }

    public void kayit(View view) {
        Intent kayit = new Intent(this, Content.class);
        startActivity(kayit);
    }
}