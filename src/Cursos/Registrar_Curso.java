/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cursos;

/**
 *
 * @author PC
 */
public class Registrar_Curso extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar_Curso
     */
    public Registrar_Curso() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcurso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdocente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtespecialidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtsemestre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        consultar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_Registrar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CURSO X DOCENTE");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 866, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nª");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 80, -1, -1));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 80, 259, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("CURSO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 111, -1, -1));
        getContentPane().add(txtcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 111, 259, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("DOCENTE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 143, -1, -1));
        getContentPane().add(txtdocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 143, 216, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ESPECIALIDAD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 80, -1, -1));
        getContentPane().add(txtespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 80, 254, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("SEMESTRE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 111, -1, -1));
        getContentPane().add(txtsemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 111, 216, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("F/REGISTRO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 140, -1, -1));
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 142, 257, -1));
        getContentPane().add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 229, 389, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("BUSCAR CURSO");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 229, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_Registrar.setText("Registrar");

        btn_Modificar.setText("Modificar");

        btn_Eliminar.setText("Eliminar");

        btn_Salir.setText("Salir");

        btn_Nuevo.setText("Nuevo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 590, -1));

        jButton6.setText("libro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, -1, 30));

        btn_Buscar.setText("Buscar");
        getContentPane().add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 93, 51));

        jButton8.setText("muñeco");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 60, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JTextField consultar;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcodigo;
    public static javax.swing.JTextField txtcurso;
    public static javax.swing.JTextField txtdocente;
    public static javax.swing.JTextField txtespecialidad;
    private javax.swing.JTextField txtfecha;
    public static javax.swing.JTextField txtsemestre;
    // End of variables declaration//GEN-END:variables
}
