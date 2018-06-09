package com.example.dilara.arabamapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class MaintenanceRepair extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintenance_repair);
    }
    public void kayit(View view){
        Intent kayit =new Intent(this,MaintenanceRepair2.class);
        startActivity(kayit);
    }
}