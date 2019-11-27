/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Include.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ALESSO
 */
@WebServlet(name = "CrearPersona", urlPatterns = {"/registrar"})
public class CrearPersona extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String DNI = request.getParameter("DNI");
        String clave = request.getParameter("Clave");
        String nombres = request.getParameter("Nombres");
        String papellido = request.getParameter("Primer_Apellido");
        String sapellido = request.getParameter("Segundo_Apellido");
        String foto = request.getParameter("Foto");
        String fechanacimiento = request.getParameter("Fecha_Nacimiento");
        int iddireccion = Integer.parseInt(request.getParameter("Direccion"));
        int idestado = Integer.parseInt(request.getParameter("Estado_Civil"));
        String sexo = request.getParameter("Sexo");
        int participante = Integer.parseInt(request.getParameter("Participante"));
        int mesas = Integer.parseInt(request.getParameter("Mesas"));
        boolean validacion=false;
        Persona PersonaNueva = new Persona(DNI,clave,nombres,papellido,sapellido,foto,fechanacimiento,iddireccion,idestado,sexo,participante,mesas,validacion);
//        String foto = request.getParameter("Foto");
        Controlador.ControladorUsuario cu=new Controlador.ControladorUsuario();
        if (cu.create(PersonaNueva)){
            System.out.println("se registro con exito");
        }else{
            System.out.println("Error en el regisro intentelo de nuevo");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
