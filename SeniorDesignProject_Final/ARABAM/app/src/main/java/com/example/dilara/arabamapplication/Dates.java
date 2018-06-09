package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dates extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dates);

        TextView onemlitarihler = (TextView)findViewById(R.id.onemlitarihler);
        Button vizetarihi = (Button)findViewById(R.id.vizetarihi);
        Button bakimtarihi = (Button)findViewById(R.id.bakimtarihi);
        Button kontroltarihi = (Button)findViewById(R.id.kontroltarihi);
        Button cikis3 = (Button)findViewById(R.id.cikis3);

        vizetarihi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.VISADATE"));
            }
        });

        bakimtarihi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.REPAIR"));
            }
        });

        kontroltarihi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CONTROLDATE"));
            }
        });

        cikis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.MAIN"));
            }
        });
    }
}