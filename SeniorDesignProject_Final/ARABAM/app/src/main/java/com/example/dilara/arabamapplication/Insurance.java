package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Insurance extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insurance);

        TextView sigortalar = (TextView)findViewById(R.id.sigortalar);
        Button otomobilsigortasi = (Button)findViewById(R.id.otomobilsigortasi);
        Button trafiksigortasi = (Button)findViewById(R.id.trafiksigortasi);
        Button cikis2 = (Button)findViewById(R.id.cikis2);

        otomobilsigortasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CARINSURANCE"));
            }
        });

        trafiksigortasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.TRAFICINSURANCE"));
            }
        });

        cikis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.MAIN"));
            }
        });
    }
}