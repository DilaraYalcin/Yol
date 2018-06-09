package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CarProperties2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_properties2);

        TextView motorhacmigiris = (TextView)findViewById(R.id.motorhacmigiris);
        EditText hacimgiris = (EditText) findViewById(R.id.hacimgiris);
        Button motorhacmikaydet = (Button)findViewById(R.id.motorhacmikaydet);

        motorhacmikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CARPROPERTIES3"));
            }
        });
    }

}