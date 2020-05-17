

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("id");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "form";
String userid = "root";
String password = "";
System.out.println(id);
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from  gestion where idg="+id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>

<body>
<h2><font color="red"> Modification des Données </font></h2>
<form method="post" action="update-process.jsp">
		<input type="hidden" name="id" value="<%=resultSet.getString("idg") %>">
		<input type="text" name="id" value="<%=resultSet.getString("idg") %>">
		<br>
		Concours:<br>
		<input type="text" name="concours" value="<%=resultSet.getString("concours") %>">
		<br>
		Date Concours:<br>
		<input type="text" name="dateconcours" value="<%=resultSet.getString("dateconcours") %>">
		<br>
		Date Limite:<br>
		<input type="text" name="datelimite" value="<%=resultSet.getString("datelimite") %>">
		<br>
		Nombre De postes :<br>
		<input type="text" name="nombredepostes" value="<%=resultSet.getString("nombredepostes") %>">
		<br>
		Statut :<br>
		<input type="text" name="Statut" value="<%=resultSet.getString("Statut") %>">
		<br>
		<br><br>
		<input type="submit" value="submit">
</form>

<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>