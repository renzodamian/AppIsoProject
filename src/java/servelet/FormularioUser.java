/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import Adaptadores.UserDAO;
import clases.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author renzo
 */
@WebServlet(name = "FormularioUser", urlPatterns = {"/firstservlet.html"})
public class FormularioUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/FormRegisterUser.jsp").forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String nombre = request.getParameter("txtnom");
        String apellido = request.getParameter("txtape");
        String cedula = request.getParameter("txtced");
        String correo = request.getParameter("txtcor");
        String user = request.getParameter("txtusu");
        String pass = request.getParameter("txtcon");

        UserDAO objUserDao = new UserDAO();
        User objuser = new User();
        objuser.setNombreU(nombre);
        objuser.setApellidoU(apellido);
        objuser.setCedulaU(cedula);
        objuser.setCorreoU(correo);
        objuser.setUsuarioU(user);
        objuser.setContrasenaU(pass);
        
        objUserDao.insertarUser(objuser);
        request.setAttribute("objuser",objuser);
        //getServletContext().getRequestDispatcher("/WEB-INF/vistas/tablauser.jsp").forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
