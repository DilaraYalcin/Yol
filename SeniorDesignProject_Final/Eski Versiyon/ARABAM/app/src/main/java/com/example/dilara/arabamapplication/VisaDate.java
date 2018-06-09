package com.example.dilara.arabamapplication;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.os.Bundle;

public class VisaDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visa_date);
    }
    public void kayit(View view){
        Intent kayit =new Intent(this,VisaDate2.class);
        startActivity(kayit);
    }
}