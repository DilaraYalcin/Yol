package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FuelControl4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuel_control4);

        TextView yakitlitrefiyatigiris = (TextView)findViewById(R.id.yakitlitrefiyatigiris);
        EditText yakitlitrefiyati = (EditText) findViewById(R.id.yakitlitrefiyati);
        Button yakitlitrefiyatikaydet = (Button)findViewById(R.id.yakitlitrefiyatikaydet);

        yakitlitrefiyatikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CONTENT"));
            }
        });
    }
}