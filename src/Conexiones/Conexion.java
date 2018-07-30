package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

//    private static String url = "jdbc:mysql://localhost/";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String database = "matricula_notas";
    private static String user = "francosistemas";
    private static String pasword = "RPCGFdB7BxoGcsBw";
////    private static String url = "jdbc:mysql://192.168.1.39:3306/sistema_colegio?user=franco&password=199728&useUnicode=true&characterEncoding=UTF-8";
//   private static String url = "jdbc:mysql://localhost/"+database;
       private static String url = "jdbc:mysql://190.232.161.175:3306/"+database;

    public static Connection con ;

    public Conexion() {//jdbc:mysql://localhost/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8

    }

    public static Connection Conexion_A_basededatos() {
        con = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,pasword);

            if (con != null) {
                System.out.println("Conectado..");
               JOptionPane.showMessageDialog(null, "Se conecto a la BD " + database);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al conectatarse a la base de datos  " + e);

        }
        return con;

    }

    public Connection getConexion() {
        return con;
    }

    public void desconectar() {
        con = null;
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Conexion Finalizada...");
            System.out.println("Conexion Finalizadaa");
        }

    }

}
