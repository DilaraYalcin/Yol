package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MaintenanceRepair2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintenance_repair2);

        TextView sonislemler = (TextView)findViewById(R.id.sonislemler);
        EditText sonislemlergiris = (EditText) findViewById(R.id.sonislemlergiris);
        Button sonislemlerkaydet = (Button)findViewById(R.id.sonislemlerkaydet);

        sonislemlerkaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CONTENT"));
            }
        });
    }
}