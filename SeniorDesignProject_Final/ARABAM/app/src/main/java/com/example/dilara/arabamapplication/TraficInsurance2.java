package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TraficInsurance2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trafic_insurance2);

        TextView otomobilsigortasitarihi2 = (TextView)findViewById(R.id.otomobilsigortasitarihi2);
        EditText ileritrafiksigortasi = (EditText) findViewById(R.id.ileritrafiksigortasi);
        Button otomobilsigortasitarihikaydet = (Button)findViewById(R.id.otomobilsigortasitarihikaydet);

        otomobilsigortasitarihikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.INSURANCE"));
            }
        });
    }
}