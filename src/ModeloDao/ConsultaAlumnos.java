
package ModeloDao;

import Conexiones.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class ConsultaAlumnos extends  Conexion{
Connection cn=Conexion_A_basededatos();
private static String [] titulos={"COD","DNI","NOMBRE","AP-PATERNO","APE-MATERNO","F-NACIMIENTO","N°-CELULAR","DIRECCION","RESPONSABLE","FOTO"};
private DefaultTableModel modelo= new  DefaultTableModel(null, titulos);
public void mostrarDatosAlumnos() throws SQLException{
    Statement ps=cn.createStatement();
    String sql="SELECT codigo_alumno , dni, nombrealumno, apellidopaterno, apellidomaterno, f-nacimineto, celular, direcion, encargado, foto";
    ResultSet rs= ps.executeQuery(sql);
    Object[] comulna=new Object[11];
    while(rs.next()){
        comulna[0]=rs.getString(1);
    }
    
}
    
    
    
}
