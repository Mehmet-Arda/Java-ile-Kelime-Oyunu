/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marda
 */
public class Yarismaci 
{
    private String ad;
    private String soyad;
    private int kacinciSirada;
    private int puan;
    private String sure;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getKacinciSirada() {
        return kacinciSirada;
    }

    public void setKacinciSirada(int kacinciSirada) {
        this.kacinciSirada = kacinciSirada;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }
    public Yarismaci(String ad,String soyad,int i)
    {
        setAd(ad);
        setSoyad(soyad);
        setKacinciSirada(i);
    }
}
