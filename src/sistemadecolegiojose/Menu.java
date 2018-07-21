/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolegiojose;

import Constructor.CtrListadoUser;
import Constructor.CtrRegistrarUsuario;
import Mconfig.FondoEscritorio;
import Modelo.ModeloUsuario;
import ModeloDao.ConsultasUsuario;

/**
 *
 * @author PC
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Escritorio.setBorder(new FondoEscritorio("81A.jpg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu40 = new javax.swing.JMenu();
        jMenu39 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu25 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        jMenu29 = new javax.swing.JMenu();
        jMenu30 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu31 = new javax.swing.JMenu();
        jMenu32 = new javax.swing.JMenu();
        jMenu33 = new javax.swing.JMenu();
        jMenu34 = new javax.swing.JMenu();
        jMenu35 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu36 = new javax.swing.JMenu();
        jMenu37 = new javax.swing.JMenu();
        jMenu38 = new javax.swing.JMenu();
        jMenu41 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(234, 226, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("G");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosToolBar/guardar.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jButton3.setText("G");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 30, 30));

        jButton4.setText("G");
        jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 30, 30));

        jButton5.setText("G");
        jButton5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 30, 30));

        jButton6.setText("G");
        jButton6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 30, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 20, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 20, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 20, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 20, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 20, 30));

        jMenu1.setText("Institución");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu11.setText("Registrar Institución");
        jMenu1.add(jMenu11);

        jMenu12.setText("Imprimir");
        jMenu1.add(jMenu12);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alumnos");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu13.setText("Registrar Alumno");
        jMenu2.add(jMenu13);

        jMenu14.setText("Imprimir");
        jMenu2.add(jMenu14);

        jMenuBar1.add(jMenu2);

        jMenu16.setText("Docentes");
        jMenu16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu40.setText("Imprimir");
        jMenu16.add(jMenu40);

        jMenu39.setText("Registrar Docente");
        jMenu16.add(jMenu39);

        jMenuBar1.add(jMenu16);

        jMenu3.setText("Ficha/Matricula");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu15.setText("Registrar Ficha / Matricula");
        jMenu3.add(jMenu15);

        jMenu17.setText("Imprimir");
        jMenu3.add(jMenu17);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Semestre");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu18.setText("Registrar Semestre");
        jMenu5.add(jMenu18);

        jMenu19.setText("Imprimir");
        jMenu5.add(jMenu19);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Cursos");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu20.setText("Registrar Cursos");
        jMenu4.add(jMenu20);

        jMenu21.setText("Imprimir");
        jMenu4.add(jMenu21);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Notas");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu22.setText("Registro de Notas");
        jMenu6.add(jMenu22);

        jMenu23.setText("Ver Observación");
        jMenu6.add(jMenu23);

        jMenu24.setText("Imprimir");
        jMenu6.add(jMenu24);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Conceptos");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu25.setText("Registrar Conceptos");
        jMenu7.add(jMenu25);

        jMenu26.setText("Imprimir");
        jMenu7.add(jMenu26);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Pagos");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu27.setText("Registrar Pagos");
        jMenu8.add(jMenu27);

        jMenu28.setText("Ver Fechas");
        jMenu8.add(jMenu28);

        jMenu29.setText("Ver Pagos");
        jMenu8.add(jMenu29);

        jMenu30.setText("Imprimir");
        jMenu8.add(jMenu30);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Reportes");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu31.setText("Reporte Institución");
        jMenu9.add(jMenu31);

        jMenu32.setText("Reporte F/ Matricula");
        jMenu9.add(jMenu32);

        jMenu33.setText("Reporte Alumno");
        jMenu9.add(jMenu33);

        jMenu34.setText("Reporte Docente");
        jMenu9.add(jMenu34);

        jMenu35.setText("Reporte Cursos");
        jMenu9.add(jMenu35);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Ayuda");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });

        jMenu36.setText("Acerca del Sistema");
        jMenu10.add(jMenu36);

        jMenu37.setText("Usuario");
        jMenu37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu37MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu37);

        jMenu38.setText("Cerrar");
        jMenu10.add(jMenu38);

        jMenu41.setText("Listar Usuario");
        jMenu41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu41MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu41);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Escritorio)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu37MouseClicked
        ModeloUsuario modelo = new ModeloUsuario();
        ConsultasUsuario dao = new ConsultasUsuario();
        RegistrarUsuario vista = new RegistrarUsuario();
        CtrRegistrarUsuario ct = new CtrRegistrarUsuario(modelo, dao, vista);
        Escritorio.add(vista);
        vista.setLocation(Escritorio.getWidth() / 2 - vista.getWidth() / 2,
                Escritorio.getHeight() / 2 - vista.getHeight() / 2);
        vista.show();
        vista.toFront();
    }//GEN-LAST:event_jMenu37MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
      
    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu41MouseClicked
          ModeloUsuario modelo = new ModeloUsuario();
        ConsultasUsuario dao = new ConsultasUsuario();
        ListarUsuario vista = new ListarUsuario();
        CtrListadoUser ct=new CtrListadoUser(modelo, dao, vista);
        Escritorio.add(vista);
        vista.show();
        vista.toFront();
    }//GEN-LAST:event_jMenu41MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details seNimbuse http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu34;
    private javax.swing.JMenu jMenu35;
    private javax.swing.JMenu jMenu36;
    private javax.swing.JMenu jMenu37;
    private javax.swing.JMenu jMenu38;
    private javax.swing.JMenu jMenu39;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu40;
    private javax.swing.JMenu jMenu41;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
