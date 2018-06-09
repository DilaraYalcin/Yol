package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CarProperties4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_properties4);

        TextView yakittankihacmigiris = (TextView)findViewById(R.id.yakittankihacmigiris);
        EditText yakittankihacmi = (EditText) findViewById(R.id.yakittankihacmi);
        Button tankhacmikaydet = (Button)findViewById(R.id.tankhacmikaydet);

        tankhacmikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CONTENT"));
            }
        });
    }

}