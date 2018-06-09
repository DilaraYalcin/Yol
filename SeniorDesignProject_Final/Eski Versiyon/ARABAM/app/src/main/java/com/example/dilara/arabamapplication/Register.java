package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Register extends AppCompatActivity {
    EditText et_username,et_password,et_cityname,et_countryname,et_sase,et_carname,et_carkm;
    Button kayit;
    RequestQueue queue;
    String message;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        queue = Volley.newRequestQueue(this);

        et_username = (EditText) findViewById(R.id.username);
        et_password = (EditText) findViewById(R.id.password);
        et_cityname = (EditText) findViewById(R.id.cityname);
        et_countryname = (EditText) findViewById(R.id.countryname);
        et_sase = (EditText) findViewById(R.id.sase);
        et_carname = (EditText) findViewById(R.id.carname);
        et_carkm = (EditText) findViewById(R.id.carkm);
        kayit = (Button) findViewById(R.id.kayit);


        final Editable username= et_username.getText();
        final Editable password = et_password.getText();
        final Editable countryname = et_countryname.getText();
        final Editable cityname = et_cityname.getText();
        final Editable sase = et_sase.getText();
        final Editable carname = et_carname.getText();
        final Editable carkm = et_carkm.getText();





        kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String username2 = et_username.getText().toString();
                    String password2 = et_password.getText().toString();
                    String cityname2 = et_cityname.getText().toString();
                    String countryname2 = et_countryname.getText().toString();
                    String sase2 = et_sase.getText().toString();
                    String carname2 = et_carname.getText().toString();
                    String carkm2 = et_carkm.getText().toString();

                    registerUser(username2, password, cityname2, countryname2, sase2, carname2, carkm2);
                }


        });

}
    private void registerUser(String username, Editable password, String cityname, String countryname, String sase,
                              String carname, String carkm) {
        String register_url = "http://10.0.2.2/php/register.php";


        JSONObject header = new JSONObject();
        JSONObject information = new JSONObject();
        try {
            information.put("username",username);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            information.put("password",password.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            information.put("cityname",cityname);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            information.put("countryname",countryname);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            information.put("sase",sase);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            information.put("carname",carname);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            information.put("carkm",carkm);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            header.put("register",information);
        } catch (JSONException e) {
            e.printStackTrace();
        }



        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,register_url,header, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                Log.d("Response",response.toString());
                JSONObject data = response;
                JSONObject information = new JSONObject();
                try {
                    message = data.getString("message");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Toast.makeText(getApplicationContext(),"Kayıt başarılı", Toast.LENGTH_LONG).show();
                if (message != null) {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Register.this, MainActivity.class);
                            startActivity(i);
                            finish();
                        }
                    }, 2500);
                }
            }}, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error",error.toString());
                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_LONG).show();

            }

        });


        queue.add(jsonObjectRequest);
    }


}


