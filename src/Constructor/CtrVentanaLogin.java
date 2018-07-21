package Constructor;

import Modelo.ModeloUsuario;
import ModeloDao.ConsultasUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistemadecolegiojose.Login;

public class CtrVentanaLogin implements ActionListener {
    
    private Login vista;
    private ModeloUsuario modelo = new ModeloUsuario();
    private ConsultasUsuario dao;
    
    public CtrVentanaLogin(ModeloUsuario modelo, ConsultasUsuario dao, Login vista) {
        
        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;
        
        this.vista.btn_Iniciar.addActionListener(this);
        this.vista.btn_Cancelar.addActionListener(this);
        iniciarVentana();
        
    }
    
    private void iniciarVentana() {
        this.vista.setTitle("Login XD");
        this.vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_Iniciar) {
            String usua = (vista.txt_UsuarioLogin.getText());
            String contras = new String(vista.txt_Passwor.getPassword());
            
            if (usua.isEmpty() == true && contras.isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "tienes que lelnar los campos  ");
            } else {
                
                modelo.setUsario(usua);
                modelo.setContrase(contras);
                
                if (dao.validarUsuario(modelo)) {
                    JOptionPane.showMessageDialog(null, "Usuario " + modelo.getUsario() + " Contraseña " + modelo.getContrase());                    
                    
                    if (modelo.getUsario().length() > 0 && modelo.getContrase().length() > 0) {
                        vista.setVisible(false);
                    }
                }
                
            }
            
        }
        
        if (e.getSource() == vista.btn_Cancelar) {
            System.exit(0);
            JOptionPane.showMessageDialog(null, "has precionado boton Cancelar");
        }
    }
}
