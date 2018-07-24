/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolegiojose;

import Alumnos.Consultar_Reportes_Alumnos;
import Alumnos.Registrar_Alumnos;
import Constructor.CtrListadoUser;
import Constructor.CtrRegistrarUsuario;
import Constructor.CtrRegistroAlumnos;
import Constructor.CtrRegistroProfesores;
import Docentes.RegistrarDocentes;
import Mconfig.FondoEscritorio;
import Modelo.ModeloProfersores;
import Modelo.ModeloRegistrarAlumno;
import Modelo.ModeloUsuario;
import ModeloDao.ConsultaAlumnos;
import ModeloDao.ConsultaDocentes;
import ModeloDao.ConsultasUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class Menu extends javax.swing.JFrame {

    Timer timer;

    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Escritorio.setBorder(new FondoEscritorio("81A.jpg"));
        timer = new Timer(1000, new Cronometro());
        //inicioando tiempo
        timer.start();
        Fecha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txt_pcoma1 = new javax.swing.JLabel();
        txt_segundos1 = new javax.swing.JLabel();
        Txt_hora1 = new javax.swing.JLabel();
        txt_pcoma2 = new javax.swing.JLabel();
        txt_minutos1 = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu39 = new javax.swing.JMenu();
        jMenu40 = new javax.swing.JMenu();
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
            .addGap(0, 991, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(234, 226, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosToolBar/sobresalir.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 3, 40, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosToolBar/guardar_1.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 40, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosToolBar/nuevo.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 3, 40, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosToolBar/impresora (1).png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 3, 40, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosToolBar/pdf.png"))); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 3, 40, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 30, 40));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 10, 40));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 20, 40));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 20, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_pcoma1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txt_pcoma1.setForeground(new java.awt.Color(255, 255, 204));
        txt_pcoma1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_pcoma1.setText(":");
        txt_pcoma1.setName(""); // NOI18N

        txt_segundos1.setBackground(new java.awt.Color(255, 255, 204));
        txt_segundos1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txt_segundos1.setForeground(new java.awt.Color(255, 255, 204));
        txt_segundos1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_segundos1.setText("0.0");
        txt_segundos1.setName(""); // NOI18N

        Txt_hora1.setBackground(new java.awt.Color(255, 255, 204));
        Txt_hora1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Txt_hora1.setForeground(new java.awt.Color(255, 255, 204));
        Txt_hora1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Txt_hora1.setText("0.0");
        Txt_hora1.setName(""); // NOI18N

        txt_pcoma2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txt_pcoma2.setForeground(new java.awt.Color(255, 255, 204));
        txt_pcoma2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_pcoma2.setText(":");
        txt_pcoma2.setName(""); // NOI18N

        txt_minutos1.setBackground(new java.awt.Color(255, 255, 204));
        txt_minutos1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txt_minutos1.setForeground(new java.awt.Color(255, 255, 204));
        txt_minutos1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_minutos1.setText("0.0");
        txt_minutos1.setName(""); // NOI18N

        lbl_fecha.setBackground(new java.awt.Color(255, 255, 204));
        lbl_fecha.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lbl_fecha.setForeground(new java.awt.Color(255, 255, 204));
        lbl_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_fecha.setText("...................");
        lbl_fecha.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Fecha y hora del sistema");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(381, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_hora1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pcoma1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_minutos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pcoma2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_segundos1)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt_hora1)
                        .addComponent(txt_pcoma1)
                        .addComponent(txt_minutos1)
                        .addComponent(txt_pcoma2)
                        .addComponent(txt_segundos1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lbl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/escuela.png"))); // NOI18N
        jMenu1.setText("Institución");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/universidad.png"))); // NOI18N
        jMenu11.setText("Registrar Institución");
        jMenu1.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/impresora.png"))); // NOI18N
        jMenu12.setText("Imprimir");
        jMenu1.add(jMenu12);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/red.png"))); // NOI18N
        jMenu2.setText("Alumnos");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/anadir-amigo.png"))); // NOI18N
        jMenu13.setText("Registrar Alumno");
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu13);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/impresora_1.png"))); // NOI18N
        jMenu14.setText("Imprimir");
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu14);

        jMenuBar1.add(jMenu2);

        jMenu16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/profesor.png"))); // NOI18N
        jMenu16.setText("Docentes");
        jMenu16.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenu39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/estudiante.png"))); // NOI18N
        jMenu39.setText("Registrar Docente");
        jMenu39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu39MouseClicked(evt);
            }
        });
        jMenu39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jMenu39KeyReleased(evt);
            }
        });
        jMenu16.add(jMenu39);

        jMenu40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/impresora.png"))); // NOI18N
        jMenu40.setText("Imprimir");
        jMenu16.add(jMenu40);

        jMenuBar1.add(jMenu16);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/contrato.png"))); // NOI18N
        jMenu3.setText("Ficha/Matricula");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/plan-de-estudios.png"))); // NOI18N
        jMenu15.setText("Registrar Ficha / Matricula");
        jMenu3.add(jMenu15);

        jMenu17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/impresora.png"))); // NOI18N
        jMenu17.setText("Imprimir");
        jMenu3.add(jMenu17);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/calendario-mural.png"))); // NOI18N
        jMenu5.setText("Semestre");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenu18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/material-de-oficina_1.png"))); // NOI18N
        jMenu18.setText("Registrar Semestre");
        jMenu5.add(jMenu18);

        jMenu19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/impresora_1.png"))); // NOI18N
        jMenu19.setText("Imprimir");
        jMenu5.add(jMenu19);

        jMenuBar1.add(jMenu5);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/estante-para-libros.png"))); // NOI18N
        jMenu4.setText("Cursos");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenu20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/libros.png"))); // NOI18N
        jMenu20.setText("Registrar Cursos");
        jMenu4.add(jMenu20);

        jMenu21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/impresora_1.png"))); // NOI18N
        jMenu21.setText("Imprimir");
        jMenu4.add(jMenu21);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/medalla.png"))); // NOI18N
        jMenu6.setText("Notas");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenu22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/marca-de-verificacion.png"))); // NOI18N
        jMenu22.setText("Registro de Notas");
        jMenu6.add(jMenu22);

        jMenu23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/gafas.png"))); // NOI18N
        jMenu23.setText("Ver Observación");
        jMenu6.add(jMenu23);

        jMenu24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/impresora_1.png"))); // NOI18N
        jMenu24.setText("Imprimir");
        jMenu6.add(jMenu24);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/mapas-y-banderas.png"))); // NOI18N
        jMenu7.setText("Conceptos");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenu25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/clip.png"))); // NOI18N
        jMenu25.setText("Registrar Conceptos");
        jMenu7.add(jMenu25);

        jMenu26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/impresora.png"))); // NOI18N
        jMenu26.setText("Imprimir");
        jMenu7.add(jMenu26);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/simbolo-de-dolar.png"))); // NOI18N
        jMenu8.setText("Pagos");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenu27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/grafico-de-lineas.png"))); // NOI18N
        jMenu27.setText("Registrar Pagos");
        jMenu8.add(jMenu27);

        jMenu28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/reloj-circular.png"))); // NOI18N
        jMenu28.setText("Ver Fechas");
        jMenu8.add(jMenu28);

        jMenu29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/crecimiento.png"))); // NOI18N
        jMenu29.setText("Ver Pagos");
        jMenu8.add(jMenu29);

        jMenu30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/impresora.png"))); // NOI18N
        jMenu30.setText("Imprimir");
        jMenu8.add(jMenu30);

        jMenuBar1.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/protesta.png"))); // NOI18N
        jMenu9.setText("Reportes");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenu31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/acuerdo.png"))); // NOI18N
        jMenu31.setText("Reporte Institución");
        jMenu9.add(jMenu31);

        jMenu32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/campana.png"))); // NOI18N
        jMenu32.setText("Reporte F/ Matricula");
        jMenu9.add(jMenu32);

        jMenu33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/prueba.png"))); // NOI18N
        jMenu33.setText("Reporte Alumno");
        jMenu9.add(jMenu33);

        jMenu34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/carnet-de-identidad.png"))); // NOI18N
        jMenu34.setText("Reporte Docente");
        jMenu9.add(jMenu34);

        jMenu35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/contrato.png"))); // NOI18N
        jMenu35.setText("Reporte Cursos");
        jMenu9.add(jMenu35);

        jMenuBar1.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/chat.png"))); // NOI18N
        jMenu10.setText("Ayuda");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });

        jMenu36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/envio.png"))); // NOI18N
        jMenu36.setText("Acerca del Sistema");
        jMenu10.add(jMenu36);

        jMenu37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/conexion.png"))); // NOI18N
        jMenu37.setText("Usuario");
        jMenu37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu37MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu37);

        jMenu38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/servicio-al-cliente.png"))); // NOI18N
        jMenu38.setText("Cerrar");
        jMenu38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu38MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu38);

        jMenu41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconosdebarradeherramientas/Iconos/obrero.png"))); // NOI18N
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
                .addComponent(Escritorio)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        CtrListadoUser ct = new CtrListadoUser(modelo, dao, vista);
        Escritorio.add(vista);
        vista.show();
        vista.toFront();
    }//GEN-LAST:event_jMenu41MouseClicked

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        ModeloRegistrarAlumno modelo = new ModeloRegistrarAlumno();
        ConsultaAlumnos dao = new ConsultaAlumnos();
        Registrar_Alumnos vista2 = new Registrar_Alumnos();
        CtrRegistroAlumnos ct = new CtrRegistroAlumnos(modelo, dao, vista2);
        Escritorio.add(vista2);
        vista2.setLocation(Escritorio.getWidth() / 2 - vista2.getWidth() / 2,
                Escritorio.getHeight() / 2 - vista2.getHeight() / 2);
        vista2.show();
        vista2.toFront();
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jMenu38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu38MouseClicked
        int r = JOptionPane.showConfirmDialog(null, "Estas seguro que deceas salir del sistema", "Alerta", 0, JOptionPane.ERROR_MESSAGE);
        if (r == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_jMenu38MouseClicked

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
       Consultar_Reportes_Alumnos n=new Consultar_Reportes_Alumnos();
       Escritorio.add(n);
       n.show();
       n.toFront();
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu39KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu39KeyReleased
       
       
    }//GEN-LAST:event_jMenu39KeyReleased

    private void jMenu39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu39MouseClicked
       ModeloProfersores modelo=new ModeloProfersores();
       ConsultaDocentes dao=new ConsultaDocentes();
       RegistrarDocentes vista=new RegistrarDocentes();
       CtrRegistroProfesores ct=new CtrRegistroProfesores(modelo, dao, vista);
       Escritorio.add(vista);
       vista.show();
       vista.toFront();
    }//GEN-LAST:event_jMenu39MouseClicked

    public class Cronometro implements ActionListener {

        public void actionPerformed(ActionEvent evt) {
            GregorianCalendar tiempo = new GregorianCalendar();
            int hora, minutos, segundos;
            hora = tiempo.get(Calendar.HOUR);
            minutos = tiempo.get(Calendar.MINUTE);
            segundos = tiempo.get(Calendar.SECOND);
            Txt_hora1.setText(String.valueOf(hora));
            txt_minutos1.setText(String.valueOf(minutos));
            txt_segundos1.setText(String.valueOf(segundos));
        }
    }

    public void Fecha() {
        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formateador.format(fechaActual);
        lbl_fecha.setText(fecha);
    }

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
    public javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel Txt_hora1;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel txt_minutos1;
    private javax.swing.JLabel txt_pcoma1;
    private javax.swing.JLabel txt_pcoma2;
    private javax.swing.JLabel txt_segundos1;
    // End of variables declaration//GEN-END:variables
}
