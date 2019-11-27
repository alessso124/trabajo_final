/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Include.Partido;
import Include.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.management.Query;
import javax.resource.spi.ConnectionManager;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB-USR-CAQP-C0204
 */
public class ModeloUsuario extends Conexion{
    static Connection currentCon = null;
    static ResultSet rs = null;
    
    public boolean crearUsuario(Persona p){
        boolean flag =false;
        PreparedStatement pst =null;
        try {
            String sql ="INSERT INTO persona ( DNI, Clave, Nombres, Primer_Apellido, Segundo_Apellido, Foto, Fecha_Nacimiento, (select max(Id_Direccion) from direccion), Id_Estado_Civil, Sexo, Tipo_Participante, Id_Mesas, Validacion_voto) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=getConnection().prepareStatement(sql);
            pst.setString(1, p.getDNI());
            pst.setString(2, p.getClave());
            pst.setString(3, p.getNombres());
            pst.setString(4, p.getPrimer_APellido());
            pst.setString(5, p.getSegundo_Apellido());
            pst.setString(6, p.getFoto());
            pst.setString(7, p.getFecha_Nacimiento());
//            pst.setInt(8, p.getId_Direccion());
            pst.setInt(9, p.getId_Estado_Civil());
            pst.setString(10, p.getSexo());
            pst.setInt(11, p.getId_Tipo_Participante());
            pst.setInt(12, p.getId_Mesas());
            pst.setBoolean(13, p.isValudacion_Voto());
            if (pst.executeUpdate()==1) {
                flag=true;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        finally{
            try {
                if(getConnection()!=null) getConnection().close();
                if(pst!=null)pst.close(); 
           } catch (Exception e) {
            }
        }
        return flag;
    }
    
    public boolean ActualizarUsuarioVoto(Persona p){
        boolean flag =false;
        PreparedStatement pst =null;
        try {
            String sql ="UPDATE persona SET Validacion_voto="+1+" WHERE DNI = '"+ p.getDNI().toString() +"'";
            pst=getConnection().prepareStatement(sql);
            if (pst.executeUpdate()==1) {
                flag=true;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        finally{
            try {
                if(getConnection()!=null) getConnection().close();
                if(pst!=null)pst.close(); 
           } catch (Exception e) {
            }
        }
        return flag;
    }
    
    public boolean login(Persona p){
        boolean flag=false;
        PreparedStatement pst=null;
        Statement stmt = null;
        try {
            String sql= "SELECT * FROM `persona` WHERE `DNI`='" + p.getDNI().toString() + "' and `Clave`='" + p.getClave().toString() + "'";
            Conexion con = new Conexion();
            currentCon = con.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(sql);
            boolean more = rs.next();
            if(more){
                flag=true;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }finally{
            try {
                if(getConnection()!=null)getConnection().close();
                if(pst!=null) pst.close();
                if(rs!=null) rs.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }
    
        public String Nombre(Persona p){
        boolean flag=false;
        PreparedStatement pst=null;
        Statement stmt = null;
        try {
            String sql= "SELECT * FROM `persona` WHERE `DNI`='" + p.getDNI().toString() + "' and `Clave`='" + p.getClave().toString() + "'";
            Conexion con = new Conexion();
            currentCon = con.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(sql);
            boolean more = rs.next();
            if(more){
                flag=true;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }finally{
            try {
                if(getConnection()!=null)getConnection().close();
                if(pst!=null) pst.close();
                if(rs!=null) rs.close();
            } catch (Exception e) {
            }
        }
        return "";
    }
    

//    public ResultSet ListaPartidos()
//    {
//        Conexion con = new Conexion();
//        currentCon = con.getConnection();
//        String com = "SELECT Id_Partido,Nombre_partido,Nombre_Participante_1,Nombre_Participante_2 FROM partido";
//        ResultSet ra1 = con.getDatos(com);
//        return ra1;
//    }
}
