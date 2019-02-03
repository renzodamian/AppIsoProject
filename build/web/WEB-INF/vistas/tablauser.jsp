<%-- 
    Document   : tablauser
    Created on : 31/01/2019, 20:29:08
    Author     : renzo
--%>
<%@page import="clases.User"%>
<%
    User objuser = (User) request.getAttribute("objuser");
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>datos enviados desde el formulario</h1>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Cedula</th>
                     <th scope="col">Correo</th>
                    <th scope="col">Usuario</th>
                    <th scope="col">Password</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td><%=objuser.getNombreU()%></td>
                    <td><%=objuser.getApellidoU()%></td>
                    <td><%=objuser.getCedulaU()%></td>
                    <td><%=objuser.getCorreoU()%></td>
                    <td><%=objuser.getUsuarioU()%></td>
                    <td><%=objuser.getContrasenaU()%></td>
                </tr>
            </tbody>
        </table>
        <a class= "btn btn-default" href="<%=request.getContextPath()%>/firstservlet.html"> Atras</a>
    </body>
</html>
