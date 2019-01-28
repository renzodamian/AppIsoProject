<%-- 
    Document   : login
    Created on : 12-ene-2019, 17:52:59
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <main class="form_login">
            <section class="formulario_login">
                <meta charset="utf-8">
                <form method= "post" action="<%=request.getContextPath()%>/login.html">
		<br>
                <h2>Login Administrador</h2>
		<p>Usuario</p>
		<input id="usuario" type="text" name="usuario"  placeholder="Usuario" required><br><br>
		<p>Clave</p>
		<input id="clave" type="password" name="clave"  placeholder="Clave" required><br>		
            </section>
            
            <section class = "btn_login">
                <button><p id="btn_login">Ok</p></button>
            </section>
	</main>
    </body>
</html>

