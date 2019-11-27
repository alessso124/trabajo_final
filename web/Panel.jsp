<%-- 
    Document   : Panel
    Created on : 21/11/2019, 10:39:53 AM
    Author     : LAB-USR-CAQP-C0201
--%>

<%@page import="Modelo.ModeloPartidos"%>
<%@page import="Include.Partido"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Include.Persona"%>
<%@page import="Controlador.ControladorUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession(true);
    Object usuario = sesion.getAttribute("DNI") == null ? null : sesion.getAttribute("DNI");
    
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%            if (usuario != null) {
                ControladorUsuario pu = new ControladorUsuario();
                Persona DNI = new Persona(usuario.toString());
        %>
        <%=pu.getViewUser(DNI)%>

        <%
            } else {
                response.getWriter().println("Por favor inicie sesion");
                response.getWriter().println("<a href='index.jsp'> Iniciar Sesion</a>");

            }

        %>

        <form method="POST" id="frm-panel" action="Voto">
            <table class="table"  width="575" border="2" cellspacing="2" >
                <th>Id</th><th>Nombre del Partido</th><th>Foto</th><th>Primer Participante</th><th>Segundo Participante</th>
                    <%                                   ModeloPartidos mp = new ModeloPartidos();
                        ModeloPartidos modelo = new ModeloPartidos();
                        Partido objpartidos[] = mp.obtener();
                    %>

                <% for (int i = 0; i < objpartidos.length; i++) {%>     
                <%--<%= objpartidos[i].getIdPartido()%>--%>

                <tr id="tabla" class="grilla_cabecera" >
                <center><td id="id"  class="has-text-align-center" data-align="center" style="width: 50px;"><%= objpartidos[i].getIdPartido()%></center>
                    <td id="nombre" class="has-text-align-center" data-align="center"><%= objpartidos[i].getNombre_Partido()%>
                    <td id="foto" class="has-text-align-center" data-align="center"><img class="wp-image-17" style="width: 50px;" src="<%= objpartidos[i].getFoto()%>" alt=""></td>
                    <td id="par1" class="has-text-align-center" data-align="center"><%= objpartidos[i].getNombre_Participante1()%>
                    <td id="par2" class="has-text-align-center" data-align="center"><%= objpartidos[i].getNombre_Participante2()%>
                    <!--<td> <input type ="radio" id="voto" name="votacion" value="<= objpartidos[i].getIdPartido()%>" > Votar por la lista <= objpartidos[i].getIdPartido()%> </td>-->
                    <td><input type="radio" name="voto" value="<%= objpartidos[i].getIdPartido()%>"id="btn-panel"</td>

                </tr>
<!--
                <tr>
                    <td> <label for ="username" > %= objpartidos[i].getIdPartido()%> </label></td>
                    <td><input type="text" name="Clave" id="Clave"></td>
                </tr>-->
                <!-- 
                       Scriplet: son inserciones de codigo java dentro un JSP    < % %>
                       Expression: son resultados de codigo java que se va visualizar en el JSP < %=   %>    
                -->
                <%  }%>
            </table>
            <tr>
                <td></td>

                <td><input type="submit" value="Votar"id="btn-panel"</td>

            </tr>
        </form>
    </center>
    <script>
        $(document).ready(function () {
            //el metodo blur se ejecuta cuando se sale del textbox
            $('#id').blur(function () {
                $.ajax({
                    url: 'Votacion',
                    data: {
                        id: $('#id').val()
                    },
                    success: function (responseText) {
                        $('#Votacion').text(responseText);
                    }
                });
            });
        });
    </script>
</body>
</html>
