/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolegiojose;

import Conexiones.Conexion;
import java.sql.Connection;

/**
 *
 * @author PC
 */
public class Login extends javax.swing.JFrame {

    Conexion cn = new Conexion();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonCircleBeanInfo1 = new rojerusan.RSButtonCircleBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        rSButtonCircle1 = new rojerusan.RSButtonCircle();
        rSButtonCircle2 = new rojerusan.RSButtonCircle();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_UsuarioLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Passwor = new javax.swing.JPasswordField();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        btn_Iniciar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(68, 68, 159));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonCircle1.setBackground(new java.awt.Color(255, 102, 102));
        rSButtonCircle1.setText("-");
        rSButtonCircle1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPanel1.add(rSButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 40, 40));

        rSButtonCircle2.setBackground(new java.awt.Color(255, 102, 102));
        rSButtonCircle2.setText("X");
        rSButtonCircle2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(rSButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 70));

        jPanel2.setBackground(new java.awt.Color(240, 235, 235));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        txt_UsuarioLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_UsuarioLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txt_UsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 280, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        txt_Passwor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Passwor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txt_Passwor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 117, 280, 40));

        rSLabelImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosFrm/36990036_1101882816618601_2649337489772249088_n.png"))); // NOI18N
        jPanel2.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 220));

        btn_Iniciar.setBackground(new java.awt.Color(68, 68, 159));
        btn_Iniciar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Iniciar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosToolBar/guardar.png"))); // NOI18N
        btn_Iniciar.setText("Iniciar");
        jPanel2.add(btn_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 150, 50));

        btn_Cancelar.setBackground(new java.awt.Color(68, 68, 159));
        btn_Cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setText("Cancelar");
        jPanel2.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 150, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 650, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Cancelar;
    public javax.swing.JButton btn_Iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSButtonCircle rSButtonCircle1;
    private rojerusan.RSButtonCircle rSButtonCircle2;
    private rojerusan.RSButtonCircleBeanInfo rSButtonCircleBeanInfo1;
    private rojerusan.RSLabelImage rSLabelImage1;
    public javax.swing.JPasswordField txt_Passwor;
    public javax.swing.JTextField txt_UsuarioLogin;
    // End of variables declaration//GEN-END:variables
}
