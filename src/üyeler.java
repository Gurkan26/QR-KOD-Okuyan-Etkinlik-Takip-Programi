/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GurkanSenturk
 */
public class üyeler {
    private String kullanıcı_adı;
    private String sifre;
    private int id;
   

    public üyeler(int id,String kullanıcı_adı, String sifre) {
        this.id=id;
        this.kullanıcı_adı = kullanıcı_adı;
        this.sifre = sifre;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
}
