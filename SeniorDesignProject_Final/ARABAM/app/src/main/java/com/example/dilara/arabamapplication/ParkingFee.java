package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ParkingFee extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parking_fee);

        TextView otoparkadi = (TextView)findViewById(R.id.otoparkadi);
        EditText otoparkadigiris = (EditText) findViewById(R.id.otoparkadigiris);
        Button otoparkadikaydet = (Button)findViewById(R.id.otoparkadikaydet);

        otoparkadikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.PARKINGFEE2"));
            }
        });
    }
}