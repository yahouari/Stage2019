/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.94
 * Generated at: 2019-07-31 14:05:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class Gestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"inc/gest.css\" />\r\n");
      out.write("        <title> Espace Admin</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   \r\n");
      out.write("        <div>\r\n");
      out.write("            <form method=\"get\" action=\"GestionServlet\">\r\n");
      out.write("            <h2><font color=\"brown\"> Espace Admin</font></h2>\r\n");
      out.write("              \r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t  <h3> Ajouter Concours</h3>\r\n");
      out.write("\t\t\t  <label for=\"Concours\">Concours : <span class=\"requis\">*</span></label>\r\n");
      out.write("              <input type=\"text\" id=\"Concours\" name=\"Concours\" value=\"\" size=\"40\" maxlength=\"40\" />\r\n");
      out.write("              <br />\r\n");
      out.write("              <br />\r\n");
      out.write("              \r\n");
      out.write("              <label for=\"DateConcours\">DateConcours : <span class=\"requis\">*</span></label>\r\n");
      out.write("              <input type=\"text\" id=\"dateConcours\" name=\"dateConcours\" value=\"\" size=\"20\" maxlength=\"20\" />\r\n");
      out.write("              <br />\r\n");
      out.write("              <br />\r\n");
      out.write("              \r\n");
      out.write("              <label for=\"DateLimite\">Date Limite Dépôt du dossier :<span class=\"requis\">*</span></label>\r\n");
      out.write("              <input type=\"text\" id=\"DateLimite\" name=\"DateLimite\" value=\"\" size=\"20\" maxlength=\"20\" />\r\n");
      out.write("              <br />\r\n");
      out.write("              <br />\r\n");
      out.write("              \r\n");
      out.write("              <label for=\"nombredepostes\">Nombredepostes :<span class=\"requis\">*</span></label>\r\n");
      out.write("              <input type=\"text\" id=\"nombredepostes\" name=\"nombredepostes\" value=\"\" size=\"20\" maxlength=\"20\" />\r\n");
      out.write("              <br />\r\n");
      out.write("              <br />\r\n");
      out.write("               <label for=\"statut\">Statut :<span class=\"requis\">*</span></label>\r\n");
      out.write("              <input type=\"text\" id=\"statut\" name=\"statut\" value=\"\" size=\"20\" maxlength=\"20\" />\r\n");
      out.write("              <br />\r\n");
      out.write("              <br />\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("              <input type=\"submit\" value=\"ajouter\"  />\r\n");
      out.write("              </form>\r\n");
      out.write("              <form method=\"get\" action=\"SuppressionServlet\">\r\n");
      out.write("              \r\n");
      out.write("              <h3> Supprimer Concours</h3>\t\t\r\n");
      out.write("              <input type=\"Idg\" id=\"Idg\" name=\"Idg\" value=\"\" size=\"40\" maxlength=\"40\" placeholder=\"Entrez Id de Concours à supprimer\" />\r\n");
      out.write("              <br />\r\n");
      out.write("              <br />  \r\n");
      out.write("\t\t\t  <input type=\"submit\" value=\"supprimer\"  />\r\n");
      out.write("\t\t\t  </form>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("        </div>\r\n");
      out.write("         <legend>Concours</legend>\r\n");
      out.write("    \r\n");
      out.write("    <div >\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("              <table >\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    <tr bgcolor=\"#93d8e3\" >\r\n");
      out.write("                    <th style=\"width:7%\">IdConcours</th>\r\n");
      out.write("                    \r\n");
      out.write("                    <th style=\"width:40%\">Concours</th>\r\n");
      out.write("                    <th style=\"width:8%\">Date Concours</th>\r\n");
      out.write("                    <th style=\"width:14%\">Date Limite</th>\r\n");
      out.write("\t\t            <th style=\"width:8%\">Nombre De Postes</th>\r\n");
      out.write("\t\t         \r\n");
      out.write("\t\t            <th style=\"width:9%\">Statut</th>\r\n");
      out.write("\t\t          <th style=\"width:15%\">Action</th>\r\n");
      out.write("\t\t            \r\n");
      out.write("\t\t            \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                  ");

                try {
                	Class.forName("com.mysql.jdbc.Driver");
                    
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root",""); 

                    PreparedStatement statement = cn.prepareStatement("SELECT * FROM `gestion` order by idg");
                    ResultSet Rs = statement.executeQuery() ;
                    
                 
                    while (Rs.next()) {
            
      out.write("\r\n");
      out.write("            <tr class=\"info\">\r\n");
      out.write("                <td>");
      out.print(Rs.getString("idg"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(Rs.getString("concours"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(Rs.getString("dateconcours"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(Rs.getString("datelimite"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(Rs.getString("nombredepostes"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(Rs.getString("Statut"));
      out.write("</td>\r\n");
      out.write("                <td name=\"id\"><a href=\"update.jsp?id=");
      out.print(Rs.getString("idg"));
      out.write("\">update</a>\r\n");
      out.write("                <a href=\"supp.jsp?id=");
      out.print(Rs.getString("idg"));
      out.write("\">/Supprimer</a></td>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <legend>Candidats</legend>\r\n");
      out.write("    \r\n");
      out.write("    <div >\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("              <table >\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    <tr bgcolor=\"#93d8e3\" >\r\n");
      out.write("                    <th style=\"width:9%\">Prénom</th>\r\n");
      out.write("                    <th style=\"width:8%\">Nom</th>\r\n");
      out.write("                    <th style=\"width:14%\">Diplome</th>\r\n");
      out.write("\t\t            <th style=\"width:11%\">Date de Naissance</th>\r\n");
      out.write("\t\t            \r\n");
      out.write("\t\t            <th style=\"width:40%\">Concours</th>\r\n");
      out.write("\t\t            \r\n");
      out.write("\t\t            \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                  ");

                try {
                	Class.forName("com.mysql.jdbc.Driver");
                    
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root",""); 

                    PreparedStatement statement = cn.prepareStatement("select * from candidat");
                    ResultSet Rs = statement.executeQuery() ;
                    
                 
                    while (Rs.next()) {
            
      out.write("\r\n");
      out.write("            <tr class=\"info\">\r\n");
      out.write("                <td>");
      out.print(Rs.getString("prenom"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(Rs.getString("nom"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(Rs.getString("diplome"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(Rs.getString("date_naissance"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(Rs.getString("concours"));
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                    \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("\r\n");
      out.write("             \r\n");
      out.write("                  \r\n");
      out.write("\r\n");
      out.write("             \r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write("\t\t\t\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
