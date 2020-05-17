<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/form";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String id = request.getParameter("id");

String cnc = request.getParameter("concours");
String date=request.getParameter("dateconcours");
String lim=request.getParameter("datelimite");
String nbr=request.getParameter("nombredepostes");
String stat=request.getParameter("Statut");
if(id != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(id);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update gestion set idg=?,concours=?,dateconcours=?,datelimite=?,nombredepostes=? ,Statut=? where idg="+id;
ps = con.prepareStatement(sql);
ps.setString(1,id);
ps.setString(2, cnc);
ps.setString(3, date);
ps.setString(4, lim);
ps.setString(5, nbr);
ps.setString(6, stat);

int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");


}
else
{
out.print("There is a problem in updating Record.");
} 
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>
<a href="Gestion.jsp">Retour</a>
