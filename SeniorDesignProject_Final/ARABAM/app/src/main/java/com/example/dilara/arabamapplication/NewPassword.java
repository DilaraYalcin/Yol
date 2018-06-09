package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class NewPassword extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_password);

        EditText eskisifre = (EditText) findViewById(R.id.eskisifre);
        EditText yenisifre = (EditText) findViewById(R.id.yenisifre);
        EditText yenisifretekraryenisifretekrar = (EditText) findViewById(R.id.yenisifretekrar);
        Button sifrekaydet = (Button)findViewById(R.id.sifrekaydet);

        sifrekaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.MAIN"));
            }
        });
    }
}