package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VisaDate extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visa_date);

        TextView vizetarihi = (TextView)findViewById(R.id.vizetarihi);
        EditText sonvizetarihi = (EditText) findViewById(R.id.sonvizetarihi);
        Button vizetarihikaydet = (Button)findViewById(R.id.vizetarihikaydet);

        vizetarihikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.VISADATE2"));
            }
        });
    }
}