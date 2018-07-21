/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolegiojose;

import static Conexiones.Conexion.Conexion_A_basededatos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Sistemadecolegiojose extends Conexiones.Conexion {

    public static void main(String[] args) {
       
             Connection cn = Conexion_A_basededatos();
        ArrayList<String> nombres = new ArrayList<String>();

        try {
            DefaultTableModel mo;
            String sql = "SELECT * FROM usuario  ";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String a = "" + rs.getInt(1);
               

                String nom = rs.getString(2);
                String corre = rs.getString(3);
                String con = rs.getString(4);
                String dire = rs.getString(5);
                String tp = rs.getString(6);
                nombres.add("Cod" + a+"Nombre "+ nom+" Gmail " +corre+" Pass "+con+" Direc "+ " T-Usu "+tp);
                
               

            }
            for(int a=0; a<nombres.size();a++){
                 System.out.println(a+"Rs => "+nombres.get(a));
            }

        } catch (Exception e) {
        }
    }

    
}
