/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author LAB-USR-CAQP-C0203
 */
public class Combo {

    static Connection currentCon = null;
    public ResultSet mostrarDep() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Departamento, Nombre FROM departamento";
        ResultSet ra1 = con.getDatos(com);
        return ra1;
    }

    public ResultSet mostrarDis() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Distrito,Nombre FROM distrito";
        ResultSet ra1 = con.getDatos(com);
        return ra1;
    }

    public ResultSet mostrarPro() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Provincia,Nombre FROM provincia";
        ResultSet ra2 = con.getDatos(com);
        return ra2;
    }

    public ResultSet mostrarPar() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Tipo_participante,Tipo FROM tipo_participante ";
        ResultSet ra2 = con.getDatos(com);
        return ra2;
    }

    public ResultSet mostrarCiv() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Estado_Civil,Descripcion FROM estado_civil";
        ResultSet ra2 = con.getDatos(com);
        return ra2;
    }

    public ResultSet mostrarCol() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Colegio,Nombre FROM colegio";
        ResultSet ra2 = con.getDatos(com);
        return ra2;
    }
    public String mostrarDep1() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Departamento, Nombre FROM departamento";
        ResultSet ra = con.getDatos(com);
        Vector<Vector<String>> Departamentos = new Vector<Vector<String>>();
//        Departamentos;
        try {
            while (ra.next()) {
            int id =ra.getInt("Id_Departamento");
            String dep = ra.getString("Nombre");
            Vector<String> departamento = new Vector<String>();
            departamento.add(String.valueOf(id));
            departamento.add(dep);
            Departamentos.add(departamento);
        }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        
        Gson g = new Gson();
        String jsonResult = g.toJson(Departamentos);
        return jsonResult;
    }
    public String mostrarDis1() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Distrito,Nombre FROM distrito";
        ResultSet ra = con.getDatos(com);
        Vector<Vector<String>> Departamentos = new Vector<Vector<String>>();
//        Distritos;
        try {
            while (ra.next()) {
            int id =ra.getInt("Id_Distrito");
            String dep = ra.getString("Nombre");
            Vector<String> departamento = new Vector<String>();
            departamento.add(String.valueOf(id));
            departamento.add(dep);
            Departamentos.add(departamento);
        }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        
        Gson g = new Gson();
        String jsonResult = g.toJson(Departamentos);
        return jsonResult;
    }
    public String mostrarPro1() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Provincia,Nombre FROM provincia";
        ResultSet ra = con.getDatos(com);
        Vector<Vector<String>> Departamentos = new Vector<Vector<String>>();
//        Provincia;
        try {
            while (ra.next()) {
            int id =ra.getInt("Id_Provincia");
            String dep = ra.getString("Nombre");
            Vector<String> departamento = new Vector<String>();
            departamento.add(String.valueOf(id));
            departamento.add(dep);
            Departamentos.add(departamento);
        }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        
        Gson g = new Gson();
        String jsonResult = g.toJson(Departamentos);
        return jsonResult;
    }
    public String mostrarPar1() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Tipo_participante,Tipo FROM tipo_participante";
        ResultSet ra = con.getDatos(com);
        Vector<Vector<String>> Departamentos = new Vector<Vector<String>>();
//        Provincia;
        try {
            while (ra.next()) {
            int id =ra.getInt("Id_Tipo_participante");
            String dep = ra.getString("Tipo");
            Vector<String> departamento = new Vector<String>();
            departamento.add(String.valueOf(id));
            departamento.add(dep);
            Departamentos.add(departamento);
        }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        
        Gson g = new Gson();
        String jsonResult = g.toJson(Departamentos);
        return jsonResult;
    }
    public String mostrarCiv1() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Estado_Civil,Descripcion FROM estado_civil";
        ResultSet ra = con.getDatos(com);
        Vector<Vector<String>> Departamentos = new Vector<Vector<String>>();
//        Provincia;
        try {
            while (ra.next()) {
            int id =ra.getInt("Id_Estado_Civil");
            String dep = ra.getString("Descripcion");
            Vector<String> departamento = new Vector<String>();
            departamento.add(String.valueOf(id));
            departamento.add(dep);
            Departamentos.add(departamento);
        }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        
        Gson g = new Gson();
        String jsonResult = g.toJson(Departamentos);
        return jsonResult;
    }
    public String mostrarCol1() {
        Conexion con = new Conexion();
        currentCon = con.getConnection();
        String com = "SELECT Id_Colegio,Nombre FROM colegio";
        ResultSet ra = con.getDatos(com);
        Vector<Vector<String>> Departamentos = new Vector<Vector<String>>();
//        Provincia;
        try {
            while (ra.next()) {
            int id =ra.getInt("Id_Colegio");
            String dep = ra.getString("Nombre");
            Vector<String> departamento = new Vector<String>();
            departamento.add(String.valueOf(id));
            departamento.add(dep);
            Departamentos.add(departamento);
        }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        
        Gson g = new Gson();
        String jsonResult = g.toJson(Departamentos);
        return jsonResult;
    }


}
