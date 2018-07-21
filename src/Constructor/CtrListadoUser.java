package Constructor;

import Modelo.ModeloUsuario;
import ModeloDao.ConsultasUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemadecolegiojose.ListarUsuario;

public class CtrListadoUser implements ActionListener {

    ModeloUsuario modelo;
    ConsultasUsuario dao;
    ListarUsuario vista;

    public CtrListadoUser(ModeloUsuario modelo, ConsultasUsuario dao, ListarUsuario vista) {
        this.modelo = modelo;
        this.dao = dao;
        this.vista = vista;
        this.vista.btn_cargar.addActionListener(this);
        iniciarVentaListarUSU();
    }
   private void iniciarVentaListarUSU(){
    
       mostrarUser();
   }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==vista.btn_cargar){
           mostrarUser();
            JOptionPane.showMessageDialog(null, "Pres cargar");
        }
     
    }
    private void mostrarUser(){
        borrarFilasTB();
       dao.listarUsuario(vista.tabla_listarUser);
    }
    private  void borrarFilasTB(){
        DefaultTableModel modelo= (DefaultTableModel) vista.tabla_listarUser.getModel();
        int a=vista.tabla_listarUser.getRowCount()-1;
        for(int i=a;i>=0;i-- ){
            modelo.removeRow(i);
        }
    }
}
