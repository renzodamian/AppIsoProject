package org.apache.jsp.WEB_002dINF.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FormularioPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pedido</title>\n");
      out.write("        <link rel = \"stylesheet\"\n");
      out.write("              href =\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstarp.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class =\"header\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"login.html\">Administrador</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class = \"formulario\">\n");
      out.write("            <form method= \"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/pedido\">\n");
      out.write("                <h1>Bienvenido</h1>\n");
      out.write("                <h3>Hoja de Pedidos</h3>\n");
      out.write("                <p>Fecha</p>\n");
      out.write("                <input id=\"fecha\" type=\"text\" name=\"fecha\"  placeholder=\"Fecha\" required><br>\n");
      out.write("                <p>Nombre</p>\n");
      out.write("                <input id=\"nombre\" type=\"text\" name=\"nombre\"  placeholder=\"Nombre\" required><br>\n");
      out.write("                <p>Apellido</p>\n");
      out.write("                <input id=\"apellido\" type=\"text\" name=\"apellido\"  placeholder=\"Apellido\" required><br>\n");
      out.write("                <p>Empresa</p>\n");
      out.write("                <input id=\"empresa\" type=\"text\" name=\"empresa\"  placeholder=\"Empresa\" required><br>\n");
      out.write("                <p>Teléfono</p>\n");
      out.write("                <input id=\"telefono\" type=\"text\" name=\"telefono\"  placeholder=\"Telefono\" required><br>\n");
      out.write("                <br>\n");
      out.write("                <h3>Objetivo de Pedido</h3>\n");
      out.write("                <p>Estudio</p>\n");
      out.write("                <input id=\"estudio\" type=\"text\" name=\"estudio\"  placeholder=\"Estudio\" required><br>\n");
      out.write("                <p>Proyecto</p>\n");
      out.write("                <input id=\"proyecto\" type=\"text\" name=\"proyecto\"  placeholder=\"Proyecto\" required><br>\n");
      out.write("                <p>Control de Calidad</p>\n");
      out.write("                <input id=\"controlcalidad\" type=\"text\" name=\"controlcalidad\"  placeholder=\"Control de Calidad\" required><br>\n");
      out.write("                <p>Ensayos</p>\n");
      out.write("                <input id=\"ensayos\" type=\"text\" name=\"ensayos\"  placeholder=\"Ensayos\" required><br>\n");
      out.write("                <h3>Observaciones</h3>\n");
      out.write("                <input id=\"observaciones\" type=\"text\" name=\"observaciones\"  placeholder=\"Observaciones\"><br><br>\n");
      out.write("                <input type=\"submit\" value=\"Enviar\" name=\"submit\"/>\n");
      out.write("        </section>  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
