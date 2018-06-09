package com.example.dilara.arabamapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class Insurance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insurance);
    }

    public void otomobilsigortasigecis(View view) {
        Intent otomobilsigortasigecis = new Intent(this, CarInsurance.class);
        startActivity(otomobilsigortasigecis);
    }

    public void trafiksigortasigecis(View view) {
        Intent trafiksigortasigecis = new Intent(this, TraficInsurance.class);
        startActivity(trafiksigortasigecis);
    }

    public void cikis(View view) {
        Intent cikis = new Intent(this, MainActivity.class);
        startActivity(cikis);
    }
}