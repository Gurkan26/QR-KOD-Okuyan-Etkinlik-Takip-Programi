/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GurkanSenturk
 */
public class Katilimci {
    private int id;
    private String ad;
    private String soyad;
    private String bölüm;
    private int katilim_sayisi;

    public Katilimci(int id, String ad, String soyad, String bölüm,int katilim_sayisi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.bölüm = bölüm;
        this.katilim_sayisi=katilim_sayisi;
    }

    public int getKatilim_sayisi() {
        return katilim_sayisi;
    }

    public void setKatilim_sayisi(int katilim_sayisi) {
        this.katilim_sayisi = katilim_sayisi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getBölüm() {
        return bölüm;
    }

    public void setBölüm(String bölüm) {
        this.bölüm = bölüm;
    }
    
}
