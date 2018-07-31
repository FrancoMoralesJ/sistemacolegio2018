/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

import FichaMatricula.Registro_Fichas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
 
public class CtrRegistrarfichas implements ActionListener {

    private Registro_Fichas vista;
    
    public CtrRegistrarfichas(Registro_Fichas vista){
        this.vista=vista;
        this.vista.btn_Registrar.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource()==vista.btn_Registrar){
        JOptionPane.showMessageDialog(null,"se reguistro");
    }
    
    
    
        
    }
     
    
    
  
    
}

