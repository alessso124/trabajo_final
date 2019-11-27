/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Include.Direccion;
import java.sql.PreparedStatement;

/**
 *
 * @author ALESSO
 */
public class ModeloDireccion extends Conexion{
    public boolean crearDireccion(Direccion d){
        boolean flag =false;
        PreparedStatement pst =null;
        try {
            String sql1 ="INSERT INTO direccion( Nombre, Id_Distrito) VALUES (?,?)";
            pst=getConnection().prepareStatement(sql1);
            pst.setString(1, d.getDireccion());
            pst.setInt(2, d.getIdDistri());
            String sql2 ="UPDATE distrito SET Poblacion=(select MAX(Poblacion)+1 from distrito)  WHERE Id_Distrito=?";
            pst=getConnection().prepareStatement(sql2);
            pst.setInt(1, d.getIdDistri());
            String sql3 ="UPDATE provincia SET Cantidad_Poblacional=(select MAX(Poblacion)+1 from provincia) WHERE Id_Provincia=?";
            pst=getConnection().prepareStatement(sql3);
            pst.setInt(1, d.getIdProvi());
            String sql ="UPDATE departamento SET Cantidad_poblacion=(select MAX(Poblacion)+1 from departamento) WHERE Id_Departamento=?";
            pst=getConnection().prepareStatement(sql);            
            pst.setInt(1, d.getIdProvi());
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
}
