package com.example.dilara.arabamapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
    }
    public void arabaozelliklerigecis(View view){
        Intent arabaozelliklerigecis =new Intent(this,CarProperties.class);
        startActivity(arabaozelliklerigecis);
    }
    public void onemlitarihgecis(View view){
        Intent onemlitarihgecis =new Intent(this,Dates.class);
        startActivity(onemlitarihgecis);
    }
    public void bakimgecis(View view){
        Intent bakimgecis =new Intent(this,MaintenanceRepair.class);
        startActivity(bakimgecis);
    }
    public void yakitkontrolgecis(View view){
        Intent yakitkontrolgecis =new Intent(this,FuelControl.class);
        startActivity(yakitkontrolgecis);
    }
    public void otoparkucretlerigecis(View view){
        Intent otoparkucretlerigecis =new Intent(this,ParkingFee.class);
        startActivity(otoparkucretlerigecis);
    }
    public void sigortalargecis(View view){
        Intent sigortalargecis =new Intent(this,Insurance.class);
        startActivity(sigortalargecis);
    }
    public void cikis(View view){
        Intent cikis =new Intent(this,MainActivity.class);
        startActivity(cikis);
    }
}