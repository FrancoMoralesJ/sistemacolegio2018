package Constructor;

import Modelo.ModeloUsuario;
import ModeloDao.ConsultasUsuario;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import sistemadecolegiojose.RegistrarUsuario;

public class CtrRegistrarUsuario implements ActionListener {

    private ModeloUsuario modelo;
    private ConsultasUsuario dao;
    private RegistrarUsuario vista;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen", "jpg");
    private String rutaimagen;

    public CtrRegistrarUsuario(ModeloUsuario modelo, ConsultasUsuario dao, RegistrarUsuario vista) {
        this.modelo = modelo;
        this.dao = dao;
        this.vista = vista;
        this.vista.btb_subir_imagenUsu.addActionListener(this);
        this.vista.btn_guardarUsu.addActionListener(this);
        this.vista.txt_fotoUsu.setVisible(false);
        this.vista.btn_buscarrr.addActionListener(this);
        iniciarVentanaRegitroUsu();
    }

    public void iniciarVentanaRegitroUsu() {
        rutaimagen = "";
        vista.setTitle("Registra usuario");
        vista.txt_fotoUsu.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btb_subir_imagenUsu) {
//          7/creamos un Objeto de JFileChoser 
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
                vista.lbl_fotoUsu.setIcon(new ImageIcon(fil));
                //modificamos la iamgen
                ImageIcon icon = new ImageIcon(fil);
                //extraemos la iamgen del icono del fil XD 
                Image img = icon.getImage();
                //aqui cambaimos tamaño de nuestroimagen 
                Image nuevoimg = img.getScaledInstance(190, 200, java.awt.Image.SCALE_SMOOTH);
                //la nueva imagen modificado 
                ImageIcon icononuevo = new ImageIcon(nuevoimg);
                vista.lbl_fotoUsu.setIcon(icononuevo);
                vista.lbl_fotoUsu.setSize(190, 200);
                vista.txt_fotoUsu.setText(fil);
                rutaimagen = "";

            }

            JOptionPane.showMessageDialog(null, "Precioando Subir iamgen");
        }

        if (e.getSource() == vista.btn_guardarUsu) {
            if (vista.txt_codigoUsu.getText().isEmpty() == true || vista.txt_usuarioUsu.getText().isEmpty() == true
                    || vista.txt_correoUsu.getText().isEmpty() == true || vista.txt_passworUsu.getText().isEmpty() == true
                    || vista.jcbx_tipousurioUsu.getSelectedItem().toString().isEmpty() == true || vista.txt_fotoUsu.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Tienes que llenar todos los campos", "Cuador de Alerta", JOptionPane.ERROR_MESSAGE);
            } else {

                modelo.setCodigo(Integer.parseInt(vista.txt_codigoUsu.getText()));
                modelo.setUsario(vista.txt_usuarioUsu.getText());
                modelo.setCorreo(vista.txt_correoUsu.getText());
                modelo.setContrase(vista.txt_passworUsu.getText());
                modelo.setTido_usuario(vista.jcbx_tipousurioUsu.getSelectedItem().toString());
                modelo.setFoto(vista.txt_fotoUsu.getText());
                JOptionPane.showMessageDialog(null, "LLega " + modelo.getUsario() + modelo.getCorreo() + modelo.getContrase()
                        + modelo.getTido_usuario() + modelo.getFoto());
                if (dao.registrarUsuarios(modelo)) {
                    JOptionPane.showMessageDialog(null, "LLega " + modelo.getUsario());
                }

            }
        }

        if (e.getSource() == vista.btn_buscarrr) {
            modelo.setUsario(vista.txt_usuarioUsu.getText());

            if (dao.Bucar(modelo)) {

                vista.txt_codigoUsu.setText(String.valueOf(modelo.getCodigo()));
                vista.txt_usuarioUsu.setText(modelo.getUsario());
                vista.txt_correoUsu.setText(modelo.getCorreo());
                vista.txt_passworUsu.setText(modelo.getContrase());
                vista.jcbx_tipousurioUsu.setSelectedItem(modelo.getTido_usuario());
                vista.lbl_fotoUsu.setIcon(modelo.getFotos());

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el resultado");

            }
        }

    }

}
