package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VisaDate2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visa_date2);

        TextView vizetarihi2 = (TextView)findViewById(R.id.vizetarihi2);
        EditText ilerivize = (EditText) findViewById(R.id.ilerivize);
        Button ilerivizekaydet = (Button)findViewById(R.id.ilerivizekaydet);

        ilerivizekaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.DATES"));
            }
        });
    }

}