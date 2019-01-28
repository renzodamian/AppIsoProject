/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import clases.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Adaptadores.*;
import interfaz.*;
/**
 *
 * @author Usuario
 */
@WebServlet(name = "login", urlPatterns = {"/login.html"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("usuario", "sd");
        request.setAttribute("clave", "ad");    
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        
        Administrador a = new Administrador();//envio parametros del formulario a la clase
        a.setUsuario(usuario);
        a.setClave(clave);
        /*
        IntAdminDAO objintAdmindao = new AdminDAO();//instanciar interfaz a la clase de metodos.
        
        Administrador admin = objintAdmindao.login(usuario, clave);
        System.out.println("nombre: "+ admin.getNombre());
       /*
        if ((admin.getApellido() == null && admin.getNombre() == null)){
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/denegarLogin.jsp");
        }else{
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/confirmarLogin.jsp");
        }
        */
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
