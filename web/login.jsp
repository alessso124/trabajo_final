<%-- 
    Document   : login
    Created on : 21/11/2019, 11:15:47 AM
    Author     : LAB-USR-CAQP-C0201
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="jquery-3.4.1.js" type="text/javascript"></script>
        <script src="js/mani.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Iniciar sesion</h1>
        <form method="POST" id="frm-login1" action="login">
            <table>
                <tr>
                    <td> <label for ="username"> DNI </label></td>
                    <td><input type="text" name="DNI" id="DNI"></td>
                </tr>
                <tr>
                    <td> <label for ="username"> Clave </label></td>
                    <td><input type="password" name="Clave" id="Clave"></td>                    
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login"id="btn-login"</td>
                </tr>

            </table>
        </form>
    </body>
</html>
