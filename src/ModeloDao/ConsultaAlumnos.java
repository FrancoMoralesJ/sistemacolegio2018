package ModeloDao;

import Conexiones.Conexion;
import Mconfig.RenderTable;
import Modelo.ModeloRegistrarAlumno;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultaAlumnos extends Conexion {

    Connection cn = Conexion_A_basededatos();
    private static String[] titulos = {"COD", "DNI", "NOMBRE", "AP-PATERNO", "APE-MATERNO", "F-NACIMIENTO", "SEXO-ALUM", "N°-CELULAR", "DIRECCION", "F-REGISTRO", "RESPONSABLE", "FOTO"};
    private DefaultTableModel modelo = new DefaultTableModel(null, titulos);

    public void mostrarDatosAlumnos(JTable tabla) {

        String sql = "SELECT codigo_alumno ,dni, nombrealumno, apellidopaterno, apellidomaterno, f_nacimineto, sexo,celular, direcion,fecha_registoAlumno, encargado, foto FROM alumnos";
        tabla.setDefaultRenderer(Object.class, new RenderTable());
        Object[] comulna = new Object[13];
        try {
            Statement ps = cn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                comulna[0] = rs.getString(1);
                comulna[1] = rs.getString(2);
                comulna[2] = rs.getString(3);
                comulna[3] = rs.getString(4);
                comulna[4] = rs.getString(5);
                comulna[5] = rs.getString(6);
                comulna[6] = rs.getString(7);
                comulna[7] = rs.getString(8);
                comulna[8] = rs.getString(9);
                comulna[9] = rs.getTimestamp(10);
                comulna[10] = rs.getString(11);
                Blob blob = rs.getBlob(12);
                if (blob != null) {
                    byte[] foto = blob.getBytes(1, (int) blob.length());
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(foto));

                    } catch (Exception e) {
                        comulna[11] = "No hya imagen";
                    }
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 70, 0));
                    comulna[11] = new JLabel(icon);
                }
                modelo.addRow(comulna);

            }

        } catch (Exception e) {
            comulna[11] = "No hya imagen";
            JOptionPane.showMessageDialog(null, "Error al mostrar -->" + e);
        }
        tabla.setModel(modelo);
        tabla.getRowHeight(50);
    }

    public boolean registrarAlumnos(ModeloRegistrarAlumno mod) {
        try {
            String sql = "INSERT INTO alumnos(codigo_alumno, dni, nombrealumno, apellidopaterno, apellidomaterno, "
                    + "f_nacimineto, sexo, celular, direcion, encargado, "
                    + "foto, nombrepadre, dnipadre, nombremadre, dnimadre,"
                    + " telefono, correopadres, direcionpadres, dniApoderados, nombreapoderado, "
                    + "apellidosapoderado, correoapoderado, telefonoapoderado, sexoApo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
//      
            FileInputStream foto = null;

            ps.setString(1, mod.getCodigoA());
            ps.setString(2, mod.getDniA());
            ps.setString(3, mod.getNombreA());
            ps.setString(4, mod.getApellidipaternoA());
            ps.setString(5, mod.getApellidomaternoA());
            ps.setString(6, mod.getFechanacimientoA());
            ps.setString(7, mod.getSexoA());
            ps.setString(8, mod.getCelularA());
            ps.setString(9, mod.getDireccionA());
            ps.setString(10, mod.getEncargadoA());
            foto = new FileInputStream(mod.getFotoRutaA());
            ps.setBinaryStream(11, foto);
//       
            ps.setString(12, mod.getNombrepadre());
            ps.setString(13, mod.getDnipadre());
            ps.setString(14, mod.getNombremadre());
            ps.setString(15, mod.getDnimadre());
            ps.setString(16, mod.getTelefonos());
            ps.setString(17, mod.getCorreospadrees());
            ps.setString(18, mod.getDireccionpadres());
//     
            ps.setString(19, mod.getDniapoderado());
            ps.setString(20, mod.getNombreapoderado());
            ps.setString(21, mod.getApellidosapoderado());
            ps.setString(22, mod.getCorreoapoderado());
            ps.setString(23, mod.getTelefonoapoderado());
            ps.setString(24, mod.getSexoA());
            
            int r = ps.executeUpdate();
            if (r > 0) {
                JOptionPane.showMessageDialog(null, "Se Registro  Correctamento ");
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de codigo =>" + e);
        }

        return false;
    }

    public boolean modificarAlumnos(ModeloRegistrarAlumno mod) {
        try {
            String sql = "UPDATE alumnos SET dni=?,nombrealumno=?,apellidopaterno=?,\n"
                    + "apellidomaterno=?,f_nacimineto=?,sexo=?,celular=?,direcion=?,\n"
                    + "encargado=?,foto=?,nombrepadre=?,dnipadre=?,"
                    + "nombremadre=?,dnimadre=?,telefono=?,correopadres=?,direcionpadres=?,"
                    + "dniApoderados=?,nombreapoderado=?,apellidosapoderado=?,correoapoderado=?"
                    + ",telefonoapoderado=?,sexoApo=? WHERE codigo_alumno=?";
            PreparedStatement ps = cn.prepareStatement(sql);
//      
            FileInputStream foto = null;

           
            ps.setString(1, mod.getDniA());
            ps.setString(2, mod.getNombreA());
            ps.setString(3, mod.getApellidipaternoA());
            ps.setString(4, mod.getApellidomaternoA());
            ps.setString(5, mod.getFechanacimientoA());
            ps.setString(6, mod.getSexoA());
            ps.setString(7, mod.getCelularA());
            ps.setString(8, mod.getDireccionA());
            ps.setString(9, mod.getEncargadoA());
            foto = new FileInputStream(mod.getFotoRutaA());
            ps.setBinaryStream(10, foto);
//       
            ps.setString(11, mod.getNombrepadre());
            ps.setString(12, mod.getDnipadre());
            ps.setString(13, mod.getNombremadre());
            ps.setString(14, mod.getDnimadre());
            ps.setString(15, mod.getTelefonos());
            ps.setString(16, mod.getCorreospadrees());
            ps.setString(17, mod.getDireccionpadres());
//     
            ps.setString(18, mod.getDniapoderado());
            ps.setString(19, mod.getNombreapoderado());
            ps.setString(20, mod.getApellidosapoderado());
            ps.setString(21, mod.getCorreoapoderado());
            ps.setString(22, mod.getTelefonoapoderado());
            ps.setString(23, mod.getSexoA());
            
            ps.setString(23, mod.getCodigoA());
            int r = ps.executeUpdate();
            if (r > 0) {
                JOptionPane.showMessageDialog(null, "Se Registro  Correctamento ");
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de codigo =>" + e);
        }

        return false;
    }
      public boolean eliminarAlumnos(ModeloRegistrarAlumno mod) {
          try {
               PreparedStatement ps = cn.prepareStatement("DELETE FROM alumnos WHERE codigo_alumno=?");
               ps.setString(1,mod.getCodigoA());
              int r= ps.executeUpdate();
              if(r>0){
                  JOptionPane.showMessageDialog(null, "Se Elimino Correctamente");
              }
          } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en el codigo=>\n"+e);
          }
               
          
          return false;
          
      }
}
