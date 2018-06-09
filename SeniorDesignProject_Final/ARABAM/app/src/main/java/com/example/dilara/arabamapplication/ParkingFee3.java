package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ParkingFee3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parking_fee3);

        TextView odenentutar = (TextView)findViewById(R.id.odenentutar);
        EditText tutar = (EditText) findViewById(R.id.tutar);
        Button tutarkaydet = (Button)findViewById(R.id.tutarkaydet);

        tutarkaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CONTENT"));
            }
        });
    }
}