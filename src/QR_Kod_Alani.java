
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import com.google.zxing.Result;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.swing.table.DefaultTableModel;
import java.util.concurrent.ThreadFactory;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GurkanSenturk
 */
public class QR_Kod_Alani extends javax.swing.JFrame implements Runnable, ThreadFactory{
    private  WebcamPanel panel =null;
private Webcam kamera=null;
DefaultTableModel model2; //etkinlik tablo alanı
DefaultTableModel model;   
üyelerislemleri islemler = new üyelerislemleri();

private static final long serialVersiyonUID=644148915740838187L;
private Executor executor = Executors.newSingleThreadExecutor(this);





/**
     * Creates new form QR_Kod_Alani
     */
    public QR_Kod_Alani() {
        initComponents();
        model2=(DefaultTableModel)etkinliktablosu.getModel();
        model=(DefaultTableModel)katilimcitablosu.getModel();
        etkinlikgoruntule();
        kameragiris();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etkinliktablosu = new javax.swing.JTable();
        buton_etkinlik_sec = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        katilimcitablosu = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        qrtexti = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        qrkontrol = new javax.swing.JLabel();
        kamerapaneli = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        etkinliktablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Etkinliğin Adı:"
            }
        ));
        etkinliktablosu.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(etkinliktablosu);

        buton_etkinlik_sec.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        buton_etkinlik_sec.setText("SEÇ");
        buton_etkinlik_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_etkinlik_secActionPerformed(evt);
            }
        });

        mesaj_yazisi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_etkinlik_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton_etkinlik_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 140));

        katilimcitablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ad", "Soyad", "Bölüm", "Katılım Sayısı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(katilimcitablosu);
        if (katilimcitablosu.getColumnModel().getColumnCount() > 0) {
            katilimcitablosu.getColumnModel().getColumn(0).setResizable(false);
            katilimcitablosu.getColumnModel().getColumn(1).setResizable(false);
            katilimcitablosu.getColumnModel().getColumn(2).setResizable(false);
            katilimcitablosu.getColumnModel().getColumn(3).setResizable(false);
            katilimcitablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 228, 424, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        qrtexti.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        qrtexti.setForeground(new java.awt.Color(51, 102, 255));
        qrtexti.setBorder(null);
        qrtexti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qrtextiKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qrtexti, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(qrtexti, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 492, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 476, 524, 10));

        qrkontrol.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        qrkontrol.setForeground(new java.awt.Color(51, 0, 153));
        qrkontrol.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 0)));
        jPanel1.add(qrkontrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 430, 50));

        kamerapaneli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kamerapaneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(kamerapaneli, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 450, 430));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 120, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerii.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buton_etkinlik_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_etkinlik_secActionPerformed
mesaj_yazisi.setText("");
        int selectedrow=etkinliktablosu.getSelectedRow();
        
 if(selectedrow==-1){
            
        if(model2.getRowCount()==0) mesaj_yazisi.setText("Tablo şuan boş");
        else   {mesaj_yazisi.setText("Lütfen Listelenecek Etkinliği Seçin"); }  
          
        }
        else 
        {
            String ad=(String)model2.getValueAt(selectedrow, 0); 
mesaj_yazisi.setText("Şuan '"+ad+"' tablosunu görüntülüyorsunuz.");
            katilimcigoruntule(ad);
        }



 
 
    }//GEN-LAST:event_buton_etkinlik_secActionPerformed
public void veriekle()
{
String veri = qrtexti.getText();
    parcalasakir(veri);
    

}
    private void qrtextiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qrtextiKeyReleased
  
    }//GEN-LAST:event_qrtextiKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
