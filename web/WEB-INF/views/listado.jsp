<%-- 
    Document   : listado
    Created on : 14/01/2019, 11:45:17
    Author     : renzo
--%>
<%@page import="java.util.List"%>
<%@page import="com.pract.ejemplo.servlet.model.User"%>
<%
    List<User> lista = (List<User>) request.getAttribute("usuario");
     String titulo = (String) request.getAttribute("titulo");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=titulo%></title>
    </head>
    <body>
        <h1><%=titulo%></h1>
        <a href="<%=request.getContextPath()%>/catalogo/form">crear usuario (+)</a>
        <table border="0">
               
                    <tr>
                        <th>Id</th>
                        <th>Usuario</th>
                        <th>Clave</th>
                        <th>Correo</th>
                        
                    </tr>
               <% for (User user : lista){%>
               
                    <tr>
                        <td><%=user.getId()%></td>
                        
                        <td><%=user.getUsuario()%></td>
                        <td><%=user.getClave()%></td>
                        <td><%=user.getEmail()%></td>
                        <td>
                            <a href="<%=request.getContextPath()%>/catalogo/form?id="<%=user.getId()%>>
                            editar</a>
                        </td>
                        
                        <td>
                            <a href="<%=request.getContextPath()%>/catalogo/eliminar?id="<%=user.getId()%>>
                            eliminar</a>
                        </td>
                    </tr>
                                         
            </table>
    </body>
</html>
