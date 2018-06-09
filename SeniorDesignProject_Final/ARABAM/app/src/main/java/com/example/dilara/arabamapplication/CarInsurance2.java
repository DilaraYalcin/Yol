package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CarInsurance2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_insurance);

        TextView otomobilsigortasitarihi3 = (TextView)findViewById(R.id.otomobilsigortasitarihi3);
        EditText ileriotomobilsigortasi = (EditText) findViewById(R.id.ileriotomobilsigortasi);
        Button ileriotomobilsigortasikaydet = (Button)findViewById(R.id.ileriotomobilsigortasikaydet);

        ileriotomobilsigortasikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.INSURANCE"));
            }
        });
    }
}
