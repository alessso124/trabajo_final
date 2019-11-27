/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Include.Partido;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LAB-USR-CAQP-C0201
 */
public class ModeloPartidos {
    static Connection currenctCon= null;
    static ResultSet rs = null;
    
    public  Partido[] obtener(){
         int posicion = 0;
        Partido[] obj_partidos = null;
        Statement stmt = null;
        

        String searchQuery =
                "SELECT Id_Partido,Nombre_partido ,Foto ,Nombre_Participante_1,Nombre_Participante_2 FROM partido";
        
        System.out.println(searchQuery);
        
        try{
            
            Conexion con = new Conexion();
            currenctCon = con.getConnection();
            stmt = currenctCon.createStatement();
            rs = stmt.executeQuery(searchQuery);
//            boolean more= rs.next();
//            
            if(rs.last()){
                int tamanio = rs.getRow();
                obj_partidos = new Partido[tamanio];
                rs.beforeFirst();
            }
            
            while(rs.next()){    
                Partido bean = new Partido();
                
                String id_partido = rs.getString("Id_Partido");
                bean.setIdPartido(Integer.parseInt(id_partido));
                String descripcion = rs.getString("Nombre_partido");
                bean.setNombre_Partido(descripcion);
                String logo = rs.getString("Foto");
                bean.setFoto(logo);
                String nombre = rs.getString("Nombre_Participante_1");
                bean.setNombre_Participante1(nombre);
                String nombre2 = rs.getString("Nombre_Participante_2");
                bean.setNombre_Participante2(nombre2);
                obj_partidos[posicion] = bean;
                posicion++;
            }
 
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        finally{
            if(rs != null){
                try{
                    rs.close();
                }catch(Exception e){
                    rs=null;
                }  
            }
            if(stmt != null){
                try{
                    stmt.close();
                }catch(Exception e){
                    stmt=null;
                }  
            }
            if(currenctCon != null){
                try{
                    currenctCon.close();
                }catch(Exception e){
                    currenctCon=null;
                }  
            }
        }
        return obj_partidos;
    }
    
}
