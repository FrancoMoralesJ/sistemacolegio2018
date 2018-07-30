/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Mconfig.RenderTable;
import Modelo.ModeloProfersores;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultaDocentes extends Conexiones.Conexion {

    String[] cabecera = {"DNI", "DOCENTE", "DIRECCION", "TELEFONO", "E.CIVIL", "ESPECIALIDAD", "CARGO", "EXPERIENCIA", "PAGO",
        "F.NAC", "F.INGRESO", "OBSERVACION", "FOTO"};
    String[][] data = {};
    Connection cn = Conexion_A_basededatos();
    CallableStatement cst;
    ResultSet r;
    DefaultTableModel modelo;

    public void mostrarDocentes(JTable tabla) {

        Object[] registros = new Object[13];
        String sSQL = "";
        sSQL = "select * from docente";
        modelo = new DefaultTableModel(data, cabecera);
        tabla.setModel(modelo);
        tabla.setDefaultRenderer(Object.class, new RenderTable());
        try {
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                registros[7] = rs.getString(8);
                registros[8] = rs.getString(9);
                registros[9] = rs.getString(10);
                registros[10] = rs.getTimestamp(11) == null ? " " : rs.getTimestamp(11);
                registros[11] = rs.getString(12);

                // totalregistros = totalregistros + 1;
                Blob blob = rs.getBlob(13);
                if (blob != null) {
                    byte[] foto = blob.getBytes(1, (int) blob.length());
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(foto));
                    } catch (Exception e) {
                        registros[12] = "no hay foto";
                    }
//                    ImageIcon fotos=new ImageIcon(img.getScaledInstance(190, 220, 0));
                    ImageIcon fotos = new ImageIcon(img.getScaledInstance(65, 70, 0));

                    registros[12] = new JLabel(fotos);
                }
                tabla.setRowHeight(70);
                modelo.addRow(registros);

            }
            //return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error " + e);
            // return null;
        }
    }

    public boolean mostrarDocentesDni(ModeloProfersores mod) {
        String sSQL = "";
        sSQL = "SELECT * FROM docente WHERE CODIGO_DOCENTE='" + mod.getCODIGO_DOCENTE() + "'";
        try {
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
//         
                mod.setCODIGO_DOCENTE(rs.getString(1));
                mod.setDOCENTE(rs.getString(2));
                mod.setDIRECCION(rs.getString(3));
                mod.setTELEFONO(rs.getString(4));
                mod.setESTADO_CIVIL(rs.getString(5));
                mod.setESPECIALIDAD(rs.getString(6));
                mod.setCARGO(rs.getString(7));
                mod.setEXPERIENCIA(rs.getString(8));
                mod.setPAGO(Double.parseDouble(rs.getString(9)));
                mod.setFECHA_NACIMIENTO(rs.getString(10));
//                rs.getTimestamp(11)==null ? " " : rs.getTimestamp(11);
                mod.setOBSERVACION(rs.getString(12));
                // totalregistros = totalregistros + 1;
                Blob blob = rs.getBlob(13);
                if (blob != null) {
                    byte[] foto = blob.getBytes(1, (int) blob.length());
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(foto));
                    } catch (Exception e) {
                        mod.setFOTO(null);
                    }
//                    ImageIcon fotos=new ImageIcon(img.getScaledInstance(190, 220, 0));
                    ImageIcon fotos = new ImageIcon(img.getScaledInstance(190, 200, 0));
                    mod.setFOTO(fotos);
                }

                return true;

            }
            //return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error " + e);
            // return null;
        }
        return false;
    }

    public boolean buscarDocentes(JTable tabla, ModeloProfersores mod) {

        Object[] registros = new Object[13];
        String sSQL = "";
        sSQL = "SELECT * FROM `docente` WHERE  DOCENTE LIKE  '%" + mod.getDOCENTE() + "%'";
        modelo = new DefaultTableModel(data, cabecera);
        tabla.setModel(modelo);
        tabla.setDefaultRenderer(Object.class, new RenderTable());
        try {
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                registros[7] = rs.getString(8);
                registros[8] = rs.getString(9);
                registros[9] = rs.getString(10);
                registros[10] = rs.getTimestamp(11) == null ? " " : rs.getTimestamp(11);
                registros[11] = rs.getString(12);

                // totalregistros = totalregistros + 1;
                Blob blob = rs.getBlob(13);
                if (blob != null) {
                    byte[] foto = blob.getBytes(1, (int) blob.length());
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(foto));
                    } catch (Exception e) {
                        registros[12] = "no hay foto";
                    }
//                    ImageIcon fotos=new ImageIcon(img.getScaledInstance(190, 220, 0));
                    ImageIcon fotos = new ImageIcon(img.getScaledInstance(65, 70, 0));

                    registros[12] = new JLabel(fotos);
                }
                tabla.setRowHeight(70);
                modelo.addRow(registros);
                return true;
            }
            //return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error " + e);
            // return null;
        }
        return false;
    }

    public boolean registrarDocentes(ModeloProfersores mod) {
        try {
            FileInputStream fi = null;
            cst = con.prepareCall("{call GUARDAR_PROOFESOREES (?,?,?,?,?,?,?,?,?,?,?,?)}");

            cst.setString(1, mod.getCODIGO_DOCENTE());
            cst.setString(2, mod.getDOCENTE());
            cst.setString(3, mod.getDIRECCION());
            cst.setString(4, mod.getTELEFONO());
            cst.setString(5, mod.getESTADO_CIVIL());
            cst.setString(6, mod.getESPECIALIDAD());
            cst.setString(7, mod.getCARGO());
            cst.setString(8, mod.getEXPERIENCIA());
            cst.setDouble(9, mod.getPAGO());
            cst.setString(10, mod.getFECHA_NACIMIENTO());
            cst.setString(11, mod.getOBSERVACION());
            fi = new FileInputStream(mod.getFOTORUTA());
            cst.setBinaryStream(12, fi);
            int rpta = cst.executeUpdate();
            if (rpta == 1) {
                JOptionPane.showMessageDialog(null, "Docente Registrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {

                JOptionPane.showMessageDialog(null, "Error al Registrar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
            // ESTE CODIGO SIRVA PARA MOSTRAR LOS MENSAJES DE SQL
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error-> " + e.toString());
        }
        return false;

    }

    public boolean modificarDocentes(ModeloProfersores mod) {
        try {
            FileInputStream fi = null;
            cst = con.prepareCall("{call MODIFICAR_DOCENTE(?,?,?,?,?,?,?,?,?,?,?,?)}");

            cst.setString(1, mod.getCODIGO_DOCENTE());
            cst.setString(2, mod.getDOCENTE());
            cst.setString(3, mod.getDIRECCION());
            cst.setString(4, mod.getTELEFONO());
            cst.setString(5, mod.getESTADO_CIVIL());
            cst.setString(6, mod.getESPECIALIDAD());
            cst.setString(7, mod.getCARGO());
            cst.setString(8, mod.getEXPERIENCIA());
            cst.setDouble(9, mod.getPAGO());
            cst.setString(10, mod.getFECHA_NACIMIENTO());
            cst.setString(11, mod.getOBSERVACION());
            fi = new FileInputStream(mod.getFOTORUTA());
            cst.setBinaryStream(12, fi);
            int rpta = cst.executeUpdate();
            if (rpta == 1) {
                JOptionPane.showMessageDialog(null, "Docente Modifico", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {

                JOptionPane.showMessageDialog(null, "Error al Modifico", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
            // ESTE CODIGO SIRVA PARA MOSTRAR LOS MENSAJES DE SQL
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modifico -> " + e.toString());
        }
        return false;

    }

    public boolean eliminarDocentes(ModeloProfersores mod) {
        String cod = mod.getCODIGO_DOCENTE();
        try {
            cst = cn.prepareCall("{call ELIMINAR_DOCENTE(?)}");
            cst.setString(1, cod);
            int rpta = cst.executeUpdate();

            if (rpta == 1) {
                JOptionPane.showMessageDialog(null, "Docente Eliminado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Docente  No Eliminado", "Aviso", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return false;
    }

}
