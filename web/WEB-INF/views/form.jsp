<%-- 
    Document   : form
    Created on : 14/01/2019, 11:22:10
    Author     : renzo
--%>
<%@page import="com.pract.ejemplo.servlet.model.User"%>
<%@page import="java.util.List"%>
<%
    String titulo = (String) request.getAttribute("titulo");
    User user = (User) request.getAttribute("user");
    List<String> errores = (List<String>) request.getAttribute("errores");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=titulo%></title>
    </head>
    <body>
        <h3><%=titulo%></h3>
        <% if (errores != null && errores.size() > 0) {%>
        <ul>

            <%for (String error : errores) {%>
            <li style="color:red; font-weight: bold; "<%=error%>></li>
                <% }%>
        </ul>
        <% }%>
        <a href="<%=request.getContextPath()%>/catalogo/listado">&lt;&lt;volver</a>
        <form method="post">
            <input name="id" type="hidden" value="<%=user.getId()%>"

                   <table>
                <tr>
                    <td>Usuario:</td>
                    <td>  <input name="usuario" type="text" value="<%=(user.getUsuario()==null) ?"" : user.getUsuario()%>"</td>
                </tr>
                <tr>
                    <td>Clave:</td>
                    <td>  <input name="clave" type="text" value="<%=(user.getClave()==null) ?"" : user.getClave()%>"</td>
                </tr>
                <tr>
                    <td>Correo</td>
                    <td>  <input name="email" type="text" value="<%=(user.getEmail()==null) ?"" : user.getEmail()%>"</td>
                </tr>
            </table>
                <input name="enviar" type="submit" value="<%=titulo%>"/>
        </form>

    </body>
</html>
