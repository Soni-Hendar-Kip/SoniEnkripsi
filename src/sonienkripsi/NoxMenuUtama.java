
package sonienkripsi;

import java.awt.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author montox
 */
public class NoxMenuUtama extends javax.swing.JFrame {

    /**
     * @author Soni Hendarkanto on Apache NetBeans IDE 16 with Linux Mint 21.1
     * "VERA" Cinnamon Desktop Edition
     * My github: https://github.com/Soni-Hendar-Kip/SoniEnkripsi
     */
    public NoxMenuUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtAES_ = new javax.swing.JButton();
        BtMD5_ = new javax.swing.JButton();
        BtAES_Key_ = new javax.swing.JButton();
        TxGithub_ = new javax.swing.JLabel();
        BtAES_Key_1 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UTS Matkul Keamanan Sistem & Jaringan Komputer");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aplikasi Penerapan Enkripsi & Dekripsi Pada JAVA");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Soni Hendarkanto PTI 4B");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sonienkripsi/Ubhi40.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dosen: Pak Fahrur Rozi");

        BtAES_.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        BtAES_.setText("Enkripsi AES Sederhana");
        BtAES_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAES_ActionPerformed(evt);
            }
        });

        BtMD5_.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        BtMD5_.setText("Enkripsi MD5 dan SHA3");
        BtMD5_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMD5_ActionPerformed(evt);
            }
        });

        BtAES_Key_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BtAES_Key_.setText("Enkriptor AES");
        BtAES_Key_.setToolTipText("Enkriptor AES dengan Kunci Rahasia");
        BtAES_Key_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAES_Key_ActionPerformed(evt);
            }
        });

        TxGithub_.setFont(new java.awt.Font("Liberation Sans", 0, 11)); // NOI18N
        TxGithub_.setForeground(new java.awt.Color(0, 51, 255));
        TxGithub_.setText("view source on github");
        TxGithub_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxGithub_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxGithub_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxGithub_MouseExited(evt);
            }
        });

        BtAES_Key_1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BtAES_Key_1.setText("Dekriptor AES");
        BtAES_Key_1.setToolTipText("Dekriptor AES dengan Kunci Rahasia");
        BtAES_Key_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAES_Key_1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(">>>>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TxGithub_))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(BtAES_Key_, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtAES_Key_1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtAES_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtMD5_, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(BtMD5_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtAES_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtAES_Key_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtAES_Key_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(TxGithub_)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(594, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtMD5_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMD5_ActionPerformed
        // TODO add your handling code here:
        new NoxEnkripsiMD5_SHA3().setVisible(true);
    }//GEN-LAST:event_BtMD5_ActionPerformed

    private void BtAES_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAES_ActionPerformed
        // TODO add your handling code here:
        new NoxAES().setVisible(true);
    }//GEN-LAST:event_BtAES_ActionPerformed

    private void BtAES_Key_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAES_Key_ActionPerformed
        // TODO add your handling code here:
        new NoxAES_WIthKey().setVisible(true);
    }//GEN-LAST:event_BtAES_Key_ActionPerformed

    private void TxGithub_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxGithub_MouseClicked
        // TODO add your handling code here:
        TxGithub_.setForeground(Color.red);
        try {
            Desktop desktop = Desktop.getDesktop();
            URI url = new URI("https://github.com/Soni-Hendar-Kip/SoniEnkripsi");
            if (Desktop.isDesktopSupported()) {
                try {
                    desktop.browse(url);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        } catch (URISyntaxException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_TxGithub_MouseClicked

    private void TxGithub_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxGithub_MouseEntered
        // TODO add your handling code here:
        TxGithub_.setForeground(Color.red);
    }//GEN-LAST:event_TxGithub_MouseEntered

    private void TxGithub_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxGithub_MouseExited
        // TODO add your handling code here:
        TxGithub_.setForeground(Color.blue);
    }//GEN-LAST:event_TxGithub_MouseExited

    private void BtAES_Key_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAES_Key_1ActionPerformed
        // TODO add your handling code here:
        new NoxAES_WIthKey2().setVisible(true);
    }//GEN-LAST:event_BtAES_Key_1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NoxMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoxMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoxMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoxMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoxMenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAES_;
    private javax.swing.JButton BtAES_Key_;
    private javax.swing.JButton BtAES_Key_1;
    private javax.swing.JButton BtMD5_;
    private javax.swing.JLabel TxGithub_;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
