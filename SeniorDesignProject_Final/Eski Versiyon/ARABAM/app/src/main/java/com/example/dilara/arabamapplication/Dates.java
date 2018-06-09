package com.example.dilara.arabamapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class Dates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dates);
    }
    public void gecis(View view){
        Intent gecis =new Intent(this,VisaDate.class);
        startActivity(gecis);
    }
    public void bakimgecis(View view){
        Intent bakimgecis =new Intent(this,CareDate.class);
        startActivity(bakimgecis);
    }
    public void kontrolgecis(View view){
        Intent kontrolgecis =new Intent(this,ControlDate.class);
        startActivity(kontrolgecis);
    }
    public void cikis(View view){
        Intent cikis =new Intent(this,MainActivity.class);
        startActivity(cikis);
    }
}