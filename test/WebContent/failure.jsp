<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
		<title>Acceuil</title>
		<link type="text/css" rel="stylesheet" href="inc/style.css" />
</head>
<body>


<img src="haut.jpg" alt="Italian Trulli">

<fieldset> 
    <legend>Admin</legend>
	<center>
 
 
           <form action="login" method="post">
                Username : <input type="text" name="username" /></br>
                Password : <input type="password" name="password" /></br>
                <input type="submit" value="Login" />
                </br>
                </br>
                <h3><font color="red"> Username or password is wrong, please try again! </font></h3>
            </form>
 
 
        </center>
	  
	
</fieldset>	
	

<fieldset>

    <legend>Annonces</legend>
    
    <div class="fix-height2">
       
       
       
              <table >
                    <tbody>
                    <tr bgcolor="#1ad1e7" >
                    <th style="width:40%">Concours</th>
                    <th style="width:10%">Candidature</th>
                    <th style="width:10%">Date Concours</th>
                    <th style="width:10%">Date Limite Dépôt du dossier</th>
		            <th style="width:8%">Nombre de postes</th>
		            <th>Statut</th>
                    </tr>
                  
                    
                  <tr>
                    <td> 
                         <span >Concours de recrutement des inspecteurs des finances</span>

                    </td>
                    <td><a href="test.jsp">Postuler</a> </td>
                    <td> 07/07/2019 </td>
                    <td> 31/05/2019 </td>
                    <td> 20  </td>
                    <td> <span >Disponible</span></td>

                  </tr>

             
                  <tr>
                    <td> 
                         <span >Concours de recrutement des ingénieurs d'etat de 1er grade</span>

                    </td>
                    <td><a href="test.jsp">Postuler</a> </td>
                    <td> 16/06/2019 </td>
                    <td> 14/05/2019 </td>
                    <td> 18  </td>
                    <td> <span>Clôturé</span></td>
                    
                  </tr>

             
                  <tr>
                    <td> 
                         <span >Concours de recrutement des Administrateurs de 2eme grade</span>

                    </td>
                    <td><a href="test.jsp">Postuler</a> </td>
                    <td> 23/06/2019 </td>
                    <td> 29/04/2019 </td>
                    <td> 290  </td>
                    <td> <span >Clôturé</span></td>
                    
                  </tr>

             
                  <tr>
                    <td> 
                         <span >Concours de recrutement des Adjoints Administratifs de 3ème grade</span>

                    </td>
                    <td><a href="test.jsp">  Postuler</a> </td>
                    <td> 05/05/2019 </td>
                    <td> 19/04/2019 </td>
                    <td> 206  </td>
                    <td> <span >Disponible</span></td>
                    
                  </tr>

             
               </tbody></table>
            
    
    </div>
    


</fieldset>
</body>
</html>