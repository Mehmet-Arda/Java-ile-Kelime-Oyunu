
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import java.lang.Math;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marda
 */
public class KelimeOyunu extends javax.swing.JFrame {

    
    public KelimeOyunu() {
        initComponents();
        btnCevapla.setEnabled(false);
        txtCevap.setEnabled(false);
        btnIpucu.setEnabled(false);
        lbl0.setVisible(false);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lblCevapSuresi.setText("20");
        lblCevapSuresi.setEnabled(false);
        lblCevapSuresi.setVisible(false);
        btnSiradakiSoru.setEnabled(false);
        btnSureyiDurdur.setEnabled(false);
        lblSoruPuani.setVisible(false);
        lblYarismaciPuani.setVisible(false);
        lblDakika.setText("4");
        lblSaniye.setText("0");
        lblDakika.setVisible(false);
        lblSaniye.setVisible(false);
        btnYarismayiBitir.setEnabled(false);
        btnYarismayiBitir.setVisible(false);
        
        lblSoru.setVisible(false);
        btnCevapla.setVisible(false);
        btnIpucu.setVisible(false);
        btnSiradakiSoru.setVisible(false);
        btnSureyiDurdur.setVisible(false);
        txtCevap.setVisible(false);
        //btnYarismayaBasla.setAlignmentX(-20);
        pnlYarisma.setVisible(false);
        pnlYarisma.setEnabled(false);
        pnlSonuc.setVisible(false);
        pnlSonuc.setEnabled(false);
        //pnlYarismaciSonuc.setVisible(false);
        pnlGiris.setVisible(true);
        pnlGiris.setEnabled(true);
        btnYarismayaGec.setEnabled(false);
        lblYarisanIsmiSoyismi.setVisible(false);
        
        lblCevapTepkisi.setVisible(false);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        pnlGiris = new javax.swing.JPanel();
        lblİsim = new javax.swing.JLabel();
        lblSoyisim = new javax.swing.JLabel();
        txtIsim = new javax.swing.JTextField();
        txtSoyisim = new javax.swing.JTextField();
        btnYarismaciEkle = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoru = new javax.swing.JTextField();
        txtCvp = new javax.swing.JTextField();
        btnSoruCevapEkle = new javax.swing.JButton();
        btnYarismayaGec = new javax.swing.JButton();
        lblSoruEklendi = new javax.swing.JLabel();
        lblYarismaciEklendi = new javax.swing.JLabel();
        pnlYarisma = new javax.swing.JPanel();
        lblYarismaciPuani = new javax.swing.JLabel();
        lblSoruPuani = new javax.swing.JLabel();
        lblSoru = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pnlCevap = new javax.swing.JPanel();
        lbl0 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        btnCevapla = new javax.swing.JButton();
        txtCevap = new javax.swing.JTextField();
        btnSureyiDurdur = new javax.swing.JButton();
        btnSiradakiSoru = new javax.swing.JButton();
        lblCevapSuresi = new javax.swing.JLabel();
        btnIpucu = new javax.swing.JButton();
        btnYarismayiBitir = new javax.swing.JButton();
        btnYarismayaBasla = new javax.swing.JButton();
        lblDakika = new javax.swing.JLabel();
        lblSaniye = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblYarisanIsmiSoyismi = new javax.swing.JLabel();
        lblCevapTepkisi = new javax.swing.JLabel();
        pnlSonuc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(577, 577, 577))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(612, 612, 612)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.textHighlight);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(new java.awt.Color(153, 153, 153));
        setSize(new java.awt.Dimension(840, 567));

        pnlGiris.setBackground(new java.awt.Color(51, 51, 51));
        pnlGiris.setPreferredSize(new java.awt.Dimension(814, 567));

        lblİsim.setBackground(new java.awt.Color(0, 153, 255));
        lblİsim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblİsim.setForeground(new java.awt.Color(0, 204, 255));
        lblİsim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblİsim.setText("İSİM");
        lblİsim.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        lblSoyisim.setBackground(new java.awt.Color(0, 153, 255));
        lblSoyisim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoyisim.setForeground(new java.awt.Color(0, 204, 255));
        lblSoyisim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoyisim.setText("SOYİSİM");
        lblSoyisim.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        txtIsim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtIsim.setForeground(new java.awt.Color(0, 204, 0));

        txtSoyisim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSoyisim.setForeground(new java.awt.Color(0, 204, 0));

        btnYarismaciEkle.setBackground(new java.awt.Color(0, 102, 255));
        btnYarismaciEkle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnYarismaciEkle.setForeground(new java.awt.Color(255, 255, 255));
        btnYarismaciEkle.setText("YARIŞMACI EKLE");
        btnYarismaciEkle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnYarismaciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYarismaciEkleActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 153, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SORU");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CEVAP");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        txtSoru.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSoru.setForeground(new java.awt.Color(255, 0, 0));

        txtCvp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCvp.setForeground(new java.awt.Color(255, 0, 0));

        btnSoruCevapEkle.setBackground(new java.awt.Color(0, 102, 255));
        btnSoruCevapEkle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSoruCevapEkle.setForeground(new java.awt.Color(255, 255, 255));
        btnSoruCevapEkle.setText("SORU-CEVAP EKLE");
        btnSoruCevapEkle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnSoruCevapEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoruCevapEkleActionPerformed(evt);
            }
        });

        btnYarismayaGec.setBackground(new java.awt.Color(0, 102, 255));
        btnYarismayaGec.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnYarismayaGec.setForeground(new java.awt.Color(255, 255, 255));
        btnYarismayaGec.setText("YARIŞMAYA GEÇ");
        btnYarismayaGec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnYarismayaGec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYarismayaGecActionPerformed(evt);
            }
        });

        lblSoruEklendi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSoruEklendi.setForeground(new java.awt.Color(255, 255, 255));

        lblYarismaciEklendi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblYarismaciEklendi.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlGirisLayout = new javax.swing.GroupLayout(pnlGiris);
        pnlGiris.setLayout(pnlGirisLayout);
        pnlGirisLayout.setHorizontalGroup(
            pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGirisLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGirisLayout.createSequentialGroup()
                        .addGroup(pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGirisLayout.createSequentialGroup()
                                .addComponent(txtCvp, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSoruCevapEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnYarismayaGec, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtSoru, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoruEklendi, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlGirisLayout.createSequentialGroup()
                        .addComponent(lblİsim, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIsim, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGirisLayout.createSequentialGroup()
                        .addComponent(lblSoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnYarismaciEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 212, Short.MAX_VALUE))
            .addGroup(pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlGirisLayout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(lblYarismaciEklendi, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );
        pnlGirisLayout.setVerticalGroup(
            pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGirisLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIsim)
                    .addComponent(lblİsim, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnYarismaciEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoyisim, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSoru)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSoruCevapEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCvp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnYarismayaGec, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSoruEklendi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(pnlGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlGirisLayout.createSequentialGroup()
                    .addGap(197, 197, 197)
                    .addComponent(lblYarismaciEklendi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(346, Short.MAX_VALUE)))
        );

        pnlYarisma.setBackground(new java.awt.Color(51, 51, 51));
        pnlYarisma.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlYarisma.setNextFocusableComponent(pnlCevap);
        pnlYarisma.setPreferredSize(new java.awt.Dimension(720, 540));

        lblYarismaciPuani.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblYarismaciPuani.setForeground(new java.awt.Color(255, 255, 255));
        lblYarismaciPuani.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYarismaciPuani.setText("10000");
        lblYarismaciPuani.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        lblSoruPuani.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoruPuani.setForeground(new java.awt.Color(255, 255, 255));
        lblSoruPuani.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoruPuani.setText("1000");
        lblSoruPuani.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        lblSoru.setBackground(new java.awt.Color(153, 0, 0));
        lblSoru.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoru.setForeground(new java.awt.Color(255, 255, 255));
        lblSoru.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        lblSoru.setOpaque(true);

        jSeparator2.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        pnlCevap.setBackground(new java.awt.Color(51, 51, 51));

        lbl0.setBackground(new java.awt.Color(255, 51, 51));
        lbl0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl0.setForeground(new java.awt.Color(255, 255, 255));
        lbl0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        lbl0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl1.setBackground(new java.awt.Color(255, 255, 255));
        lbl1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl2.setBackground(new java.awt.Color(255, 255, 255));
        lbl2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl3.setBackground(new java.awt.Color(255, 255, 255));
        lbl3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl4.setBackground(new java.awt.Color(255, 255, 255));
        lbl4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        lbl4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl5.setBackground(new java.awt.Color(255, 255, 255));
        lbl5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl6.setBackground(new java.awt.Color(255, 255, 255));
        lbl6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl6.setForeground(new java.awt.Color(255, 255, 255));
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));

        lbl7.setBackground(new java.awt.Color(51, 51, 51));
        lbl7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl7.setForeground(new java.awt.Color(255, 255, 255));
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));

        lbl8.setBackground(new java.awt.Color(255, 255, 255));
        lbl8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl8.setForeground(new java.awt.Color(255, 255, 255));
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));

        lbl9.setBackground(new java.awt.Color(255, 255, 255));
        lbl9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl9.setForeground(new java.awt.Color(255, 255, 255));
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));

        javax.swing.GroupLayout pnlCevapLayout = new javax.swing.GroupLayout(pnlCevap);
        pnlCevap.setLayout(pnlCevapLayout);
        pnlCevapLayout.setHorizontalGroup(
            pnlCevapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCevapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pnlCevapLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbl0, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl9});

        pnlCevapLayout.setVerticalGroup(
            pnlCevapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCevapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCevapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(lbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnCevapla.setBackground(new java.awt.Color(0, 102, 255));
        btnCevapla.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCevapla.setForeground(new java.awt.Color(255, 255, 255));
        btnCevapla.setText("Cevapla");
        btnCevapla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnCevapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCevaplaActionPerformed(evt);
            }
        });

        txtCevap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCevap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCevap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtCevap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCevapActionPerformed(evt);
            }
        });

        btnSureyiDurdur.setBackground(new java.awt.Color(51, 51, 51));
        btnSureyiDurdur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSureyiDurdur.setForeground(new java.awt.Color(255, 255, 255));
        btnSureyiDurdur.setIcon(new javax.swing.ImageIcon("C:\\Users\\marda\\Desktop\\Button-Red - Kopya.png")); // NOI18N
        btnSureyiDurdur.setText("Süreyi Durdur");
        btnSureyiDurdur.setBorder(null);
        btnSureyiDurdur.setBorderPainted(false);
        btnSureyiDurdur.setOpaque(false);
        btnSureyiDurdur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSureyiDurdurActionPerformed(evt);
            }
        });

        btnSiradakiSoru.setBackground(new java.awt.Color(0, 102, 255));
        btnSiradakiSoru.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSiradakiSoru.setForeground(new java.awt.Color(255, 255, 255));
        btnSiradakiSoru.setText("Sıradaki Soru");
        btnSiradakiSoru.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnSiradakiSoru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiradakiSoruActionPerformed(evt);
            }
        });

        lblCevapSuresi.setBackground(new java.awt.Color(102, 102, 102));
        lblCevapSuresi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCevapSuresi.setForeground(new java.awt.Color(0, 204, 0));
        lblCevapSuresi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCevapSuresi.setText("20");
        lblCevapSuresi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        btnIpucu.setBackground(new java.awt.Color(0, 102, 255));
        btnIpucu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIpucu.setForeground(new java.awt.Color(255, 255, 255));
        btnIpucu.setText("İpucu");
        btnIpucu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnIpucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIpucuActionPerformed(evt);
            }
        });

        btnYarismayiBitir.setBackground(new java.awt.Color(51, 51, 51));
        btnYarismayiBitir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnYarismayiBitir.setForeground(new java.awt.Color(255, 255, 255));
        btnYarismayiBitir.setIcon(new javax.swing.ImageIcon("C:\\Users\\marda\\Desktop\\cross-sign.png")); // NOI18N
        btnYarismayiBitir.setText("Yarışmayı Bitir");
        btnYarismayiBitir.setBorder(null);
        btnYarismayiBitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYarismayiBitirActionPerformed(evt);
            }
        });

        btnYarismayaBasla.setBackground(new java.awt.Color(51, 51, 51));
        btnYarismayaBasla.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnYarismayaBasla.setForeground(new java.awt.Color(255, 255, 255));
        btnYarismayaBasla.setIcon(new javax.swing.ImageIcon("C:\\Users\\marda\\Desktop\\green-play-button-png - Kopya.png")); // NOI18N
        btnYarismayaBasla.setText("Yarışmaya Başla");
        btnYarismayaBasla.setBorder(null);
        btnYarismayaBasla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYarismayaBaslaActionPerformed(evt);
            }
        });

        lblDakika.setBackground(new java.awt.Color(102, 102, 102));
        lblDakika.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDakika.setForeground(new java.awt.Color(0, 204, 0));
        lblDakika.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDakika.setText("5");
        lblDakika.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        lblSaniye.setBackground(new java.awt.Color(102, 102, 102));
        lblSaniye.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSaniye.setForeground(new java.awt.Color(0, 204, 0));
        lblSaniye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaniye.setText("0");
        lblSaniye.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jSeparator3.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        lblYarisanIsmiSoyismi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblYarisanIsmiSoyismi.setForeground(new java.awt.Color(51, 255, 102));
        lblYarisanIsmiSoyismi.setText("Yarışmacı İsmi Soyismi");

        lblCevapTepkisi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCevapTepkisi.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlYarismaLayout = new javax.swing.GroupLayout(pnlYarisma);
        pnlYarisma.setLayout(pnlYarismaLayout);
        pnlYarismaLayout.setHorizontalGroup(
            pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlYarismaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlYarismaLayout.createSequentialGroup()
                        .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator2)
                            .addComponent(lblSoru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlCevap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlYarismaLayout.createSequentialGroup()
                                .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblYarismaciPuani, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(lblSoruPuani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(lblYarisanIsmiSoyismi, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlYarismaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblDakika, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSaniye, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnYarismayaBasla, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnYarismayiBitir, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(pnlYarismaLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlYarismaLayout.createSequentialGroup()
                        .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlYarismaLayout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(lblCevapSuresi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCevapTepkisi, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSiradakiSoru, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSureyiDurdur, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(pnlYarismaLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(txtCevap, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCevapla, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIpucu, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlYarismaLayout.setVerticalGroup(
            pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlYarismaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblSoruPuani, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYarismaciPuani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYarisanIsmiSoyismi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSoru, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pnlCevap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlYarismaLayout.createSequentialGroup()
                        .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCevap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCevapla, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIpucu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSureyiDurdur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCevapSuresi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiradakiSoru, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCevapTepkisi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(pnlYarismaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYarismayiBitir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYarismayaBasla, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaniye, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDakika, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pnlSonuc.setBackground(new java.awt.Color(51, 51, 51));
        pnlSonuc.setPreferredSize(new java.awt.Dimension(840, 567));

        tbl.setBackground(new java.awt.Color(0, 102, 204));
        tbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tbl.setForeground(new java.awt.Color(255, 255, 255));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "AD", "SOYAD", "PUAN", "KALAN SÜRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setResizable(false);
            tbl.getColumnModel().getColumn(1).setResizable(false);
            tbl.getColumnModel().getColumn(2).setResizable(false);
            tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout pnlSonucLayout = new javax.swing.GroupLayout(pnlSonuc);
        pnlSonuc.setLayout(pnlSonucLayout);
        pnlSonucLayout.setHorizontalGroup(
            pnlSonucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSonucLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSonucLayout.setVerticalGroup(
            pnlSonucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSonucLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlYarisma, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlGiris, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlYarisma, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlGiris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList <String> cevapsızSorular =new ArrayList();
    ArrayList <Integer> kontrol= new ArrayList();
    ArrayList <Integer> kontrol1=new ArrayList();
    ArrayList <Integer> adet=new ArrayList();
    DefaultListModel model=new DefaultListModel();
    DefaultTableModel model2=new DefaultTableModel();
    File dosya;
    
     int index=0;
     int sors_adedi=0;
     String cevap;
     String soru;
     int yarismaciPuani=0;
     int soruPuani=0;
     int harfAdedi=0;
     
     int YarisanYarismaci=0;
     int kacinciYarismaci=0;
     
     int ipucuTıklanmaAdedi=0;
    public void DosyaOku(String yol)
    {
        int adet=0;
        dosya=new File(yol);
        String s;
        try 
        {
            try (Scanner okuyucu = new Scanner(dosya,"UTF8"))
            {
                okuyucu.useDelimiter("/");
                while(okuyucu.hasNext())
                {
                    s=okuyucu.next();
                    cevapsızSorular.add(s.toUpperCase());
                    adet++;
                    okuyucu.next();
                }
                this.adet.add(adet);
                okuyucu.close();
            }
            
        } catch (FileNotFoundException ex) 
        {
            Logger.getLogger(KelimeOyunu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public int rastgeleSoru(int harf)
    {
       
        switch(harf)
        {
            case 4 -> 
            {
                do
                {
                    
                    index=(int) Math.round(Math.random()*(adet.get(0)-1)+0);
                    
                } while (kontrol.contains(index));
                kontrol.add(index);
                return index;
            }
        
            case 5 -> {
                do
                {
                    
                    index=(int) Math.round((Math.random()*(adet.get(1)-1))+adet.get(0));
                    
                } while (kontrol.contains(index));
                kontrol.add(index);
                return index;
            }
                
            case 6 -> {
                do
                {
                    
                    index=(int) Math.round(Math.random()*(adet.get(2)-1)+
                            adet.get(0)+adet.get(1));
                    
                } while (kontrol.contains(index));
                kontrol.add(index);
                return index;
            }
                
            case 7 -> {
                do
                {
                    
                    index=(int) Math.round(Math.random()*(adet.get(3)-1)+
                            adet.get(0)+adet.get(1)+adet.get(2));
                    
                } while (kontrol.contains(index));
                kontrol.add(index);
                return index;
            }
            case 8 -> {
                do
                {
                    
                    index=(int) Math.round(Math.random()*(adet.get(4)-1)+
                            adet.get(0)+adet.get(1)+adet.get(2)+adet.get(3));
                    
                } while (kontrol.contains(index));
                kontrol.add(index);
                return index;
            }
            case 9 -> {
                do
                {
                    
                    index=(int) Math.round(Math.random()*(adet.get(5)-1)+
                            adet.get(0)+adet.get(1)+adet.get(2)+adet.get(3)+adet.get(4));
                    
                } while (kontrol.contains(index));
                kontrol.add(index);
                return index;
            }
            case 10 -> {
                do
                {
                    
                    index=(int) Math.round(Math.random()*(adet.get(6)-1)+
                            adet.get(0)+adet.get(1)+adet.get(2)+adet.get(3)+adet.get(4)+adet.get(5));
                    
                } while (kontrol.contains(index));
                kontrol.add(index);
                return index;
            }
                
        
        }
        return 0;
    }
    
    public void soruYazdır()
    {
        btnIpucu.setEnabled(true);
        kontrol1.clear();
        lblCevapSuresi.setVisible(false);
        sors_adedi++;
        ipucuTıklanmaAdedi=0;
        txtCevap.setText("");
        if(sors_adedi>0&&sors_adedi<=2)
        {
            soruPuani=400;
            lblSoruPuani.setText(String.valueOf(soruPuani));
            harfAdedi=4;
            lbl0.setVisible(true);
            lbl1.setVisible(true);
            lbl2.setVisible(true);
            lbl3.setVisible(true);
            
       
        }
        else if(sors_adedi>2&&sors_adedi<=4)
        {
            soruPuani=500;
            lblSoruPuani.setText(String.valueOf(soruPuani));
            harfAdedi=5;
            lbl4.setVisible(true);
        
        }
        else if(sors_adedi>4&&sors_adedi<=6)
        {
            soruPuani=600;
            lblSoruPuani.setText(String.valueOf(soruPuani));
            harfAdedi=6;
            lbl5.setVisible(true);
        }
        else if(sors_adedi>6&&sors_adedi<=8)
        {
            soruPuani=700;
            lblSoruPuani.setText(String.valueOf(soruPuani));
            harfAdedi=7;
            lbl6.setVisible(true);
        }
        else if(sors_adedi>8&&sors_adedi<=10)
        {
            soruPuani=800;
            lblSoruPuani.setText(String.valueOf(soruPuani));
            harfAdedi=8;
            lbl7.setVisible(true);
        }
        else if(sors_adedi>10&&sors_adedi<=12)
        {
            soruPuani=900;
            lblSoruPuani.setText(String.valueOf(soruPuani));
            harfAdedi=9;
            lbl8.setVisible(true);
        }
        else if(sors_adedi>12&&sors_adedi<=14)
        {
            soruPuani=1000;
            lblSoruPuani.setText(String.valueOf(soruPuani));
            harfAdedi=10;
            lbl9.setVisible(true);
        }
        
        
        index=rastgeleSoru(harfAdedi);
        String sc=cevapsızSorular.get(index);
        int ind=sc.indexOf("-");
        cevap=(sc.substring(ind+1));
        soru=(sc.substring(0, ind));
        lblSoru.setText(soru);
        
        
    }
     
    
    Timer timer1;
    Timer timer2;
    public void surebasla1()
    {
        timer1=new Timer();
        TimerTask task=new TimerTask() 
        {
            
            int dakika=Integer.parseInt(lblDakika.getText());
            int saniye=Integer.parseInt(lblSaniye.getText());
            @Override
            public void run() 
            {
                lblDakika.setText(String.valueOf(dakika));
                lblSaniye.setText(String.valueOf(saniye));
                if(saniye<=0&&dakika!=0)
                {
                    if(dakika>0)
                    {
                        dakika--;
                    }
                    saniye=60; 
                }
                if(saniye>=0)
                {
                    saniye--;
                }
                if(dakika==0&&saniye==0)
                {
                    System.out.println("Süre Bitti.");
                    suredurdur1();
                    YarismayiBitir();
                    
                }
            }
        };
        timer1.schedule(task, 0, 1000);
    }
    
    public void surebasla2()
    {
        timer2=new Timer();
        TimerTask task=new TimerTask() 
        {
            int saniye=Integer.parseInt(lblCevapSuresi.getText());
            
            @Override
            public void run() 
            {
                
                if(saniye>0)
                {
                    saniye--;
                }
                
                lblCevapSuresi.setText(String.valueOf(saniye));
                
                if(saniye==0)
                {
                    suredurdur2();
                    btnSiradakiSoru.setEnabled(true);
                    btnCevapla.setEnabled(false);
                    cevabıYaz();
                    CevapBilinemedi();
                    if(sors_adedi==14)
                    {
                        YarismayiBitir();
                    }
                    
                }
               
                
                
                
            }
        };
        timer2.schedule(task, 0, 1000);
    }
    public void CevapBilinemedi()
    {
        switch(harfAdedi)
                    {
                        case 4 -> {
                            yarismaciPuani=yarismaciPuani-400;
                            lblYarismaciPuani.setText(String.valueOf(yarismaciPuani));
                        }
                        case 5 -> {
                            yarismaciPuani=yarismaciPuani-500;
                            lblYarismaciPuani.setText(String.valueOf(yarismaciPuani));
                        }
                        case 6 -> {
                            yarismaciPuani=yarismaciPuani-600;
                            lblYarismaciPuani.setText(String.valueOf(yarismaciPuani));
                        }
                        case 7 -> {
                            yarismaciPuani=yarismaciPuani-700;
                            lblYarismaciPuani.setText(String.valueOf(yarismaciPuani));
                        }
                        case 8 -> {
                            yarismaciPuani=yarismaciPuani-800;
                            lblYarismaciPuani.setText(String.valueOf(yarismaciPuani));
                        }
                        case 9 -> {
                            yarismaciPuani=yarismaciPuani-900;
                            lblYarismaciPuani.setText(String.valueOf(yarismaciPuani));
                        }
                        case 10 -> {
                            yarismaciPuani=yarismaciPuani-1000;
                            lblYarismaciPuani.setText(String.valueOf(yarismaciPuani));
                        }
                    }
    }
    public void suredurdur1()
    {
       timer1.cancel();
    }
    public void suredurdur2()
    {
        timer2.cancel();
    }
    public void cevabıSil()
    {
        lbl0.setText("");
        lbl1.setText("");
        lbl2.setText("");
        lbl3.setText("");
        lbl4.setText("");
        lbl5.setText("");
        lbl6.setText("");
        lbl7.setText("");
        lbl8.setText("");
        lbl9.setText("");
        txtCevap.setText("");
    }
    public void cevabıYaz()
    {
        int h=cevap.length();
        switch(h)
        {
            case 4 -> {
                lbl0.setText(Character.toString(cevap.charAt(0)).toUpperCase());
                lbl1.setText(Character.toString(cevap.charAt(1)).toUpperCase());
                lbl2.setText(Character.toString(cevap.charAt(2)).toUpperCase());
                lbl3.setText(Character.toString(cevap.charAt(3)).toUpperCase());
            }
            case 5 -> {
                lbl0.setText(Character.toString(cevap.charAt(0)).toUpperCase());
                lbl1.setText(Character.toString(cevap.charAt(1)).toUpperCase());
                lbl2.setText(Character.toString(cevap.charAt(2)).toUpperCase());
                lbl3.setText(Character.toString(cevap.charAt(3)).toUpperCase());
                lbl4.setText(Character.toString(cevap.charAt(4)).toUpperCase());
            }
            case 6 -> {
                lbl0.setText(Character.toString(cevap.charAt(0)).toUpperCase());
                lbl1.setText(Character.toString(cevap.charAt(1)).toUpperCase());
                lbl2.setText(Character.toString(cevap.charAt(2)).toUpperCase());
                lbl3.setText(Character.toString(cevap.charAt(3)).toUpperCase());
                lbl4.setText(Character.toString(cevap.charAt(4)).toUpperCase());
                lbl5.setText(Character.toString(cevap.charAt(5)).toUpperCase());
            }
            case 7 -> {
                lbl0.setText(Character.toString(cevap.charAt(0)).toUpperCase());
                lbl1.setText(Character.toString(cevap.charAt(1)).toUpperCase());
                lbl2.setText(Character.toString(cevap.charAt(2)).toUpperCase());
                lbl3.setText(Character.toString(cevap.charAt(3)).toUpperCase());
                lbl4.setText(Character.toString(cevap.charAt(4)).toUpperCase());
                lbl5.setText(Character.toString(cevap.charAt(5)).toUpperCase());
                lbl6.setText(Character.toString(cevap.charAt(6)).toUpperCase());
            }
            case 8 -> {
                lbl0.setText(Character.toString(cevap.charAt(0)).toUpperCase());
                lbl1.setText(Character.toString(cevap.charAt(1)).toUpperCase());
                lbl2.setText(Character.toString(cevap.charAt(2)).toUpperCase());
                lbl3.setText(Character.toString(cevap.charAt(3)).toUpperCase());
                lbl4.setText(Character.toString(cevap.charAt(4)).toUpperCase());
                lbl5.setText(Character.toString(cevap.charAt(5)).toUpperCase());
                lbl6.setText(Character.toString(cevap.charAt(6)).toUpperCase());
                lbl7.setText(Character.toString(cevap.charAt(7)).toUpperCase());
            }
            case 9 -> {
                lbl0.setText(Character.toString(cevap.charAt(0)).toUpperCase());
                lbl1.setText(Character.toString(cevap.charAt(1)).toUpperCase());
                lbl2.setText(Character.toString(cevap.charAt(2)).toUpperCase());
                lbl3.setText(Character.toString(cevap.charAt(3)).toUpperCase());
                lbl4.setText(Character.toString(cevap.charAt(4)).toUpperCase());
                lbl5.setText(Character.toString(cevap.charAt(5)).toUpperCase());
                lbl6.setText(Character.toString(cevap.charAt(6)).toUpperCase());
                lbl7.setText(Character.toString(cevap.charAt(7)).toUpperCase());
                lbl8.setText(Character.toString(cevap.charAt(8)).toUpperCase());
            }
            case 10 -> {
                lbl0.setText(Character.toString(cevap.charAt(0)).toUpperCase());
                lbl1.setText(Character.toString(cevap.charAt(1)).toUpperCase());
                lbl2.setText(Character.toString(cevap.charAt(2)).toUpperCase());
                lbl3.setText(Character.toString(cevap.charAt(3)).toUpperCase());
                lbl4.setText(Character.toString(cevap.charAt(4)).toUpperCase());
                lbl5.setText(Character.toString(cevap.charAt(5)).toUpperCase());
                lbl6.setText(Character.toString(cevap.charAt(6)).toUpperCase());
                lbl7.setText(Character.toString(cevap.charAt(7)).toUpperCase());
                lbl8.setText(Character.toString(cevap.charAt(8)).toUpperCase());
                lbl9.setText(Character.toString(cevap.charAt(9)).toUpperCase());
                
            }
        }
        
    }
    public void YarismayiBitir()
    {
        switch(YarisanYarismaci)
        {
            case 1->
            {
                Yarismaci y1=new Yarismaci(String.valueOf(model2.getValueAt(YarisanYarismaci-1, 0)),String.valueOf(model2.getValueAt(YarisanYarismaci-1, 1)),YarisanYarismaci);
                y1.setPuan(yarismaciPuani);
                y1.setSure(lblDakika.getText()+"-"+lblSaniye.getText());
                model2.setValueAt(y1.getPuan(),YarisanYarismaci-1, 2);
                model2.setValueAt(y1.getSure(),YarisanYarismaci-1, 3);
            }
            case 2->{
                Yarismaci y2=new Yarismaci(String.valueOf(model2.getValueAt(YarisanYarismaci-1, 0)),String.valueOf(model2.getValueAt(YarisanYarismaci-1, 1)),YarisanYarismaci);
                y2.setPuan(yarismaciPuani);
                y2.setSure(lblDakika.getText()+"-"+lblSaniye.getText());
                model2.setValueAt(y2.getPuan(),YarisanYarismaci-1, 2);
                model2.setValueAt(y2.getSure(),YarisanYarismaci-1, 3);
            }
            case 3->{
                Yarismaci y3=new Yarismaci(String.valueOf(model2.getValueAt(YarisanYarismaci-1, 0)),String.valueOf(model2.getValueAt(YarisanYarismaci-1, 1)),YarisanYarismaci);
                y3.setPuan(yarismaciPuani);
                y3.setSure(lblDakika.getText()+"-"+lblSaniye.getText());
                model2.setValueAt(y3.getPuan(),YarisanYarismaci-1, 2);
                model2.setValueAt(y3.getSure(),YarisanYarismaci-1, 3);}
            case 4->{
                Yarismaci y4=new Yarismaci(String.valueOf(model2.getValueAt(YarisanYarismaci-1, 0)),String.valueOf(model2.getValueAt(YarisanYarismaci-1, 1)),YarisanYarismaci);
                y4.setPuan(yarismaciPuani);
                y4.setSure(lblDakika.getText()+"-"+lblSaniye.getText());
                model2.setValueAt(y4.getPuan(),YarisanYarismaci-1, 2);
                model2.setValueAt(y4.getSure(),YarisanYarismaci-1, 3);}
            case 5->
            {Yarismaci y5=new Yarismaci(String.valueOf(model2.getValueAt(YarisanYarismaci-1, 0)),String.valueOf(model2.getValueAt(YarisanYarismaci-1, 1)),YarisanYarismaci);
                y5.setPuan(yarismaciPuani);
                y5.setSure(lblDakika.getText()+"-"+lblSaniye.getText());
                model2.setValueAt(y5.getPuan(),YarisanYarismaci-1, 2);
                model2.setValueAt(y5.getSure(),YarisanYarismaci-1, 3);}
        }
        
        
        
        kontrol1.clear();
        btnYarismayiBitir.setEnabled(false);
        btnYarismayiBitir.setVisible(false);
        sors_adedi=0;
        lblSoru.setText("");
        btnYarismayaBasla.setEnabled(true);
        btnYarismayaBasla.setVisible(true);
        suredurdur1();
        cevabıSil();
        txtCevap.setText("");
        txtCevap.setEnabled(false);
        lbl0.setVisible(false);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        btnCevapla.setEnabled(false);
        txtCevap.setEnabled(false);
        btnIpucu.setEnabled(false);
        lblCevapSuresi.setText("20");
        lblCevapSuresi.setEnabled(false);
        lblCevapSuresi.setVisible(false);
        btnSiradakiSoru.setEnabled(false);
        btnSureyiDurdur.setEnabled(false);
        lblSoruPuani.setVisible(false);
        lblYarismaciPuani.setVisible(false);
        yarismaciPuani=0;
        soruPuani=0;
        harfAdedi=0;
        ipucuTıklanmaAdedi=0;
        lblDakika.setText("4");
        lblSaniye.setText("0");
        lblDakika.setVisible(false);
        lblSaniye.setVisible(false);
        btnYarismayaBasla.setEnabled(true);
        lblSoru.setVisible(false);
        btnCevapla.setVisible(false);
        btnIpucu.setVisible(false);
        btnSiradakiSoru.setVisible(false);
        btnSureyiDurdur.setVisible(false);
        txtCevap.setVisible(false);
        
        if(kacinciYarismaci==YarisanYarismaci)
        {
        pnlYarisma.setVisible(false);
        pnlYarisma.setEnabled(false);
        pnlSonuc.setEnabled(true);
        pnlSonuc.setVisible(true);
        }
        
        
        
    }
    boolean CevapDogrumu()
    {
        String cevaptxt=txtCevap.getText().toUpperCase();
       
       if(cevap.length()==cevaptxt.length())
       {
           if(cevap.equals(cevaptxt))
           {
               lblCevapTepkisi.setText("Tebrikler doğru cevap");
               suredurdur2();
               btnSiradakiSoru.setEnabled(true);
               btnCevapla.setEnabled(false);
               if(sors_adedi==14)
               {
                   YarismayiBitir();
               }
               return true;
               
           }
           
       }
       else if(cevap.length()<cevaptxt.length())
       {
           lblCevapTepkisi.setText("Cevap daha kısa bir kelimedir.");
           return false;
       }
       else
       {
           lblCevapTepkisi.setText("Cevap daha uzun bir kelimedir.");
           return false;
       }
       return false;
    }
    int kontrol2=0;
    public void DosyaYaz(String yol,String Soru,String Cvp)
    {
        File dosya=new File(yol);
        PrintWriter yazıcı;
        try 
            {
                yazıcı=new PrintWriter(new FileOutputStream(dosya,true));
                yazıcı.print(Soru+"-"+Cvp+"/");
                yazıcı.print("\n"+"/");
                yazıcı.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(KelimeOyunu.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    private void btnSoruCevapEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoruCevapEkleActionPerformed
        String Cvp=txtCvp.getText();
        String Soru=txtSoru.getText();
        String yol;
        
        
        switch(Cvp.length())
        {
            case 4 -> {
                yol="D:\\SoruVeCevaplar\\4Harfli.txt";
                DosyaYaz(yol,Soru,Cvp);
                lblSoruEklendi.setText("Soru-Cevap eklendi.");
            }
            case 5 -> {yol="D:\\SoruVeCevaplar\\5Harfli.txt";
                DosyaYaz(yol,Soru,Cvp);
                lblSoruEklendi.setText("Soru-Cevap eklendi.");
            }
            case 6 -> {yol="D:\\SoruVeCevaplar\\6Harfli.txt";
                DosyaYaz(yol,Soru,Cvp);
                lblSoruEklendi.setText("Soru-Cevap eklendi.");
            }
            case 7 -> {yol="D:\\SoruVeCevaplar\\7Harfli.txt";
                DosyaYaz(yol,Soru,Cvp);
                lblSoruEklendi.setText("Soru-Cevap eklendi.");
            }
            case 8 -> {yol="D:\\SoruVeCevaplar\\8Harfli.txt";
                DosyaYaz(yol,Soru,Cvp);
                lblSoruEklendi.setText("Soru-Cevap eklendi.");
            }
            case 9 -> {yol="D:\\SoruVeCevaplar\\9Harfli.txt";
                DosyaYaz(yol,Soru,Cvp);
                lblSoruEklendi.setText("Soru-Cevap eklendi.");
            }
            case 10 -> {yol="D:\\SoruVeCevaplar\\10Harfli.txt";
                DosyaYaz(yol,Soru,Cvp);
                lblSoruEklendi.setText("Soru-Cevap eklendi.");
            }
            default -> lblSoruEklendi.setText("Geçerli harf adedine sahip cevap giriniz.");
        }
        txtSoru.setText("");
        txtCvp.setText("");
        
    }//GEN-LAST:event_btnSoruCevapEkleActionPerformed

    private void btnYarismaciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYarismaciEkleActionPerformed
       kacinciYarismaci++;
       if(kacinciYarismaci==1){btnYarismayaGec.setEnabled(true);}
       model2=(DefaultTableModel)tbl.getModel();
       
       model2.setValueAt(txtIsim.getText(), kacinciYarismaci-1,0);
       model2.setValueAt(txtSoyisim.getText(), kacinciYarismaci-1,1);
       //tbl.setModel(model2);
       lblYarismaciEklendi.setText("Yarışmacı eklendi.");
       if(kacinciYarismaci==5){btnYarismaciEkle.setEnabled(false);}
       txtIsim.setText("");
       txtSoyisim.setText("");
        
        
    }//GEN-LAST:event_btnYarismaciEkleActionPerformed

    private void btnYarismayaGecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYarismayaGecActionPerformed
        pnlGiris.setVisible(false);
        pnlGiris.setEnabled(false);
        pnlYarisma.setVisible(true);
        pnlYarisma.setEnabled(true);
    }//GEN-LAST:event_btnYarismayaGecActionPerformed

    private void btnYarismayaBaslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYarismayaBaslaActionPerformed
        lblYarisanIsmiSoyismi.setVisible(true);
        lblYarisanIsmiSoyismi.setText(String.valueOf(model2.getValueAt(YarisanYarismaci,0))+" "+model2.getValueAt(YarisanYarismaci,1));
        kontrol1.clear();
        lblSoru.setVisible(true);
        btnCevapla.setVisible(true);
        btnIpucu.setVisible(true);
        btnSiradakiSoru.setVisible(true);
        btnSureyiDurdur.setVisible(true);
        txtCevap.setVisible(true);

        YarisanYarismaci++;
        lblDakika.setVisible(true);
        lblSaniye.setVisible(true);
        btnYarismayiBitir.setEnabled(true);
        btnYarismayiBitir.setVisible(true);
        surebasla1();
        lblYarismaciPuani.setText(String.valueOf(yarismaciPuani));
        lblSoruPuani.setVisible(true);
        lblYarismaciPuani.setVisible(true);
        btnSureyiDurdur.setEnabled(true);
        txtCevap.setEnabled(true);
        btnIpucu.setEnabled(true);
        String yol;
        if(YarisanYarismaci==1)
        {
            yol="D:\\SoruVeCevaplar\\4Harfli.txt";
            DosyaOku(yol);
            yol="D:\\SoruVeCevaplar\\5Harfli.txt";
            DosyaOku(yol);
            yol="D:\\SoruVeCevaplar\\6Harfli.txt";
            DosyaOku(yol);
            yol="D:\\SoruVeCevaplar\\7Harfli.txt";
            DosyaOku(yol);
            yol="D:\\SoruVeCevaplar\\8Harfli.txt";
            DosyaOku(yol);
            yol="D:\\SoruVeCevaplar\\9Harfli.txt";
            DosyaOku(yol);
            yol="D:\\SoruVeCevaplar\\10Harfli.txt";
            DosyaOku(yol);

            for(String i:cevapsızSorular)
            {
                System.out.println(i);
            }

        }

        soruYazdır();
        btnYarismayaBasla.setEnabled(false);
        btnYarismayaBasla.setVisible(false);

    }//GEN-LAST:event_btnYarismayaBaslaActionPerformed

    private void btnYarismayiBitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYarismayiBitirActionPerformed
        YarismayiBitir();
    }//GEN-LAST:event_btnYarismayiBitirActionPerformed

    private void btnSureyiDurdurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSureyiDurdurActionPerformed

        btnSureyiDurdur.setEnabled(false);
        btnCevapla.setEnabled(true);
        lblCevapSuresi.setEnabled(true);
        lblCevapSuresi.setVisible(true);
        btnIpucu.setEnabled(false);
        suredurdur1();
        surebasla2();

    }//GEN-LAST:event_btnSureyiDurdurActionPerformed

    private void btnSiradakiSoruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiradakiSoruActionPerformed
        lblCevapTepkisi.setText("");
        kontrol2=0;
        cevabıSil();
        btnCevapla.setEnabled(false);
        btnIpucu.setEnabled(true);
        btnSureyiDurdur.setEnabled(true);
        btnSiradakiSoru.setEnabled(false);
        soruYazdır();
        surebasla1();
        //suredurdur2();
        lblCevapSuresi.setText("20");
        lblCevapSuresi.setEnabled(false);
        lblCevapSuresi.setVisible(false);
    }//GEN-LAST:event_btnSiradakiSoruActionPerformed

    private void btnIpucuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIpucuActionPerformed
        ipucuTıklanmaAdedi++;
        Random rnd=new Random();
        int i;

        do
        {
            i=rnd.nextInt(cevap.length());

        } while (kontrol1.contains(i));
        kontrol1.add(i);

        soruPuani=soruPuani-100;
        lblSoruPuani.setText(String.valueOf(soruPuani));

        switch(i)
        {
            case 0 -> lbl0.setText(Character.toString(cevap.charAt(0)).toUpperCase());
            case 1 -> lbl1.setText(Character.toString(cevap.charAt(1)).toUpperCase());
            case 2 -> lbl2.setText(Character.toString(cevap.charAt(2)).toUpperCase());
            case 3 -> lbl3.setText(Character.toString(cevap.charAt(3)).toUpperCase());
            case 4 -> lbl4.setText(Character.toString(cevap.charAt(4)).toUpperCase());
            case 5 -> lbl5.setText(Character.toString(cevap.charAt(5)).toUpperCase());
            case 6 -> lbl6.setText(Character.toString(cevap.charAt(6)).toUpperCase());
            case 7 -> lbl7.setText(Character.toString(cevap.charAt(7)).toUpperCase());
            case 8 -> lbl8.setText(Character.toString(cevap.charAt(8)).toUpperCase());
            case 9 -> lbl9.setText(Character.toString(cevap.charAt(9)).toUpperCase());
        }
        if(ipucuTıklanmaAdedi==cevap.length())
        {
            if(sors_adedi==14){YarismayiBitir();}
            btnIpucu.setEnabled(false);
            btnCevapla.setEnabled(false);
            btnSureyiDurdur.setEnabled(false);
            btnSiradakiSoru.setEnabled(true);
            suredurdur1();
        }

    }//GEN-LAST:event_btnIpucuActionPerformed

    private void btnCevaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCevaplaActionPerformed

        lblCevapTepkisi.setVisible(true);
        if(CevapDogrumu())
        {
            kontrol2=1;
            yarismaciPuani=yarismaciPuani+soruPuani;
            lblYarismaciPuani.setText(String.valueOf(yarismaciPuani));
            cevabıYaz();
            if(sors_adedi==14)
            {
                YarismayiBitir();
            }
        }

    }//GEN-LAST:event_btnCevaplaActionPerformed

    private void txtCevapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCevapActionPerformed

    }//GEN-LAST:event_txtCevapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelimeOyunu().setVisible(true);
               
                
            }
            
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCevapla;
    private javax.swing.JButton btnIpucu;
    private javax.swing.JButton btnSiradakiSoru;
    private javax.swing.JButton btnSoruCevapEkle;
    private javax.swing.JButton btnSureyiDurdur;
    private javax.swing.JButton btnYarismaciEkle;
    private javax.swing.JButton btnYarismayaBasla;
    private javax.swing.JButton btnYarismayaGec;
    private javax.swing.JButton btnYarismayiBitir;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblCevapSuresi;
    private javax.swing.JLabel lblCevapTepkisi;
    private javax.swing.JLabel lblDakika;
    private javax.swing.JLabel lblSaniye;
    private javax.swing.JLabel lblSoru;
    private javax.swing.JLabel lblSoruEklendi;
    private javax.swing.JLabel lblSoruPuani;
    private javax.swing.JLabel lblSoyisim;
    private javax.swing.JLabel lblYarisanIsmiSoyismi;
    private javax.swing.JLabel lblYarismaciEklendi;
    private javax.swing.JLabel lblYarismaciPuani;
    private javax.swing.JLabel lblİsim;
    private javax.swing.JPanel pnlCevap;
    private javax.swing.JPanel pnlGiris;
    private javax.swing.JPanel pnlSonuc;
    private javax.swing.JPanel pnlYarisma;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtCevap;
    private javax.swing.JTextField txtCvp;
    private javax.swing.JTextField txtIsim;
    private javax.swing.JTextField txtSoru;
    private javax.swing.JTextField txtSoyisim;
    // End of variables declaration//GEN-END:variables
}