AnaEkran ae = new AnaEkran();
        setVisible(false);
        ae.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void parcalasakir(String veri)
    { int sayac=0;
        veri.toLowerCase();
   
   String [] kontroldizisi;
    kontroldizisi=veri.split(" ");
        for (int i = 0; i < kontroldizisi.length; i++)
        {
        sayac++;
        }
        String sayac1=Integer.toString(sayac);
        jLabel1.setText(sayac1);
        if(sayac!=4)
        {
        qrkontrol.setText("Hatalı QR kod");
        }
      
        else
            
        {  
         String[] kelimeparcaları=new String[4];  
       kelimeparcaları=veri.split(" ");
        String id=kelimeparcaları[0];
        String ad=kelimeparcaları[1];
        String soyad=kelimeparcaları[2];
        String bolum=kelimeparcaları[3];
    
     
     int selectedrow2=etkinliktablosu.getSelectedRow();
   String etkinlikismi = (String)model2.getValueAt(selectedrow2, 0);
  islemler.katilimciekle(id, ad, soyad, bolum,etkinlikismi);
 qrkontrol.setText("Ekleme Başarılı.");
    }
    
    }
    
    
    
    
    public void etkinlikgoruntule() // burada küçük tablodaki veriler gözüküyor yani veritabanındaki tablolar gözüküyor.
    {
    model2.setRowCount(0);
    ArrayList<Etkinlikadıvetarih> eavt=new ArrayList<Etkinlikadıvetarih>();
    eavt=islemler.etkinliklistele();
    if(eavt!=null){
        for(Etkinlikadıvetarih etkinlikadıvetarih:eavt)
        {
            Object[] eklenecek={etkinlikadıvetarih.getEtkinlikadi()};
            model2.addRow(eklenecek);
    
        
        
    }
    
        
    }
    
    }
    
    public void katilimcigoruntule(String ad)
   {
    model.setRowCount(0);
        
        ArrayList<Katilimci> katılımcılar = new ArrayList<Katilimci>();
        
        
        katılımcılar = islemler.katilimcilarigetir(ad);
        
        if (katılımcılar != null ) {
            
            for (Katilimci katılımcı : katılımcılar) {
                Object[] eklenecek = {katılımcı.getId(),katılımcı.getAd(),katılımcı.getSoyad(),katılımcı.getBölüm(),katılımcı.getKatilim_sayisi()};
                
                model.addRow(eklenecek);
                
                
                
            }
            
        }
        
   
   
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QR_Kod_Alani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QR_Kod_Alani().setVisible(true);
        });
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_etkinlik_sec;
    private javax.swing.JTable etkinliktablosu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel kamerapaneli;
    private javax.swing.JTable katilimcitablosu;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JLabel qrkontrol;
    private javax.swing.JTextField qrtexti;
    // End of variables declaration//GEN-END:variables

    
    
    private void kameragiris()
 {
     Dimension size =WebcamResolution.QVGA.getSize();
 kamera=Webcam.getWebcams().get(0); //Burada olağan kamerayı seçtim 0  ile onu demek istedim.
 kamera.setViewSize(size);
 panel=new WebcamPanel(kamera);
 panel.setPreferredSize(size);
 panel.setFPSDisplayed(true);
 
kamerapaneli.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));
executor.execute(this);
 }
    
    
    
    
    
    
    @Override
    public void run() {
        
        do {            
            try { 
                Thread.sleep(100);
                
            } catch (InterruptedException e) {
          e.printStackTrace();
            }
         Result sonuc= null;
            BufferedImage goruntuImage=null;
            if(kamera.isOpen())
            {
                
           if((goruntuImage=kamera.getImage())==null)
           {
           continue;
           
           }     
                LuminanceSource parlakkaynagı=new  BufferedImageLuminanceSource(goruntuImage);
                BinaryBitmap bitmap=new BinaryBitmap(new HybridBinarizer(parlakkaynagı));
                
                try {
                    sonuc= new MultiFormatReader().decode(bitmap);
                } catch (Exception e) {
                    //sonuç yoksa
                }
                
            }
            if(sonuc!=null)
            {
            qrtexti.setText(sonuc.getText());
             veriekle();
           //  qrkontrol.setText("EKLEME BAŞARILI");
            }
        }while (true);
        
        } 

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r,"Benim Olan");
        t.setDaemon(true);
        return t;
    }
}
