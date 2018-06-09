package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MaintenanceRepair extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintenance_repair);

        TextView sonbakimonarimtarihi = (TextView)findViewById(R.id.sonbakimonarimtarihi);
        EditText sonbakimtarihi = (EditText) findViewById(R.id.sonbakimtarihi);
        Button sonbakimtarihikaydet = (Button)findViewById(R.id.sonbakimtarihikaydet);

        sonbakimtarihikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.REPAIR2"));
            }
        });
    }
}