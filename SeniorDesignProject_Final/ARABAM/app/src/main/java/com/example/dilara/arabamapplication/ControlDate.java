package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ControlDate extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_date);

        TextView kontroltarihi2 = (TextView)findViewById(R.id.kontroltarihi2);
        EditText kontroltarihigiris = (EditText) findViewById(R.id.kontroltarihigiris);
        Button kontroltarihikaydet = (Button)findViewById(R.id.kontroltarihikaydet);

        kontroltarihikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CONTROLDATE2"));
            }
        });
    }

}