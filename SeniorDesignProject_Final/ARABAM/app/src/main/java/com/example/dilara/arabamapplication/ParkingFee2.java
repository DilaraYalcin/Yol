package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ParkingFee2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parking_fee2);

        TextView otoparktarihi = (TextView)findViewById(R.id.otoparktarihi);
        EditText otoparkucreti = (EditText) findViewById(R.id.otoparkucreti);
        Button ucretkaydet = (Button)findViewById(R.id.ucretkaydet);

        ucretkaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.PARKINGFEE3"));
            }
        });
    }
}