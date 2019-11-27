<%-- 
    Document   : Registro
    Created on : 29/10/2019, 07:01:58 PM
    Author     : LAB-USR-CAQP-C0204
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Regisrar Persona</title>
        <script src="jquery-3.4.1.js" type="text/javascript"></script>
        <!--<script src="js/jquery-1.11.1.js" type="text/javascript"></script>-->
        <script src="js/mani.js" type="text/javascript"></script>        
    </head>
    <body>
        <h1>Nueva Persona</h1>
        <form method="POST" id="frm-registroP" action="registrar">
            <table>
                <tr>
                    <td> <label for ="username"> DNI </label></td>
                    <td><input type="text" name="DNI" id="DNI"></td>

                </tr>
                <tr>
                    <td> <label for ="username"> Clave </label></td>
                    <td><input type="text" name="Clave" id="Clave"></td>
                </tr>
                <tr>
                    <td> <label for ="username"> Nombres </label></td>
                    <td><input type="text" name="Nombre" id="Nombres"></td>
                </tr>
                <tr>
                    <td> <label for ="username"> Primer Apellido </label></td>
                    <td><input type="text" name="Primer Apellido" id="Primer_Apellido"></td>
                </tr>
                <tr>
                    <td> <label for ="username"> Segundo Apellido </label></td>
                    <td><input type="text" name="Segundo Apellido" id="Segundo_Apellido"></td>
                </tr>
                <tr>
                    <td> <label for ="username"> Foto </label></td>
                    <td><input type="text" name="Foto" id="Foto"></td>
                </tr>
                <tr>
                    <td> <label for ="username"> Fecha de nacimiento</label></td>
                    <td><input type="text" name="Fecha de Nacimiento" id="Fecha_Nacimiento"></td>
                </tr>
                
                <tr>
                    <td> <label for ="username"> Direccion </label></td>
                    <td><input type="text" name="Direccion" id="Direccion"></td>
                </tr>
                <tr>
                
                        <jsp:useBean id="Dep" class="Modelo.Combo" scope="page"></jsp:useBean>
                        <%
                            ResultSet ra = Dep.mostrarDep();
                        %>
                        <td> <label for ="username"> Departamento </label></td>
                        <td>  <select>
                            <option>Escoge una opcion</option>
                            <%
                                while (ra.next()) {
                            %>
                            <option value="<%=ra.getInt("Id_Departamento")%>" id="idDep"><%=ra.getString("Nombre")%></option>
                            <%
                                }
                            %>
                        </select></td>
                </tr>
                        <!--//combobox-->
                        <tr>
                        <jsp:useBean id="Pros" class="Modelo.Combo" scope="page"></jsp:useBean>
                        <%
                            ResultSet ra1 = Pros.mostrarPro();
                        %>
                        <td> <label for ="username"> Provincia </label></td>
                        <td> <select>
                            
                            <option>Escoge una opcion</option>
                            <%
                                while (ra1.next()) {
                            %>
                            <option value="<%=ra1.getInt("Id_Provincia")%>"id="idPro"><%=ra1.getString("Nombre")%></option>
                            <%
                                }
                            %>
                        </select></td>
                        </tr>
                        <!--//combobox-->
                        <tr>
                        <jsp:useBean id="Dis" class="Modelo.Combo" scope="page"></jsp:useBean>
                        <%
                            ResultSet ra2 = Dis.mostrarDis();
                        %>
                        <td> <label for ="username"> Distrito </label></td>
                        <td><select>
                            <option>Escoge una opcion</option>
                            <%
                                while (ra2.next()) {
                            %>
                            <option value="<%=ra2.getInt("Id_Distrito")%>" id="idDistri"><%=ra2.getString("Nombre")%></option>
                            <%
                                }
                            %>
                        </select></td>
                </tr>
                
                <tr>
                    <td> <label for ="username"> Estado Civil </label></td>
                    <td><input type="text" name="Estado Civil" id="Estado_Civil"></td>
                </tr>
                
                <tr>
                    <td> <label for ="username"> Sexo </label></td>
                    <td><input type="text" name="Sexo" id="Sexo"></td>
                </tr>
                <tr>
                    <td> <label for ="username"> Participante </label></td>
                    <td><input type="text" name="Participante" id="Participante"></td>
                </tr>
                <tr>
                    <td> <label for ="username"> Mesas </label></td>
                    <td><input type="text" name="Mesas" id="Mesas"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Restrarme"id="btn-registroP"</td>
                </tr>
                
            </table>
        </form>
    </body>
</html>
