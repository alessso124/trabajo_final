/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author LAB-USR-CAQP-C0204
 */
public class Conexion {
//
//    private String username = "root";
//    private String password = "";
//    private String hostname = "localhost";
//    private String port = "8088";
//    private String database = "trabajo_final";
//    private String classname = "com.mysql.jdbc.Driver";
//    private String url = "jdbc:mysql://" + hostname + "/" + database;
////    private String url="jdbc:mysql://localhost/trabajo_final;
////    private String url="jdbc:mysql://"+hostname+":"+port+port"/"+database;
//    private Connection conn;
//
//    public Conexion() {
//        try {
//            Class.forName(classname);
//            conn = DriverManager.getConnection(url, username, password);
//
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    public Connection getConnection() {
//        return this.conn;
//    }
        Connection cn;
    String drv = "com.mysql.jdbc.Driver";
    private String username = "root";
    private String password = "";
    private String hostname = "localhost";
    private String port = "8088";
    private String database = "trabajo_final";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://" + hostname + "/" + database;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    Statement stmt = null;
        String sql = "";
//    private String url="jdbc:mysql://localhost/trabajo_final;
//    private String url="jdbc:mysql://"+hostname+":"+port+port"/"+database;
    private Connection conn;

    public Conexion() {
        try {
            Class.forName(classname);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexion exitosa");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        try {
            Class.forName(drv);//driver
            cn = DriverManager.getConnection(url, username, password);
            pstm = cn.prepareStatement(sql);
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            System.out.println("Error de conexion: " + e);
        }
        return cn;
    }

    public ResultSet getDatos(String com) {
        try {
            pstm = conn.prepareStatement(com);
            rs = pstm.executeQuery(com);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return rs;
    }
}
