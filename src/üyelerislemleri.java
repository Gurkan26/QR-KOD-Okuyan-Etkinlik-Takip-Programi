
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GurkanSenturk
 */
public class üyelerislemleri {
private static String kullaniciadi;
private static String mesajj="Bu ID'ye Sahip Katılımcı Mevcut";
    public String getKullaniciadi() 
    {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) 
    {
        this.kullaniciadi = kullaniciadi;
    }
    private Connection con = null; 
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    //BUNLAR BAĞLANTI İÇİN
    
  public void etkinlik_listesi(String etkinlikismi)
   {String sorgu = "select table_name AS 'Etkinliğin Adı' from information_schema.tables WHERE table_schema='canbalam_etkinliktakip'";//bununla tablo isimlerini çektik
   
   try {
       preparedStatement=con.prepareStatement(sorgu);
       preparedStatement.executeQuery();
    } catch (SQLException ex) {
        Logger.getLogger(Etkinlikİslemleri.class.getName()).log(Level.SEVERE, null, ex);
    }
   
        
    }
  public ArrayList<Etkinlikadıvetarih>etkinliklistele()
  {
  
  ArrayList<Etkinlikadıvetarih>cıktı=new ArrayList<Etkinlikadıvetarih>();
  try {String sorgu = "select table_name AS 'Etkinliğin Adı' from information_schema.tables WHERE table_schema='canbalam_etkinliktakip' and TABLE_NAME!='yönetici' and TABLE_NAME!='katilimcilar'and TABLE_NAME!='etkinlik_tarih'and TABLE_NAME!='karaliste'";//bununla tablo isimlerini çektik
   
       preparedStatement=con.prepareStatement(sorgu);
ResultSet rs = preparedStatement.executeQuery();
while(rs.next())
{
    String isimString=rs.getString("Etkinliğin Adı");
    cıktı.add(new Etkinlikadıvetarih(isimString));


}
return cıktı;  } catch (SQLException ex) {
        Logger.getLogger(Etkinlikİslemleri.class.getName()).log(Level.SEVERE, null, ex);
return null;
}
  
  
  }
  public ArrayList<Etkinlikadıvetarih>etkinliklistele2()
  {
  ArrayList<Etkinlikadıvetarih>cıktı=new ArrayList<Etkinlikadıvetarih>();
         try {
             String sorgu="Select * from etkinlik_tarih";
  
             statement=con.createStatement();
             ResultSet rs = statement.executeQuery(sorgu);
             while(rs.next())
             {
             String ad=rs.getString("adi");
             String tarih=rs.getString("tarihi");
cıktı.add(new Etkinlikadıvetarih(ad,tarih));
             
             }
             return cıktı;
         } catch (SQLException ex) {
             Logger.getLogger(üyelerislemleri.class.getName()).log(Level.SEVERE, null, ex);
         return null;
         }
  
  
  
  
  }
  
