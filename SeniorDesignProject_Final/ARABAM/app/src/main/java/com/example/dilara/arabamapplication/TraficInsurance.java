package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TraficInsurance extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trafic_insurance);

        TextView trafiksigortasitarihi = (TextView)findViewById(R.id.trafiksigortasitarihi);
        EditText trafiksigortasitarihigiris = (EditText) findViewById(R.id.trafiksigortasitarihigiris);
        Button trafiksigortasitarihikaydet = (Button)findViewById(R.id.trafiksigortasitarihikaydet);

        trafiksigortasitarihikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.TRAFFICINSURANCE2"));
            }
        });
    }
}