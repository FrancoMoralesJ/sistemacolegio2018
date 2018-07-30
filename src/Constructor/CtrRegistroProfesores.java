package Constructor;

import Docentes.RegistrarDocentes;
import Modelo.ModeloProfersores;
import ModeloDao.ConsultaDocentes;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class CtrRegistroProfesores implements ActionListener, KeyListener {

    private ModeloProfersores modelo;
    private ConsultaDocentes dao;
    private RegistrarDocentes vista;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png", "jpeg", "pdf");
    private String rutaimagen;

    public CtrRegistroProfesores(ModeloProfersores modelo, ConsultaDocentes dao, RegistrarDocentes vista) {
        this.modelo = modelo;
        this.dao = dao;
        this.vista = vista;
        this.vista.btn_Registrar.addActionListener(this);
        this.vista.btn_Modificar.addActionListener(this);
        this.vista.btn_Eliminar.addActionListener(this);
        this.vista.btn_Cargar.addActionListener(this);
        this.vista.btn_Modificar.addActionListener(this);
        this.vista.btn_refrescar.addActionListener(this);
        this.vista.btn_Buscar.addActionListener(this);
        this.vista.txt_buscarDoc.addKeyListener(this);
        IniciarVentana();
    }

    private void IniciarVentana() {
        vista.setTitle("Registrar Docentes");
        mostrar();

    }

    private void mostrar() {
        dao.mostrarDocentes(vista.jtblDatosProfesores);
    }

    private void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) vista.jtblDatosProfesores.getModel();
        int tabla = vista.jtblDatosProfesores.getRowCount() - 1;
        for (int i = tabla; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_Registrar) {

            if (vista.txtdni.getText().isEmpty() == true || vista.txtdocente.getText().isEmpty() == true
                    || vista.txtdireccion.getText().isEmpty() == true || vista.txttelefono.getText().isEmpty() == true
                    || vista.txtestado.getSelectedItem().toString().isEmpty() == true || vista.txtespecialidad.getSelectedItem().toString().isEmpty() == true
                    || vista.txtcargo.getSelectedItem().toString().isEmpty() == true || vista.txtexperiencia.getText().isEmpty() == true
                    || vista.txt_pago.getText().isEmpty() == true || vista.txtnacimiento.getDate().toString().isEmpty() == true
                    || vista.txtobservacion.getText().isEmpty() == true || vista.txt_rutaIMG.getText().toString().isEmpty() == true) {
                modelo.setCODIGO_DOCENTE(vista.txtdni.getText());
                JOptionPane.showMessageDialog(null, "Tienes que llenar todos los campos");
            } else {
                modelo.setCODIGO_DOCENTE(vista.txtdni.getText());
                modelo.setDOCENTE(vista.txtdocente.getText());
                modelo.setDIRECCION(vista.txtdireccion.getText());
                modelo.setTELEFONO(vista.txttelefono.getText());
                modelo.setESTADO_CIVIL(vista.txtestado.getSelectedItem().toString());
                modelo.setESPECIALIDAD(vista.txtespecialidad.getSelectedItem().toString());
                modelo.setCARGO(vista.txtcargo.getSelectedItem().toString());
                modelo.setEXPERIENCIA(vista.txtexperiencia.getText());
                modelo.setPAGO(Double.parseDouble(vista.txt_pago.getText()));
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
                modelo.setFECHA_NACIMIENTO(formato.format(vista.txtnacimiento.getDate()));
                modelo.setOBSERVACION(vista.txtobservacion.getText());
                modelo.setFOTORUTA(vista.txt_rutaIMG.getText());

                if (dao.registrarDocentes(modelo)) {
                    limpiarTabla();
                    mostrar();
                    vista.txt_consultar.setText(modelo.getDOCENTE());
                }
            }
        }

        if (e.getSource() == vista.btn_Cargar) {
//               7/creamos un Objeto de JFileChoser 
            JFileChooser dlg = new JFileChooser();
            dlg.setFileFilter(filter);
            //abrimos ventana del dialogo para escoger las imagenes 
            int option = dlg.showOpenDialog(null);
            //si hacemos click en boton abrir
            if (option == JFileChooser.APPROVE_OPTION) {
                //obtener el nombre del archivo path para nombre
                String fil = dlg.getSelectedFile().getPath();
                //optenesmos la direcion de donde se gaurdo la imagen XD
                String file = dlg.getSelectedFile().toString();
                vista.lbl_fotodoce.setIcon(new ImageIcon(fil));
                //modificamos la iamgen
                ImageIcon icon = new ImageIcon(fil);
                //extraemos la iamgen del icono del fil XD 
                Image img = icon.getImage();
                //aqui cambaimos tamaño de nuestroimagen 
                Image nuevoimg = img.getScaledInstance(190, 200, java.awt.Image.SCALE_SMOOTH);
                //la nueva imagen modificado 
                ImageIcon icononuevo = new ImageIcon(nuevoimg);
                vista.lbl_fotodoce.setIcon(icononuevo);
                vista.lbl_fotodoce.setSize(190, 200);
                vista.txt_rutaIMG.setText(fil);
                rutaimagen = "";
            }

        }

        if (e.getSource() == vista.btn_Modificar) {
            if (vista.txtdni.getText().isEmpty() == true || vista.txtdocente.getText().isEmpty() == true
                    || vista.txtdireccion.getText().isEmpty() == true || vista.txttelefono.getText().isEmpty() == true
                    || vista.txtestado.getSelectedItem().toString().isEmpty() == true || vista.txtespecialidad.getSelectedItem().toString().isEmpty() == true
                    || vista.txtcargo.getSelectedItem().toString().isEmpty() == true || vista.txtexperiencia.getText().isEmpty() == true
                    || vista.txt_pago.getText().isEmpty() == true || vista.txtnacimiento.getDate().toString().isEmpty() == true
                    || vista.txtobservacion.getText().isEmpty() == true || vista.txt_rutaIMG.getText().toString().isEmpty() == true) {
                modelo.setCODIGO_DOCENTE(vista.txtdni.getText());
                JOptionPane.showMessageDialog(null, "Tienes que llenar todos los campos");
            } else {
                modelo.setCODIGO_DOCENTE(vista.txtdni.getText());
                modelo.setDOCENTE(vista.txtdocente.getText());
                modelo.setDIRECCION(vista.txtdireccion.getText());
                modelo.setTELEFONO(vista.txttelefono.getText());
                modelo.setESTADO_CIVIL(vista.txtestado.getSelectedItem().toString());
                modelo.setESPECIALIDAD(vista.txtespecialidad.getSelectedItem().toString());
                modelo.setCARGO(vista.txtcargo.getSelectedItem().toString());
                modelo.setEXPERIENCIA(vista.txtexperiencia.getText());
                modelo.setPAGO(Double.parseDouble(vista.txt_pago.getText()));
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
                modelo.setFECHA_NACIMIENTO(formato.format(vista.txtnacimiento.getDate()));
                modelo.setOBSERVACION(vista.txtobservacion.getText());
                modelo.setFOTORUTA(vista.txt_rutaIMG.getText());
                ;
                if (dao.modificarDocentes(modelo)) {
                    limpiarTabla();
                    mostrar();
                    vista.txt_consultar.setText(modelo.getDOCENTE());
                }
            }
        }

        if (e.getSource() == vista.btn_refrescar) {
            limpiarTabla();
            mostrar();
        }
        if (e.getSource() == vista.btn_Buscar) {
            String dni = vista.txt_consultar.getText();
            if (dni.length() > 0) {
                modelo.setCODIGO_DOCENTE(dni);
                if (dao.mostrarDocentesDni(modelo)) {
                    vista.txtdni.setText(modelo.getCODIGO_DOCENTE());
                    vista.txtdocente.setText(modelo.getDOCENTE());
                    vista.txttelefono.setText(modelo.getTELEFONO());
                    vista.txtestado.setSelectedItem(modelo.getESTADO_CIVIL());
                    vista.txtespecialidad.setSelectedItem(modelo.getESPECIALIDAD());
                    vista.txtcargo.setSelectedItem(modelo.getCARGO());
                    vista.txtexperiencia.setText(modelo.getEXPERIENCIA());
                    vista.txt_pago.setText(String.valueOf(modelo.getPAGO()));
                    Date fechan;
                    try {
                        fechan = new SimpleDateFormat("yyyy-mm-dd").parse(modelo.getFECHA_NACIMIENTO().toString());
                        vista.txtnacimiento.setDate(fechan);
                    } catch (ParseException ex) {
                        JOptionPane.showMessageDialog(null, "Error Fehca ->" + ex);
                    }
                    vista.txtdireccion.setText(modelo.getDIRECCION());
                    vista.txtobservacion.setText(modelo.getOBSERVACION());
                    vista.lbl_fotodoce.setIcon(modelo.getFOTO());
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo esta vacio..?");

            }
        }

        //--------------
        if (e.getSource() == vista.btn_Eliminar) {
            String dni = vista.txtdni.getText();
            if (dni.length() > 0) {
                modelo.setCODIGO_DOCENTE(dni);
                if (dao.eliminarDocentes(modelo)) {
                    limpiarTabla();
                    mostrar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo DNI esta vacio..?");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == vista.txt_buscarDoc) {
            String docente = vista.txt_buscarDoc.getText();
            if (docente.length() > 0) {
                modelo.setDOCENTE(docente);
                if (dao.buscarDocentes(vista.jtblDatosProfesores, modelo)) {

                }

            } else {
                limpiarTabla();
                mostrar();
            }
        }
    }

}