  public void kullanıcıekle(String kadi,String sifre)
  {
  String sorgu = "insert into yönetici(kullanici_adi,sifre) VALUES(?,?) ";
    try {
        preparedStatement=con.prepareCall(sorgu);
        preparedStatement.setString(1, kadi);
        preparedStatement.setString(2, sifre);
        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Belirlenen kullanıcı adı sistemde mevcut lütfen farklı bir kullanıcı adı deneyin");
        Logger.getLogger(üyelerislemleri.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  }
  public void kullanicisil(String kadi)
  {
  String sorgu ="Delete from yönetici where kullanici_adi=?";
    try {
        preparedStatement=con.prepareStatement(sorgu);
        preparedStatement.setString(1, kadi);
        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(üyelerislemleri.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  }
  
  
  
  
  
  public void katilimciekle(String id,String ad,String soyad,String bolum,String etkinlik)
   {
    String sorgu = "Insert Into "+etkinlik+"(id,Ad,Soyad,Bölüm) VALUES(?,?,?,?)";
         try {
             preparedStatement = con.prepareStatement(sorgu);
             preparedStatement.setString(1, id);
             preparedStatement.setString(2, ad);
             preparedStatement.setString(3, soyad);
             preparedStatement.setString(4, bolum);
             preparedStatement.executeUpdate();
         } catch (SQLException ex) {
            
Logger.getLogger(üyelerislemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
   }
    
    public void katilimciguncelle(int id,String ad,String soyad,String bolum,String etkinlik)
    {
    String sorgu = "update "+etkinlik+" set Ad=? , Soyad=? , Bölüm=?  where id=? ";
         try {
             preparedStatement=con.prepareStatement(sorgu);
             preparedStatement.setString(1, ad);
             preparedStatement.setString(2, soyad);
             preparedStatement.setString(3, bolum);
             preparedStatement.setInt(4, id);
             
             preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(üyelerislemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    
    }
    
    public void katilimcisil(int id,String etkinlik)
    {
    String sorgu="Delete  from "+etkinlik+" where id =?";
         try {
             preparedStatement=con.prepareStatement(sorgu);
             preparedStatement.setInt(1, id);
             preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(üyelerislemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    
    }
     public ArrayList<yönetici>yöneticigetir()
    {
    ArrayList<yönetici>cıktı=new ArrayList<>();
            // veritabanından her bilgi aldığımda çıktı objesine veri ekliycem

    try {
        statement=con.createStatement();
            String sorgu="Select * from yönetici where kullanici_adi !='admin'";
            ResultSet rs = statement.executeQuery(sorgu);
            while(rs.next())
            { String ad =rs.getString("kullanici_adi");
            cıktı.add(new yönetici(ad));
            
            
            }
            return cıktı;

    } catch (SQLException ex) {
        Logger.getLogger(üyelerislemleri.class.getName()).log(Level.SEVERE, null, ex);
   return null;
    }
    
    
    }
    
    
    
    
    
    public ArrayList<Katilimci>katilimcilarigetir(String etkinlik)
    {
    ArrayList<Katilimci>cıktı=new ArrayList<Katilimci>();
            // veritabanından her bilgi aldığımda çıktı objesine veri ekliycem

    try {
        statement=con.createStatement();
            String sorgu="SELECT * FROM "+etkinlik+" LIMIT 0,30";
            
            ResultSet rs = statement.executeQuery(sorgu);
           
            while(rs.next())
            {
            
            int id = rs.getInt("id");
            String ad =rs.getString("Ad");
            String soyad=rs.getString("Soyad");
            
            String bolum =rs.getString("Bölüm");
            int katilim_sayisi=rs.getInt("Katılım_Sayısı");
            cıktı.add(new Katilimci(id, ad, soyad, bolum,katilim_sayisi));
            
            
            }
            return cıktı;

    } catch (SQLException ex) {
        Logger.getLogger(üyelerislemleri.class.getName()).log(Level.SEVERE, null, ex);
   return null;
    }
    
    
    }
   
    public void sifredegis(String yenisifre)
    {            String sorgu = "update yönetici set sifre=? where kullanici_adi=?";

    try {

        preparedStatement=con.prepareStatement(sorgu);
        preparedStatement.setString(1, yenisifre);
        preparedStatement.setString(2,kullaniciadi );
        preparedStatement.executeUpdate();
    } 
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, "Hata Lütfen Tekrar Deneyin.");
        Logger.getLogger(üyelerislemleri.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     public boolean girisYap(String kullanici_adi,String parola) {
        
        String sorgu =  "Select * From yönetici where kullanici_adi = ? and sifre = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,kullanici_adi);
            preparedStatement.setString(2,parola);
            
            ResultSet rs =  preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(üyelerislemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
} // burada giriş için gerekli kodlar var veritabanında belirlediğim tablo üzerinde gezicek.

public üyelerislemleri()
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

