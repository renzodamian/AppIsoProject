<%-- 
    Document   : crearFormulario
    Created on : 27/01/2019, 21:25:09
    Author     : renzo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Registro</title>
    </head>
    <body>
        <h1>Formulario Registro</h1>
        <form action="<%=request.getContextPath()%>/firstservlet.html" method="post">
            Nombre: <input type="text" name="txtnom"><br>
            Apellido: <input type="text" name="txtape"><br>
            Cedula: <input type="text" name="txtced"><br>
            Correo <input type="text" name="txtcor"><br>
            Usuario <input type="text" name="txtusu"><br>
            Contrasena: <input type="text" name="txtcon"><br>
            <input type="submit" name="btn1" value="Guardar">
        </form>
    </body>
</html>
