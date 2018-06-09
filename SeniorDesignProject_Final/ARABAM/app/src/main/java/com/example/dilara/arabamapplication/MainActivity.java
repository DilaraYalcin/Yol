package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText kullaniciadi = (EditText)findViewById(R.id.login_input_username);
        final EditText sifre = (EditText)findViewById(R.id.login_input_password);

        Button giris = (Button)findViewById(R.id.btn_login);
        Button kaydet = (Button)findViewById(R.id.btn_register);
        Button degistir = (Button)findViewById(R.id.change);

        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ad =kullaniciadi.getText().toString();
                String sifre2 =sifre.getText().toString();

                if(ad.isEmpty() || sifre2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Alanlar boş bırakılamaz..",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Giriş başarılı",Toast.LENGTH_LONG).show();
                    startActivity(new Intent("com.example.dilara.arabamapplication.CONTENT"));
                }




            }
        });

        kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.REGISTER"));
            }
        });

        degistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.dilara.arabamapplication.NEWPASSWORD"));

            }
        });




    }

}
