package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Content extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);

        EditText icerikler = (EditText) findViewById(R.id.icerik);

        Button btn1 = (Button) findViewById(R.id.ozellik);
        Button btn2 = (Button) findViewById(R.id.tarihler);
        Button btn3 = (Button) findViewById(R.id.bakim);
        Button btn4 = (Button) findViewById(R.id.yakit);
        Button btn5 = (Button) findViewById(R.id.otopark);
        Button btn6 = (Button) findViewById(R.id.sigorta);
        Button btn7 = (Button) findViewById(R.id.cikis);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.CARPROPERTIES"));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.DATES"));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.REPAIR"));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.FUELCONTROL"));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.PARKINGFEE"));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.INSURANCE"));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.MAIN"));
            }
        });



    }
}