/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.94
 * Generated at: 2019-07-31 09:24:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class failure_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<title>Acceuil</title>\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"inc/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<img src=\"haut.jpg\" alt=\"Italian Trulli\">\r\n");
      out.write("\r\n");
      out.write("<fieldset> \r\n");
      out.write("    <legend>Admin</legend>\r\n");
      out.write("\t<center>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("           <form action=\"login\" method=\"post\">\r\n");
      out.write("                Username : <input type=\"text\" name=\"username\" /></br>\r\n");
      out.write("                Password : <input type=\"password\" name=\"password\" /></br>\r\n");
      out.write("                <input type=\"submit\" value=\"Login\" />\r\n");
      out.write("                </br>\r\n");
      out.write("                </br>\r\n");
      out.write("                <h3><font color=\"red\"> Username or password is wrong, please try again! </font></h3>\r\n");
      out.write("            </form>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("        </center>\r\n");
      out.write("\t  \r\n");
      out.write("\t\r\n");
      out.write("</fieldset>\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<fieldset>\r\n");
      out.write("\r\n");
      out.write("    <legend>Annonces</legend>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"fix-height2\">\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("              <table >\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    <tr bgcolor=\"#1ad1e7\" >\r\n");
      out.write("                    <th style=\"width:40%\">Concours</th>\r\n");
      out.write("                    <th style=\"width:10%\">Candidature</th>\r\n");
      out.write("                    <th style=\"width:10%\">Date Concours</th>\r\n");
      out.write("                    <th style=\"width:10%\">Date Limite Dépôt du dossier</th>\r\n");
      out.write("\t\t            <th style=\"width:8%\">Nombre de postes</th>\r\n");
      out.write("\t\t            <th>Statut</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  \r\n");
      out.write("                    \r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td> \r\n");
      out.write("                         <span >Concours de recrutement des inspecteurs des finances</span>\r\n");
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td><a href=\"test.jsp\">Postuler</a> </td>\r\n");
      out.write("                    <td> 07/07/2019 </td>\r\n");
      out.write("                    <td> 31/05/2019 </td>\r\n");
      out.write("                    <td> 20  </td>\r\n");
      out.write("                    <td> <span >Disponible</span></td>\r\n");
      out.write("\r\n");
      out.write("                  </tr>\r\n");
      out.write("\r\n");
      out.write("             \r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td> \r\n");
      out.write("                         <span >Concours de recrutement des ingénieurs d'etat de 1er grade</span>\r\n");
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td><a href=\"test.jsp\">Postuler</a> </td>\r\n");
      out.write("                    <td> 16/06/2019 </td>\r\n");
      out.write("                    <td> 14/05/2019 </td>\r\n");
      out.write("                    <td> 18  </td>\r\n");
      out.write("                    <td> <span>Clôturé</span></td>\r\n");
      out.write("                    \r\n");
      out.write("                  </tr>\r\n");
      out.write("\r\n");
      out.write("             \r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td> \r\n");
      out.write("                         <span >Concours de recrutement des Administrateurs de 2eme grade</span>\r\n");
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td><a href=\"test.jsp\">Postuler</a> </td>\r\n");
      out.write("                    <td> 23/06/2019 </td>\r\n");
      out.write("                    <td> 29/04/2019 </td>\r\n");
      out.write("                    <td> 290  </td>\r\n");
      out.write("                    <td> <span >Clôturé</span></td>\r\n");
      out.write("                    \r\n");
      out.write("                  </tr>\r\n");
      out.write("\r\n");
      out.write("             \r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td> \r\n");
      out.write("                         <span >Concours de recrutement des Adjoints Administratifs de 3ème grade</span>\r\n");
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td><a href=\"test.jsp\">  Postuler</a> </td>\r\n");
      out.write("                    <td> 05/05/2019 </td>\r\n");
      out.write("                    <td> 19/04/2019 </td>\r\n");
      out.write("                    <td> 206  </td>\r\n");
      out.write("                    <td> <span >Disponible</span></td>\r\n");
      out.write("                    \r\n");
      out.write("                  </tr>\r\n");
      out.write("\r\n");
      out.write("             \r\n");
      out.write("               </tbody></table>\r\n");
      out.write("            \r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</fieldset>\r\n");
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