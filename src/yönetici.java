
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GurkanSenturk
 */
public class yönetici extends üyelerislemleri {
    public String kullanıcıadi;
    private Connection con = null; 
    
    private Statement statement = null;

    public yönetici(String kullanıcıadi) {
        this.kullanıcıadi = kullanıcıadi;
    }
    private PreparedStatement preparedStatement = null;
    public String getKullanıcıadi() {
        return kullanıcıadi;
    }

    public void setKullanıcıadi(String kullanıcıadi) {
        this.kullanıcıadi = kullanıcıadi;
    }
    
 
    public yönetici()
{
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
}
