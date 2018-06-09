package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CarProperties3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_properties3);

        TextView ulastigienyüksekhiz = (TextView)findViewById(R.id.ulastigienyüksekhiz);
        EditText enyüksekhiz = (EditText) findViewById(R.id.enyüksekhiz);
        Button hizkaydet = (Button)findViewById(R.id.hizkaydet);

        hizkaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CARPROPERTIES4"));
            }
        });
    }

}