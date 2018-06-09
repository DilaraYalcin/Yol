package com.example.dilara.arabamapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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



public class MainActivity extends AppCompatActivity {
    EditText et_username, et_password;
    TextView sifre_degistir;
    Button login, kayit;
    String user_info;
    String jsonResponse = "";
    String login_url;
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    RequestQueue queue;
    String Sehir, Ulke;
    String message;
    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        queue = Volley.newRequestQueue(this);
        pref = getSharedPreferences("User", 0);
        editor = pref.edit();
        et_username = (EditText) findViewById(R.id.login_input_username);
        et_password = (EditText) findViewById(R.id.login_input_password);
        kayit = (Button) findViewById(R.id.btn_kayit);
        login = (Button) findViewById(R.id.btn_login);
        sifre_degistir = (TextView) findViewById(R.id.sifre_degistir2);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                loginUser(username, password);
            }
        });
        kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Register.class);
                startActivity(i);
            }
        });
    }

    private void loginUser(String username, String password) {

        String login_url = "http://10.0.2.2/php/login.php";

        JSONObject header = new JSONObject();
        JSONObject information = new JSONObject();


        try {
            information.put("password", password.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            information.put("Kullanici_adi", username);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            header.put("login", information);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, login_url, header, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                Log.d("Response", response.toString());
                JSONObject data = response;
                JSONObject information = new JSONObject();
                try {
                    information = data.getJSONObject("message");
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                try {
                    Sehir = information.getString("Sehir");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                try {
                    Ulke = information.getString("Ulke");
                } catch (JSONException e) {
                    e.printStackTrace();
                }



                Toast.makeText(getApplicationContext(),"Hoşgeldiniz " + "," + Sehir + Ulke, Toast.LENGTH_LONG).show();
                if(Sehir != null) {
                    SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putBoolean("is_login", true);
                    editor.putString("Sehir", Sehir);
                    editor.putString("Ulke",Ulke);
                    editor.apply();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(MainActivity.this,Content.class);
                            startActivity(i);
                            finish();
                        }
                    },3000);

                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error", error.toString());
                Toast.makeText(getApplicationContext(), "Hatalı Giriş. Tekrar Deneyin !", Toast.LENGTH_LONG).show();

            }

        });


        queue.add(jsonObjectRequest);
    }
}
