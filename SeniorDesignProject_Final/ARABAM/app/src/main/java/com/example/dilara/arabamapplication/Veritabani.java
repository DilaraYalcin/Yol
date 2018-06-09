package com.example.dilara.arabamapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Veritabani extends SQLiteOpenHelper {
    public static final String DATABASE_NAME= "database_yolarkadasi";
    public static final int DATABASE_VERSION = 1;
    public static final String UYELER_TABLE ="uye_kaydi";


    public Veritabani(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql_uye_kaydi_tablosu_olusturma = " CREATE TABLE " + UYELER_TABLE + "(kullaniciadi TEXT, sifre TEXT, sehir TEXT, ulke TEXT, sase_no TEXT PRIMARY KEY, arabamodeli TEXT, arabakm TEXT)";
        db.execSQL(sql_uye_kaydi_tablosu_olusturma);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + UYELER_TABLE );

    }


    public long uyekaydi (UyeKaydi uyekaydi ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("kullaniciadi", uyekaydi.getKullaniciadi());
        cv.put("sifre",uyekaydi.getSifre());
        cv.put("sehir",uyekaydi.getSehir());
        cv.put("ulke",uyekaydi.getUlke());
        cv.put("sase_no",uyekaydi.getSase_no());
        cv.put("arabamodeli",uyekaydi.getArabamodeli());
        cv.put("arabakm",uyekaydi.getArabakm());

        long id = db.insert(UYELER_TABLE , null, cv);
        return  id;
    }
}

