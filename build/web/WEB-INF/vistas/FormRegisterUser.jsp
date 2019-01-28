<%-- 
    Document   : crearFormulario
    Created on : 27/01/2019, 21:25:09
    Author     : renzo
--%>
<%

    String title = (String) request.getAttribute("Title");
    String title2 = (String) request.getAttribute("Title2");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=title%></title>
    </head>
    <body>
        <h1><%=title2%></h1>
        <form action="<%=request.getContextPath()%>/firstservlet" method="post">
            Nombre: <input type="text" name="txtnom"><br>
            Apellido: <input type="text" name="txtape"><br>
            Cedula: <input type="text" name="txtced"><br>
            Correo <input type="text" name="txtcor"><br>
            Usuario <input type="text" name="txtusu"><br>
            Contrasena: <input type="text" name="txtcon"><br>
            <input type="submit" name="btn1" value="<%=title2%>">
        </form>
    </body>
</html>
