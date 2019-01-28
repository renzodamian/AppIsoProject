<%-- 
    Document   : ResouestaPedido
    Created on : 21-ene-2019, 18:52:30
    Author     : Usuario
--%>

<%@page import="clases.Pedido"%>
<%
    Pedido objpedido = (Pedido) request.getAttribute("objpedido");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset= "utf-8">
        <title>JSP Page</title>
        <link rel = "stylesheet"
              href ="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstarp.min.css">
        
    </head>
    <body>
        <h1>datos enviados desde el formulario</h1>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Empresa</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td><%=objpedido.getNombre()%></td>
                    <td><%=objpedido.getApellido()%></td>
                    <td><%=objpedido.getEmpresa()%></td>
                </tr>
            </tbody>
        </table>
                <a class= "btn btn-default" href="<%=request.getContextPath()%>/Pedidos.html"> Atras</a>
    </body>
</html>
