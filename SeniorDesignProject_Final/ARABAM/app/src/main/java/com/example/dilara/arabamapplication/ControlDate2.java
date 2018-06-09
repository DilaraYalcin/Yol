package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ControlDate2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_date2);

        TextView kontroltarihi3 = (TextView)findViewById(R.id.kontroltarihi3);
        EditText ilerikontroltarihi = (EditText) findViewById(R.id.ilerikontroltarihi);
        Button ilerikontrolkaydet = (Button)findViewById(R.id.ilerikontrolkaydet);

        ilerikontrolkaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.DATES"));
            }
        });
    }
}