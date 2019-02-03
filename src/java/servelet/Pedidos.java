/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import Adaptadores.PedidoDAO;
import clases.Pedido;
import interfaz.IntPedidoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Pedidos", urlPatterns = {"/Pedidos.html"})
public class Pedidos extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/FormularioPedido.jsp").forward(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Maneja la actualizar y eliminar
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        //obtenemos datos desde el formulario
        String fecha = request.getParameter("fecha");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String empresa = request.getParameter("empresa");
        String telefono = request.getParameter("telefono");
        String estudio = request.getParameter("estudio");
        String proyecto = request.getParameter("proyecto");
        String controlcalidad = request.getParameter("controlcalidad");
        String observaciones = request.getParameter("observaciones");
        
        PedidoDAO objPedidoDao = new PedidoDAO();//instancia Adaptador -> las sentencias para  CRUD
        
        Pedido objpedido = new Pedido();
        objpedido.setFecha(fecha);
        //System.out.println("FECHA"+ objpedido.getFecha());
        objpedido.setNombre(nombre);
        objpedido.setApellido(apellido);
        objpedido.setEmpresa(empresa);
        objpedido.setTelefono(telefono);
        objpedido.setEstudio(estudio);
        objpedido.setProyecto(proyecto);
        objpedido.setControlcalidad(controlcalidad);
        objpedido.setObservaciones(observaciones);
        
        objPedidoDao.insertarPedido(objpedido);//enviamos objPedido a la clase adaptador para crud
        //String url = request.getContextPath()+
                
        request.setAttribute("objpedido",objpedido);//enviamos el obj pedido para q se presente en otro html respuesta
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/respuesta.jsp").forward(request, response);
        
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
