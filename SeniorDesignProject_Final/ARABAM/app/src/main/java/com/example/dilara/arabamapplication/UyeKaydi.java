package com.example.dilara.arabamapplication;


public class UyeKaydi {
    private String kullaniciadi;
    private String sifre;
    private String sehir;
    private String ulke;
    private String sase_no;
    private String arabamodeli;
    private String arabakm;

    public UyeKaydi(String kullaniciadi, String sifre, String sehir, String ulke, String sase_no, String arabamodeli, String arabakm) {
        this.kullaniciadi = kullaniciadi;
        this.sifre = sifre;
        this.sehir = sehir;
        this.ulke = ulke;
        this.sase_no = sase_no;
        this.arabamodeli = arabamodeli;
        this.arabakm = arabakm;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getSase_no() {
        return sase_no;
    }

    public void setSase_no(String sase_no) {
        this.sase_no = sase_no;
    }

    public String getArabamodeli() {
        return arabamodeli;
    }

    public void setArabamodeli(String arabamodeli) {
        this.arabamodeli = arabamodeli;
    }

    public String getArabakm() {
        return arabakm;
    }

    public void setArabakm(String arabakm) {
        this.arabakm = arabakm;
    }
}



