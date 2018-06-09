package com.example.dilara.arabamapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class NewPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_password);
    }
    public void gecis(View view){
        Intent gecis =new Intent(this,MainActivity.class);
        startActivity(gecis);
    }
}