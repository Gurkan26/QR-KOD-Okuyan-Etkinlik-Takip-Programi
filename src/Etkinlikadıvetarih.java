
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GurkanSenturk
 */
public class Etkinlikadıvetarih 
{
private String etkinlikadi;
private String tarih;

   

    public String getEtkinlikadi() {
        return etkinlikadi;
    }

    public void setEtkinlikadi(String etkinlikadi) {
        this.etkinlikadi = etkinlikadi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public Etkinlikadıvetarih(String etkinlikadi, String tarih) {
        this.etkinlikadi = etkinlikadi;
        this.tarih = tarih;
    }

    public Etkinlikadıvetarih(String etkinlikadi) {
        this.etkinlikadi = etkinlikadi;
    }

}
