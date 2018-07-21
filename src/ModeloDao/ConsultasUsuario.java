package ModeloDao;

import Conexiones.Conexion;
import static Conexiones.Conexion.Conexion_A_basededatos;
import Mconfig.RenderTable;
import Modelo.ModeloUsuario;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistemadecolegiojose.Menu;
import sistemadecolegiojose.RegistrarUsuario;

public class ConsultasUsuario extends Conexion {

    Connection cn = Conexion_A_basededatos();
    int num = 0;

    public boolean validarUsuario(ModeloUsuario modelo) {

//
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM usuario WHERE userr='" + modelo.getUsario() + "' AND pass='" + modelo.getContrase() + "' ");
            String usu = "";
            String contrase = "";
            String tp = "";
            while (rs.next()) {
                usu = rs.getString("userr");
                contrase = rs.getString("pass");
                tp = rs.getString("tipo_usuario");
            }
            if (usu.length() > 0 && contrase.length() > 0) {
//                modUsu.setUsario(usu);
//                modUsu.setContrase(contrase);
                Menu m = new Menu();
                m.setVisible(true);
                JOptionPane.showMessageDialog(null, "-->Usario--> " + usu + " -->contraseña-->" + contrase + " -->tipo usu-->" + tp);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "este usurio no existe ");
            }
        } catch (Exception e) {
        }
        return false;

    }

    public boolean registrarUsuarios(ModeloUsuario modelo) {

        try {
            String sql = "INSERT INTO usuario(codigo_usuario, userr, correo, pass, tipo_usuario, foto) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            FileInputStream img = null;
            ps.setInt(1, modelo.getCodigo());
            ps.setString(2, modelo.getUsario());
            ps.setString(3, modelo.getCorreo());
            ps.setString(4, modelo.getContrase());
            ps.setString(5, modelo.getTido_usuario());
            img = new FileInputStream(modelo.getFoto());
            ps.setBinaryStream(6, img);
            boolean rst = ps.execute();
            if (rst = true) {
                JOptionPane.showMessageDialog(null, "Se registro correctamente");
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar Usuario...\n" + e);
        }

        return false;
    }

    public boolean Bucar(ModeloUsuario modelo) {


        try {
     
            String sql = "SELECT * FROM usuario WHERE userr='" + modelo.getUsario() + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                int id = rs.getInt("codigo_usuario");
                String nom = rs.getString("userr");
                String corre = rs.getString("correo");
                String con = rs.getString("pass");
                String tp = rs.getString("tipo_usuario");
                Blob blob = rs.getBlob("foto");
            
                if (blob != null) {
                    byte[] img = blob.getBytes(1, (int) blob.length());
                    BufferedImage foto = null;
                    try {
                        foto = ImageIO.read(new ByteArrayInputStream(img));
                    } catch (Exception e) {
                    }
                      ImageIcon foto1 = new ImageIcon(foto.getScaledInstance(190, 200, 0));
                     modelo.setFotos(foto1);
                }
                modelo.setCodigo(id);
                modelo.setUsario(nom);
                modelo.setCorreo(corre);
                modelo.setContrase(con);
                modelo.setTido_usuario(tp);
               
               JOptionPane.showMessageDialog(null, "tipo de user "+tp);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror-->"+e);
        }
        return false;
    }

    public void listarUsuario(JTable tabla) {
        DefaultTableModel modelo;
        String[] titulo = {"N°", "CODIGO", "USUARIO", "GMAIL", "PASSWORD", "TIPO-USER", "F-REGISTRO", "FOTO"};
        modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        Object columna[] = new Object[8];
        tabla.setDefaultRenderer(Object.class, new RenderTable());
        try {
            Statement st = cn.createStatement();
            ResultSet sr = st.executeQuery("SELECT * FROM usuario");
            while (sr.next()) {
                num++;
                columna[0] = num;
                columna[1] = sr.getInt(1);
                columna[2] = sr.getString(2);
                columna[3] = sr.getString(3);
                columna[4] = sr.getString(4);
                columna[5] = sr.getString(5);
                columna[6] = sr.getTimestamp(6);
                Blob blob = sr.getBlob(7);
                if (blob != null) {
                    try {
                        byte[] foto = blob.getBytes(1, (int) blob.length());
                        BufferedImage img = null;
                        try {
                            img = ImageIO.read(new ByteArrayInputStream(foto));
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error a cargar la foto de la BD" + e);
                            columna[7] = "No hay foto";
                        }
                        ImageIcon fotoListo = new ImageIcon(img.getScaledInstance(100, 100, 0));
                        columna[7] = new JLabel(fotoListo);

                    } catch (Exception e) {
                        columna[7] = "No hay foto";
                    }

                }
                num++;

                tabla.setRowHeight(100);
                modelo.addRow(columna);

            }

        } catch (Exception e) {
//            columna[7] = "No hay fotos";
            JOptionPane.showMessageDialog(null, "error por Nelson \n" + e);
        }

    }

}
