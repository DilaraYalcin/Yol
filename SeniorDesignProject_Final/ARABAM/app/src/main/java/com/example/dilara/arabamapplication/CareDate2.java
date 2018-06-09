package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CareDate2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.care_date2);

        TextView bakimtarihi3 = (TextView)findViewById(R.id.bakimtarihi3);
        EditText ileribakimtarihi = (EditText) findViewById(R.id.ileribakimtarihi);
        Button ileribakimkaydet = (Button)findViewById(R.id.ileribakimkaydet);

        ileribakimkaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.DATES"));
            }
        });
    }}

