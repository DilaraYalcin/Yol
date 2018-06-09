package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CarInsurance extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_insurance);

        TextView otomobilsigortasitarihi2 = (TextView)findViewById(R.id.otomobilsigortasitarihi2);
        EditText otomobilsigortasi = (EditText) findViewById(R.id.otomobilsigortasi);
        Button otomobilsigortasikaydet = (Button)findViewById(R.id.otomobilsigortasikaydet);

        otomobilsigortasikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CARINSURANCE2"));
            }
        });
    }
}