package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FuelControl extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuel_control);

        TextView yakittürügiris = (TextView)findViewById(R.id.yakittürügiris);
        EditText yakittürü = (EditText) findViewById(R.id.yakittürü);
        Button yakitürükaydet = (Button)findViewById(R.id.yakitürükaydet);

        yakitürükaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.FUELCONTROL2"));
            }
        });
    }
}