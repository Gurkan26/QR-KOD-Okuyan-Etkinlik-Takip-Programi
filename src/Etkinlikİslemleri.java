
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GurkanSenturk
 */
public class Etkinlikİslemleri 
{ private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

     

    public Etkinlikİslemleri() {
        String url = "jdbc:mysql://" + Veritabanı.host + ":" + Veritabanı.port + "/" + Veritabanı.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Veritabanı.kullanici_adi, Veritabanı.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
        }
        
    }
    public void etkinlikekle2(String etkinlikismi,String tarih)
    {
    String sorgu="Insert Into etkinlik_tarih(adi,tarihi) VALUES(?,?)";
    try {
        preparedStatement=con.prepareStatement(sorgu);
        preparedStatement.setString(1, etkinlikismi);
        preparedStatement.setString(2, tarih);
        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "HATA");
        Logger.getLogger(Etkinlikİslemleri.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    }
    public void etkinlikekle(String etkinlik_isim)
    {   
        String sorgu="create table "+etkinlik_isim+"(id int(30) primary key ,Ad varchar(40),Soyad varchar(40),Bölüm varchar(40),Katılım_Sayısı int)";
    try {
        preparedStatement=con.prepareStatement(sorgu);
        preparedStatement.executeUpdate();
        JOptionPane.showMessageDialog(null, "Etkinlik Ekleme Başarılı.");
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Etkinlik İsminde Türkçe Karakter Kullanılamaz!");
    }
    
    
    }
   
    public void etkinliksil(String ad)
    {
    String sorgu ="Drop table "+ad;
    try 
    {
        preparedStatement=con.prepareStatement(sorgu);
        preparedStatement.executeUpdate();
    
    }
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Silme Başarısız oldu..");
        Logger.getLogger(Etkinlikİslemleri.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    }
    
    
}
