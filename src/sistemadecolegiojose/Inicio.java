/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolegiojose;

import Constructor.CtrVentanaLogin;
import Modelo.ModeloUsuario;
import ModeloDao.ConsultasUsuario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author PC
 */
public class Inicio extends javax.swing.JFrame {

    private Timer tiempo;
    private int tiempoinico = 0;

    public Inicio() {

        initComponents();
        barradeProgreso.setVisible(false);
        tiempo = new Timer(50, new claseContador());
        iniciar();
        this.setLocationRelativeTo(this);
        setBackground(new Color(153, 153, 153));
        
       UIManager.put( "nimbusOrange", new Color( 38, 139, 210 ) );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barradeProgreso = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barradeProgreso.setBackground(new java.awt.Color(51, 204, 0));
        barradeProgreso.setMinimum(24);
        barradeProgreso.setToolTipText("");
        barradeProgreso.setValue(10);
        barradeProgreso.setStringPainted(true);
        getContentPane().add(barradeProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 283, 700, 20));

        jPanel1.setBackground(new java.awt.Color(68, 68, 159));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Institución Educativa Privada");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Niño Jesús Mariscal Chaperito. ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 280, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 470, 270));

        jPanel2.setBackground(new java.awt.Color(240, 235, 235));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosFrm/36990036_1101882816618601_2649337489772249088_n.png"))); // NOI18N
        jPanel2.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 220));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 720, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciar() {
        barradeProgreso.setVisible(true);
        tiempo.start();
    }

    public class claseContador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int n = barradeProgreso.getValue();
            if (n < 100) {
                n++;
                barradeProgreso.setValue(n);

            } else {
                tiempo.stop();
//                JOptionPane.showMessageDialog(null, "Abriendo ventana login..?");
                barradeProgreso.setVisible(false);
                Login vista = new Login();
                ConsultasUsuario dao =new ConsultasUsuario();
                ModeloUsuario modelo = new ModeloUsuario();
                CtrVentanaLogin ctr = new CtrVentanaLogin(modelo,dao,vista);
                vista.setVisible(true);
                dispose();
//                int sd = n;
//                if (sd >= 100) {
//                      barradeProgreso.setValue(0);
//                }

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barradeProgreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojerusan.RSLabelImage rSLabelImage1;
    // End of variables declaration//GEN-END:variables
}
