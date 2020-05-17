<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/form";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String id = request.getParameter("id");


if(id != null)
{
Connection con = null;
PreparedStatement ps = null;
int idd= Integer.parseInt(id);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="DELETE FROM gestion where idg="+id;
ps = con.prepareStatement(sql);

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
