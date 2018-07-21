package Constructor;

import Alumnos.Registrar_Alumnos;
import Modelo.ModeloRegistrar;
import ModeloDao.ConsultaAlumnos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrRegistroAlumnos implements ActionListener {

    private ModeloRegistrar modelo;
    private ConsultaAlumnos dao;
    private Registrar_Alumnos vista;

    public CtrRegistroAlumnos(ModeloRegistrar modelo, ConsultaAlumnos dao, Registrar_Alumnos vista) {
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

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_Nuevo) {

        }
        if (e.getSource() == vista.btn_Registrar) {

        }
        if (e.getSource() == vista.btn_Modificar) {

        }
        if (e.getSource() == vista.btn_Eliminar) {

        }
        if (e.getSource() == vista.btn_buscar) {

        }

    }
}
