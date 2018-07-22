package Constructor;

import Alumnos.Registrar_Alumnos;
import Modelo.ModeloRegistrarAlumno;
import ModeloDao.ConsultaAlumnos;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class CtrRegistroAlumnos implements ActionListener {

    private ModeloRegistrarAlumno modelo;
    private ConsultaAlumnos dao;
    private Registrar_Alumnos vista;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen", "jpg");
    private String rutaimagen;

    public CtrRegistroAlumnos(ModeloRegistrarAlumno modelo, ConsultaAlumnos dao, Registrar_Alumnos vista) {
        this.modelo = modelo;
        this.dao = dao;
        this.vista = vista;
        this.vista.btn_Nuevo.addActionListener(this);
        this.vista.btn_Registrar.addActionListener(this);
        this.vista.btn_Modificar.addActionListener(this);
        this.vista.btn_Eliminar.addActionListener(this);
        this.vista.btn_buscar.addActionListener(this);
        this.vista.btn_ElegirFoto.addActionListener(this);
        iniciarVentanaRegistrarAlumnos();
    }

    private void iniciarVentanaRegistrarAlumnos() {
        vista.setTitle("Registrar alumnos");
        mostrar();

    }

    private void mostrar() {
        dao.mostrarDatosAlumnos(vista.tabla_alumnos);
    }

    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.tabla_alumnos.getModel();
        int tabla = vista.tabla_alumnos.getRowCount() - 1;
        for (int a = tabla; a >= 0; a--) {
            modelo.removeRow(a);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_ElegirFoto) {
//           7/creamos un Objeto de JFileChoser 
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
                vista.jlbl_fotoA.setIcon(new ImageIcon(fil));
                //modificamos la iamgen
                ImageIcon icon = new ImageIcon(fil);
                //extraemos la iamgen del icono del fil XD 
                Image img = icon.getImage();
                //aqui cambaimos tamaño de nuestroimagen 
                Image nuevoimg = img.getScaledInstance(190, 200, java.awt.Image.SCALE_SMOOTH);
                //la nueva imagen modificado 
                ImageIcon icononuevo = new ImageIcon(nuevoimg);
                vista.jlbl_fotoA.setIcon(icononuevo);
                vista.jlbl_fotoA.setSize(190, 200);
                vista.txt_rutaImagenA.setText(fil);
                rutaimagen = "";

            }

            JOptionPane.showMessageDialog(null, "Precioando Subir iamgen");

        }
        if (e.getSource() == vista.btn_Registrar) {

            if (vista.txt_codigoA.getText().isEmpty() == false
                    || vista.txt_dniA.getText().isEmpty() == false
                    || vista.txt_nomalumnoA.getText().isEmpty() == false
                    || vista.txt_apellidopaternoA.getText().isEmpty() == false
                    || vista.txt_apellidomaternoA.getText().isEmpty() == false
                    || vista.txt_fechanacimiento.getDate().toString().isEmpty() == false
                   
                    || vista.txt_celularA.getText().isEmpty() == false
                  
                    || vista.txt_direccionA.getText().isEmpty() == false
                    || vista.txt_celularA.getText().isEmpty() == false
                    || vista.txt_rutaImagenA.getText().isEmpty() == false) {
                JOptionPane.showMessageDialog(null, "Estos Campos son Obligatorio Llenar");
            } else {

                modelo.setCodigoA(vista.txt_codigoA.getText());
                modelo.setDniA(vista.txt_dniA.getText());
                modelo.setNombreA(vista.txt_nomalumnoA.getText());
                modelo.setApellidipaternoA(vista.txt_apellidopaternoA.getText());
                modelo.setApellidomaternoA(vista.txt_apellidomaternoA.getText());
                SimpleDateFormat fechaN = new SimpleDateFormat("yyyy-MM-dd");
                modelo.setFechanacimientoA(fechaN.format(vista.txt_fechanacimiento.getDate()));

                modelo.setSexoA(vista.jcbx_sexoAlumno.getSelectedItem().toString());
                modelo.setCelularA(vista.txt_celularA.getText());
                modelo.setDireccionA(vista.txt_direccionA.getText());
                modelo.setEncargadoA(vista.jcbx_encargadoA.getSelectedItem().toString());
                modelo.setFotoRutaA(vista.txt_rutaImagenA.getText());

//          
                modelo.setNombrepadre(vista.txt_padrenombre.getText());
                modelo.setDnipadre(vista.txt_dniPadre.getText());
                modelo.setNombremadre(vista.txt_nombremadre.getText());
                modelo.setDnimadre(vista.txt_dniMadre.getText());
                modelo.setTelefonos(vista.txt_telefono.getText());
                modelo.setCorreospadrees(vista.txt_correopadres.getText());
                modelo.setDireccionpadres(vista.txt_DIRECION.getText());

//        
                modelo.setDniapoderado(vista.txt_dniApoderado.getText());
                modelo.setNombreapoderado(vista.txt_nomApo.getText());
                modelo.setApellidosapoderado(vista.txt_apellidosApo.getText());
                modelo.setCorreoapoderado(vista.txt_correoApo.getText());
                modelo.setTelefonoapoderado(vista.txt_celularApodera.getText());
                modelo.setSexoapoderado(vista.jcbx_sexoApoderado.getSelectedItem().toString());
                limpiarTabla();
                mostrar();
                if (dao.registrarAlumnos(modelo)) {

                }
            }

        }

        if (e.getSource() == vista.btn_Modificar) {

        }
        if (e.getSource() == vista.btn_Eliminar) {

        }
        if (e.getSource() == vista.btn_buscar) {

        }

    }
}
