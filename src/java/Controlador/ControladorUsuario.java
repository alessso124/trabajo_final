/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Include.Persona;
import Modelo.ModeloUsuario;

/**
 *
 * @author LAB-USR-CAQP-C0204
 */
public class ControladorUsuario {
    public boolean create(Persona p){
        ModeloUsuario mu = new ModeloUsuario();
        return mu.crearUsuario(p);
    }
    public boolean login(Persona p){
        ModeloUsuario mu = new ModeloUsuario();
        return mu.login(p);
    }
    
    public String getViewUser(Persona p){
        String htmlcode="";
        htmlcode+="<h2>Bienvenido "+p.getDNI()+"</h2>";
        htmlcode+="<div><a href='logout'>Cerrar sesion</a></div>";
        return htmlcode;
    }
}
