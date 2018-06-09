package com.example.dilara.arabamapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText kullaniciadi = (EditText) findViewById(R.id.kullaniciadi);
        final EditText sifre = (EditText) findViewById(R.id.sifre);
        final EditText sehiradi = (EditText) findViewById(R.id.sehiradi);
        final EditText ulkeadi = (EditText) findViewById(R.id.ulkeadi);
        final EditText arabamodeli = (EditText) findViewById(R.id.arabamodeli);
        final EditText arabakm = (EditText) findViewById(R.id.arabakm);
        final EditText sase = (EditText) findViewById(R.id.sase);

        Button bilgilerikaydet = (Button)findViewById(R.id.bilgilerikaydet);

        bilgilerikaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = kullaniciadi.getText().toString();
                String password = sifre.getText().toString();
                String countryname = sehiradi.getText().toString();
                String cityyname = ulkeadi.getText().toString();
                String sase_no = sase.getText().toString();
                String carname = arabamodeli.getText().toString();
                String carkm = arabakm.getText().toString();

                UyeKaydi uyekaydi = new UyeKaydi(username, password, cityyname, countryname, sase_no, carname, carkm);
                Veritabani db =new Veritabani(getApplicationContext());
                long id= db.uyekaydi(uyekaydi);

                if(username.isEmpty() || password.isEmpty() || sase_no.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Kayit başarısız",Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),"Kayit başarılı",Toast.LENGTH_LONG).show();

                }


                //startActivity(new Intent("android.intent.action.MAIN"));
            }
        });
    }

}
