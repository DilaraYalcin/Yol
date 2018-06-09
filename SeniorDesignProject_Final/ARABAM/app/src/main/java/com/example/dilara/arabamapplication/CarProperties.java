package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CarProperties extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_properties);

        TextView modelgiris = (TextView)findViewById(R.id.modelgiris);
        EditText model = (EditText) findViewById(R.id.model);
        Button modelkaydet = (Button)findViewById(R.id.modelkaydet);

        modelkaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CARPROPERTIES2"));
            }
        });
    }

}
