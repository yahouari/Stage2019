<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8" />
		<link type="text/css" rel="stylesheet" href="inc/gest.css" />
        <title> Espace Admin</title>
</head>
<body>
   
        <div>
            <form method="get" action="GestionServlet">
            <h2><font color="brown"> Espace Admin</font></h2>
              
		<fieldset>
			  <h3> Ajouter Concours</h3>
			  <label for="Concours">Concours : <span class="requis">*</span></label>
              <input type="text" id="Concours" name="Concours" value="" size="40" maxlength="40" />
              <br />
              <br />
              
              <label for="DateConcours">DateConcours : <span class="requis">*</span></label>
              <input type="text" id="dateConcours" name="dateConcours" value="" size="20" maxlength="20" />
              <br />
              <br />
              
              <label for="DateLimite">Date Limite Dépôt du dossier :<span class="requis">*</span></label>
              <input type="text" id="DateLimite" name="DateLimite" value="" size="20" maxlength="20" />
              <br />
              <br />
              
              <label for="nombredepostes">Nombredepostes :<span class="requis">*</span></label>
              <input type="text" id="nombredepostes" name="nombredepostes" value="" size="20" maxlength="20" />
              <br />
              <br />
               <label for="statut">Statut :<span class="requis">*</span></label>
              <input type="text" id="statut" name="statut" value="" size="20" maxlength="20" />
              <br />
              <br />
              
              
              
              <input type="submit" value="ajouter"  />
              </form>
              <form method="get" action="SuppressionServlet">
              
              <h3> Supprimer Concours</h3>		
              <input type="Idg" id="Idg" name="Idg" value="" size="40" maxlength="40" placeholder="Entrez Id de Concours à supprimer" />
              <br />
              <br />  
			  <input type="submit" value="supprimer"  />
			  </form>
			  
		</fieldset>
			  
        </div>
         <legend>Concours</legend>
    
    <div >
       
       
       
              <table >
                    <tbody>
                    <tr bgcolor="#93d8e3" >
                    <th style="width:7%">IdConcours</th>
                    
                    <th style="width:40%">Concours</th>
                    <th style="width:8%">Date Concours</th>
                    <th style="width:14%">Date Limite</th>
		            <th style="width:8%">Nombre De Postes</th>
		         
		            <th style="width:9%">Statut</th>
		          <th style="width:15%">Action</th>
		            
		            
                    </tr>
                    <%@page import="java.sql.Connection"%>
					<%@page import="java.sql.DriverManager"%>
					<%@page import="java.sql.PreparedStatement"%>
					<%@page import="java.sql.ResultSet"%>
                  <%
                try {
                	Class.forName("com.mysql.jdbc.Driver");
                    
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root",""); 

                    PreparedStatement statement = cn.prepareStatement("SELECT * FROM `gestion` order by idg");
                    ResultSet Rs = statement.executeQuery() ;
                    
                 
                    while (Rs.next()) {
            %>
            <tr class="info">
                <td><%=Rs.getString("idg")%></td>
                <td><%=Rs.getString("concours")%></td>
                <td><%=Rs.getString("dateconcours")%></td>
                <td><%=Rs.getString("datelimite")%></td>
                <td><%=Rs.getString("nombredepostes")%></td>
                <td><%=Rs.getString("Statut")%></td>
                <td name="id"><a href="update.jsp?id=<%=Rs.getString("idg")%>">update</a>
                <a href="supp.jsp?id=<%=Rs.getString("idg")%>">/Supprimer</a></td>
                
                
            </tr>
            <%
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </table>
    </div>

    <legend>Candidats</legend>
    
    <div >
       
       
       
              <table >
                    <tbody>
                    <tr bgcolor="#93d8e3" >
                    <th style="width:9%">Prénom</th>
                    <th style="width:8%">Nom</th>
                    <th style="width:14%">Diplome</th>
		            <th style="width:11%">Date de Naissance</th>
		            
		            <th style="width:40%">Concours</th>
		            
		            
                    </tr>
                    <%@page import="java.sql.Connection"%>
					<%@page import="java.sql.DriverManager"%>
					<%@page import="java.sql.PreparedStatement"%>
					<%@page import="java.sql.ResultSet"%>
                  <%
                try {
                	Class.forName("com.mysql.jdbc.Driver");
                    
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root",""); 

                    PreparedStatement statement = cn.prepareStatement("select * from candidat");
                    ResultSet Rs = statement.executeQuery() ;
                    
                 
                    while (Rs.next()) {
            %>
            <tr class="info">
                <td><%=Rs.getString("prenom")%></td>
                <td><%=Rs.getString("nom")%></td>
                <td><%=Rs.getString("diplome")%></td>
                <td><%=Rs.getString("date_naissance")%></td>
                <td><%=Rs.getString("concours")%></td>
            </tr>
            <%
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </table>

                  
                    
                  
                  
                  

             
                  

             
           
            
    
    </div>
        
			
            


</body>
</html>