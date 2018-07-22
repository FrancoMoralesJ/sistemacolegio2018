package Constructor;

import Alumnos.Registrar_Alumnos;
import Modelo.ModeloRegistrarAlumno;
import ModeloDao.ConsultaAlumnos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrRegistroAlumnos implements ActionListener {

    private ModeloRegistrarAlumno modelo;
    private ConsultaAlumnos dao;
    private Registrar_Alumnos vista;

    public CtrRegistroAlumnos(ModeloRegistrarAlumno modelo, ConsultaAlumnos dao, Registrar_Alumnos vista) {
        this.modelo = modelo;
        this.dao = dao;
        this.vista = vista;
        this.vista.btn_Nuevo.addActionListener(this);
        this.vista.btn_Registrar.addActionListener(this);
        this.vista.btn_Modificar.addActionListener(this);
        this.vista.btn_Eliminar.addActionListener(this);
        this.vista.btn_buscar.addActionListener(this);
        iniciarVentanaRegistrarAlumnos();
    }

    private void iniciarVentanaRegistrarAlumnos() {
        vista.setTitle("Registrar alumnos");
        mostrar();

    }

    private void mostrar() {
        dao.mostrarDatosAlumnos(vista.tabla_alumnos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_Nuevo) {
//         
          

        }
        if (e.getSource() == vista.btn_Registrar) {
            modelo.setCodigoA(vista.txt_codigoA.getText());
            modelo.setDniA(vista.txt_dniA.getText());
            modelo.setNombreA(vista.txt_nomalumnoA.getText());
            modelo.setApellidipaternoA(vista.txt_apellidopaternoA.getText());
            modelo.setApellidomaternoA(vista.txt_apellidomaternoA.getText());
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
            if(dao.registrarAlumnos(modelo)){
                
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
