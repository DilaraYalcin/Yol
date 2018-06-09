package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FuelControl3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuel_control3);

        TextView litreyakit = (TextView)findViewById(R.id.litreyakit);
        EditText litre = (EditText) findViewById(R.id.litre);
        Button litrekaydet = (Button)findViewById(R.id.litrekaydet);

        litrekaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.FUELCONTROL4"));
            }
        });
    }

}