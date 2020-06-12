
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GurkanSenturk
 */ 
public class KatilimciEkrani extends javax.swing.JDialog {
    DefaultTableModel model;// büyük tablo
    DefaultTableModel model2; // küçük etkinlik tablosu
    üyelerislemleri islemler=new üyelerislemleri();
  
    public KatilimciEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    model = (DefaultTableModel) katilimci_tablo.getModel();
    model2=(DefaultTableModel)etkinlik_table.getModel();
   // katilimcigoruntule();
    etkinlikgoruntule();
     //bunu modeli tekrar tekrar oluşturmak zorunda kalmamak için bu kodu yazdım
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        katilimci_tablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_soyad = new javax.swing.JTextField();
        text_ad = new javax.swing.JTextField();
        text_bolüm = new javax.swing.JTextField();
        etkinlik_liste = new javax.swing.JButton();
        buton_güncelle = new javax.swing.JButton();
        eklebuton = new javax.swing.JButton();
        buton_sil = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        arama_text = new javax.swing.JTextField();
        geritusu = new javax.swing.JButton();
        text_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        etkinlik_table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        mesaj_yazisi_etkinlik = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        katilimci_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ad", "Soyad", "Bölüm", "Katılım Sayısı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        katilimci_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                katilimci_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(katilimci_tablo);
        if (katilimci_tablo.getColumnModel().getColumnCount() > 0) {
            katilimci_tablo.getColumnModel().getColumn(0).setResizable(false);
            katilimci_tablo.getColumnModel().getColumn(1).setResizable(false);
            katilimci_tablo.getColumnModel().getColumn(2).setResizable(false);
            katilimci_tablo.getColumnModel().getColumn(3).setResizable(false);
            katilimci_tablo.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setText("Etkinliği Seçin:");

        jLabel2.setText("Ad:");

        jLabel3.setText("Soyad:");

        jLabel4.setText("Bölüm:");

        etkinlik_liste.setText("Listele");
        etkinlik_liste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etkinlik_listeActionPerformed(evt);
            }
        });

        buton_güncelle.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        buton_güncelle.setText("GÜNCELLE");
        buton_güncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_güncelleActionPerformed(evt);
            }
        });

        eklebuton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        eklebuton.setText("EKLE");
        eklebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eklebutonActionPerformed(evt);
            }
        });

        buton_sil.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        buton_sil.setText("SİL");
        buton_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_silActionPerformed(evt);
            }
        });

        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arama.png"))); // NOI18N

        arama_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_textKeyReleased(evt);
            }
        });

        geritusu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerii.png"))); // NOI18N
        geritusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geritusuActionPerformed(evt);
            }
        });

        jLabel6.setText("ID:");

        jLabel7.setText("(ID Güncellenemez)");

        etkinlik_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Etkinliğin Adı:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(etkinlik_table);
        if (etkinlik_table.getColumnModel().getColumnCount() > 0) {
            etkinlik_table.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("İşlemler Bölümü:");

        mesaj_yazisi_etkinlik.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        mesaj_yazisi_etkinlik.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(geritusu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(etkinlik_liste, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mesaj_yazisi_etkinlik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(eklebuton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(buton_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLabel7))
                                                    .addComponent(buton_güncelle)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel6)
                                                .addGap(21, 21, 21))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(text_ad)
                                                .addComponent(text_soyad)
                                                .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(text_bolüm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arama_text, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(geritusu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(text_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_bolüm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eklebuton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_güncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etkinlik_liste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mesaj_yazisi_etkinlik, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mesaj_yazisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arama_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void geritusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geritusuActionPerformed
AnaEkran ae=new AnaEkran();
        setVisible(false);
        ae.setVisible(true);


    }//GEN-LAST:event_geritusuActionPerformed

   
    
    
    
    
    
    
    
    public void dinamikara(String ara) //arama çubuğu metodu
{
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
katilimci_tablo.setRowSorter(tr);
 tr.setRowFilter(RowFilter.regexFilter(ara));

}
    private void arama_textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_textKeyReleased
String ara = arama_text.getText();
dinamikara(ara);
    }//GEN-LAST:event_arama_textKeyReleased

    private void eklebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eklebutonActionPerformed
  mesaj_yazisi.setText("");
  String id = text_id.getText();
  String ad=text_ad.getText();
  String soyad =text_soyad.getText();
  String bolum = text_bolüm.getText();
   int selectedrow=katilimci_tablo.getSelectedRow();
   int selectedrow2=etkinlik_table.getSelectedRow();
   String etkinlikismi = (String)model2.getValueAt(selectedrow2, 0);
  islemler.katilimciekle(id, ad, soyad, bolum,etkinlikismi);
        katilimcigoruntule(etkinlikismi);
  mesaj_yazisi.setText("Ekleme işlemi Başarıyla Tamamlandı.");

    }//GEN-LAST:event_eklebutonActionPerformed
// ekleme butonu
    private void katilimci_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_katilimci_tabloMouseClicked
       
        int selectedrow=katilimci_tablo.getSelectedRow(); // burada tablodan veri seçtiğimizde textboxlara gönderim yapacağım
        text_id.setText(model.getValueAt(selectedrow, 0).toString());
        text_ad.setText(model.getValueAt(selectedrow, 1).toString());
        
        text_soyad.setText(model.getValueAt(selectedrow, 2).toString());
        
        text_bolüm.setText(model.getValueAt(selectedrow, 3).toString());
        

    }//GEN-LAST:event_katilimci_tabloMouseClicked

    private void buton_güncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_güncelleActionPerformed
        String ad = text_ad.getText();
        String soyad = text_soyad.getText();
        String bolum = text_bolüm.getText();
        int selectedrow=katilimci_tablo.getSelectedRow();
        int selectedrow2= etkinlik_table.getSelectedRow();
        if(selectedrow==-1){
            
        if(model.getRowCount()==0) mesaj_yazisi.setText("Tablo şuan boş");
        else   {mesaj_yazisi.setText("Lütfen Güncellenecek Katılımcıyı Seçin"); }  
          
        }
        else 
        { String etkinlikismi = (String)model2.getValueAt(selectedrow2, 0);
            int id=(int)model.getValueAt(selectedrow, 0);
islemler.katilimciguncelle(id, ad, soyad, bolum, etkinlikismi);
katilimcigoruntule(etkinlikismi);
mesaj_yazisi.setText("Güncelleme Başarılı!");

        }
            

    }//GEN-LAST:event_buton_güncelleActionPerformed

    private void buton_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_silActionPerformed
        mesaj_yazisi.setText("");
        int selectedrow=katilimci_tablo.getSelectedRow();
        int selectedrow2= etkinlik_table.getSelectedRow();
        
 if(selectedrow==-1){
            
        if(model.getRowCount()==0) mesaj_yazisi.setText("Tablo şuan boş");
        else   {mesaj_yazisi.setText("Lütfen Silinecek Katılımcıyı Seçin"); }  
          
        }
        else 
        { int id=(int)model.getValueAt(selectedrow, 0); 
    String ad=(String)model2.getValueAt(selectedrow2, 0); 
    
           
           islemler.katilimcisil(id, ad);
           
            katilimcigoruntule(ad);
           
           mesaj_yazisi.setText("Çalışan başarıyla silindi...");
           
        }


    }//GEN-LAST:event_buton_silActionPerformed

    private void etkinlik_listeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etkinlik_listeActionPerformed
        mesaj_yazisi_etkinlik.setText("");
        int selectedrow=etkinlik_table.getSelectedRow();
        
 if(selectedrow==-1){
            
        if(model2.getRowCount()==0) mesaj_yazisi_etkinlik.setText("Tablo şuan boş");
        else   {mesaj_yazisi_etkinlik.setText("Lütfen Listelenecek Etkinliği Seçin"); }  
          
        }
        else 
        {
            String ad=(String)model2.getValueAt(selectedrow, 0); 
mesaj_yazisi_etkinlik.setText("Şuan '"+ad+"' tablosunu görüntülüyorsunuz.");
            katilimcigoruntule(ad);
        }


    
    }//GEN-LAST:event_etkinlik_listeActionPerformed

    /**
     * @param args the command line arguments
     */
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KatilimciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KatilimciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KatilimciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KatilimciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KatilimciEkrani dialog = new KatilimciEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_text;
    private javax.swing.JButton buton_güncelle;
    private javax.swing.JButton buton_sil;
    private javax.swing.JButton eklebuton;
    private javax.swing.JButton etkinlik_liste;
    private javax.swing.JTable etkinlik_table;
    private javax.swing.JButton geritusu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable katilimci_tablo;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JLabel mesaj_yazisi_etkinlik;
    private javax.swing.JTextField text_ad;
    private javax.swing.JTextField text_bolüm;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField text_soyad;
    // End of variables declaration//GEN-END:variables
}
