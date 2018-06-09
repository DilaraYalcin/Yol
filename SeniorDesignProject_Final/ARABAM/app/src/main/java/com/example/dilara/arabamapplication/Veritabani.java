package com.example.dilara.arabamapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Veritabani extends SQLiteOpenHelper {
    public static final String DATABASE_NAME= "database_yolarkadasi";
    public static final int DATABASE_VERSION = 1;
    public static final String UYELER_TABLE ="uye_kaydi";
    public static final String TARIH_ICERIKLERI ="tarih_icerikleri";
    public static final String ARABA_OZELLIKLERI ="araba_ozellikleri";
    public static final String TARIHLER ="tarihler";
    public static final String OTOPARK_UCRETLERI ="otopark_ucretleri";
    public static final String YAKIT_KONTROLU ="yakit_kontrolu";
    public static final String SIGORTALAR ="sigortalar";


    public Veritabani(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql_uye_kaydi_tablosu_olusturma = " CREATE TABLE " + UYELER_TABLE + "(kullaniciadi TEXT, sifre TEXT, sehir TEXT, ulke TEXT, sase_no TEXT PRIMARY KEY, arabamodeli TEXT, arabakm TEXT)";
        String sql_tarihler_tablosu_olusturma = " CREATE TABLE " + TARIHLER + "(sase_no VARCHAR PRIMARY KEY, tarih DATE PRIMARY KEY)";
        String sql_araba_ozellikleri_tablosu_olusturma = " CREATE TABLE " + ARABA_OZELLIKLERI + "(Marka VARCHAR, Model VARCHAR, Yakit_tank_hacmi INT, arabakm INT, sase_no VARCHAR PRIMARY KEY)";
        String sql_tarih_icerikleri_tablosu_olusturma = " CREATE TABLE " + TARIH_ICERIKLERI+ "(tür_id INT PRIMARY KEY, tarih_icerigi VARCHAR)";
        String sql_otopark_ucretleri_tablosu_olusturma = " CREATE TABLE " + OTOPARK_UCRETLERI + "(otopark_adi VARCHAR PRIMARY KEY, tarih DATE, yapilan_odeme INT)";
        String sql_yakit_kontrolu_tablosu_olusturma = " CREATE TABLE " + YAKIT_KONTROLU + "(istasyon_adi VARCHAR PRIMARY KEY, alinan_benzin_litre INT, benzin_litre_fiyatı INT, alinan_lpg_litre INT, lpg_litre_fiyatı INT)";
        String sql_sigortalar_tablosu_olusturma = " CREATE TABLE " + SIGORTALAR + "(sigorta_id INT PRIMARY KEY, sigorta_tipi VARCHAR, tarih DATE, gelecek_tarih DATE, sigorta_cesidi VARCHAR)";

        db.execSQL(sql_uye_kaydi_tablosu_olusturma);
        db.execSQL(sql_tarihler_tablosu_olusturma );
        db.execSQL(sql_araba_ozellikleri_tablosu_olusturma);
        db.execSQL(sql_tarih_icerikleri_tablosu_olusturma);
        db.execSQL(sql_otopark_ucretleri_tablosu_olusturma);
        db.execSQL(sql_yakit_kontrolu_tablosu_olusturma);
        db.execSQL(sql_sigortalar_tablosu_olusturma);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + UYELER_TABLE );
        db.execSQL(" DROP TABLE IF EXISTS " + TARIHLER );
        db.execSQL(" DROP TABLE IF EXISTS " + ARABA_OZELLIKLERI );
        db.execSQL(" DROP TABLE IF EXISTS " + TARIH_ICERIKLERI );
        db.execSQL(" DROP TABLE IF EXISTS " + OTOPARK_UCRETLERI );
        db.execSQL(" DROP TABLE IF EXISTS " + YAKIT_KONTROLU );
        db.execSQL(" DROP TABLE IF EXISTS " + SIGORTALAR );

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

