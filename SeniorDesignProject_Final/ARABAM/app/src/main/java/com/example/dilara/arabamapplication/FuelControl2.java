package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FuelControl2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuel_control2);

        TextView sirketadigiris = (TextView)findViewById(R.id.sirketadigiris);
        EditText sirketadi = (EditText) findViewById(R.id.sirketadi);
        Button sirketadikaydet = (Button)findViewById(R.id.sirketadikaydet);

        sirketadikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.FUELCONTROL3"));
            }
        });
    }
}