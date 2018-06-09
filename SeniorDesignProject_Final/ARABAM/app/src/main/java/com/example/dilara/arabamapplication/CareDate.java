package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CareDate extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.care_date);

        TextView bakimtarihi2 = (TextView)findViewById(R.id.bakimtarihi2);
        EditText bakimtarihigiris = (EditText) findViewById(R.id.bakimtarihigiris);
        Button bakimtarihikaydet = (Button)findViewById(R.id.bakimtarihikaydet);

        bakimtarihikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CAREDATE2"));
            }
        });
    }
}