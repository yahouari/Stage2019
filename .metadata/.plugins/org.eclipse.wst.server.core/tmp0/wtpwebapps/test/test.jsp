<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title> Formulaire candidat  </title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
   
        <div>
            <form method="get" action="CreationCandidat">
                <fieldset>
                    <h2> <legend> Informations personnelles</legend> </h2>
    
                    <label for="nomCandidat">Nom <span class="requis">*</span></label>
                    <input type="text" id="nomCandidat" name="nomCandidat" value="" size="20" maxlength="20" />
                    <br />
                    <br />
                    
                    
                   
                    
                    <label for="prenomCandidat">Prénom </label>
                    <input type="text" id="prenomCandidat" name="prenomCandidat" value="" size="20" maxlength="20" />
                    <br />
                    <br />
                    
                    <label for="cinCandidat">CIN <span class="requis">*</span></label>
                    <input type="text" id="cinCandidat" name="cinCandidat" value="" size="20" maxlength="20" />
                    <br />
                    <br />
                    
                    <label for="datedenaissance">Date de naissance</label>
                    <input type="text" id="datedenaissance" name="datedenaissance" value="" size="20" maxlength="20" placeholder="jj-mm-aaaa"/>
                    <br />
                    <br />
    
                    <label for="lieuCandidat">Lieu de naissance  <span class="requis">*</span></label>
                    <input type="text" id="lieuCandidat" name="lieuCandidat" value="" size="20" maxlength="20" />
                    <br />
                    <br />
    
                   
                    <label for="professionactuel">Profession Actuel </label>
                    <input type="diplome" id="professionactuel" name="professionactuel" value="" size="20" maxlength="60" />
                    <br />
                    </fieldset>
                    
                <fieldset>
                    <h2> <legend> Adresse et Coordonées</legend> </h2>
                   
                   
                    <label for="adresseCandidat">Adresse  <span class="requis">*</span></label>
                    <input type="text" id="adresseCandidat" name="adresseCandidat" value="" size="30" maxlength="60" />
                    
                    &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  
                    
                    <label for="emailCandidat">Adresse email <span class="requis">*</span></label>
                    <input type="email" id="emailCandidat" name="emailCandidat" value="" size="20" maxlength="60" />
                    <br />
                    <br />
                    
                    
                    <label for="RegionCandidat">Région <span class="requis">*</span></label>
                    <select name="region" size="">
 
 					
					<%@page import="java.sql.Connection"%>
					<%@page import="java.sql.DriverManager"%>
					<%@page import="java.sql.PreparedStatement"%>
					<%@page import="java.sql.ResultSet"%>
					<% 
					try{
					                                Class.forName("com.mysql.jdbc.Driver");
					                                
					                                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/formulaire","root",""); 
					                    
					                                PreparedStatement statement = cn.prepareStatement("select * from AdrsCord");
					                                ResultSet Rs = statement.executeQuery() ;
					                                while(Rs.next()){
					                                                String item= Rs.getString("Region");
					                                                %>
											                        <option value="<%=item%>"><%=item%></option>
											        
							                  <% 
					                                        
					                    } 
					                    
					                    }
					catch (Exception e)
					{
					                                    System.out.print("impossible de se connecter à la base");
					                                    e.printStackTrace();
					                        
				    } %>
					 
					 
					</select>
					                  
					 &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  
                    
                    <label for="CodepostalCandidat">Code postal </label>
                    <input type="text" id="CodepostalCandidat" name="CodepostalCandidat" value="" size="20" maxlength="20" />
                    <br />
                    <br />
                    
                   
					<br />
                    
                    
                     <label for="ProvinceCandidat">Province </label>
                    <select name="province" size="">
 
 
					<%@page import="java.sql.Connection"%>
					<%@page import="java.sql.DriverManager"%>
					<%@page import="java.sql.PreparedStatement"%>
					<%@page import="java.sql.ResultSet"%>
					<% 
					try{
					                                Class.forName("com.mysql.jdbc.Driver");
					                                
					                                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/formulaire","root",""); 
					                    
					                                PreparedStatement statement = cn.prepareStatement("select * from AdrsCord ");
					                                
					                                ResultSet Rs = statement.executeQuery() ;
					                                while(Rs.next()){
					                                                String item= Rs.getString("Province");
					                                                %>
											                        <option value="<%=item%>"><%=item%></option>
					 
							                  <% 
					                                        
					                    } 
					                    
					                    }
					catch (Exception e)
					{
					                                    System.out.print("impossible de se connecter à la base");
					                                    e.printStackTrace();
					                        
				    } %>
					 
					 
					</select>
                    &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  
                    
                     <label for="telephoneCandidat">Numéro de téléphone <span class="requis">*</span></label>
                    <input type="text" id="telephoneCandidat" name="telephoneCandidat" value="" size="20" maxlength="20" />
                    <br />
                    <br />
                    
                     <label for="villeCandidat">Ville <span class="requis">*</span></label>
					<select name="ville" size="">
 
 
					<%@page import="java.sql.Connection"%>
					<%@page import="java.sql.DriverManager"%>
					<%@page import="java.sql.PreparedStatement"%>
					<%@page import="java.sql.ResultSet"%>
					<% 
					try{

					                                Class.forName("com.mysql.jdbc.Driver");
					                                
					                                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/formulaire","root",""); 
					                    
					                                PreparedStatement statement = cn.prepareStatement("select * from AdrsCord  ");
					                                ResultSet Rs = statement.executeQuery() ;
					                                while(Rs.next()){
					                                                String item= Rs.getString("Ville");
					                                                %>
											                        <option value="<%=item%>"><%=item%></option>
					 
							                  <% 
					                                        
					                    } 
					                    
					                    }
					catch (Exception e)
					{
					                                    System.out.print("impossible de se connecter à la base");
					                                    e.printStackTrace();
					                        
				    } %>
					 
					 
					</select>                    &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  
                    
                    <label for="telephoneCandidat2"> Téléphone 2 </label>
                    <input type="text" id="telephoneCandidat2" name="telephoneCandidat2" value="" size="20" maxlength="20" />
                    <br />
                    
                   
     
                </fieldset>
                <fieldset>
                    <h2> <legend> Diplome</legend> </h2>
                   
                   
                    <label for="paysCandidat">Pays  <span class="requis">*</span></label>
					<select name="pays" size=""> 
					
					<option value="Maroc">Maroc</option>
				    <option value="France">France</option>
				    <option value="Canada">Canada</option>
					</select>
					                   
                    &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  
                    
                    <label for="obtentionCandidat">Année d'obtention<span class="requis">*</span></label>
                    <input type="text" id="obtentionCandidat" name="obtentionCandidat" value="" size="20" maxlength="60" />
                    <br />
                    <br />
           
                    
                    <label for="diplomeCandidat">Diplome obtenu <span class="requis">*</span></label>
					<select name="diplome" size=""> 
					
					<option value="Diplome d'Ingenieur d'Etat">Diplome d'Ingenieur d'Etat</option>
				    <option value="Diplome de technicien specialisé">Diplome de technicien specialisé</option>
				    <option value="Diplome d'economiste">Diplome d'economiste</option>
					</select>
                    <br />
                    <br />
                    
                    
                    <label for="specialiteCandidat">Specialité<span class="requis">*</span></label>
					<select name="specialite" size=""> 
					
					<option value="Ingenieur des systemes d'informations">Ingenieur des systemes d'informations</option>
				    <option value="expert en finances">expert en finances</option>
				    <option value="technicien electrique">technicien electrique </option>
					</select>
                    <br />
                    <br />
                    
                    <label for="etablissementCandidat">Etablissement <span class="requis">*</span></label>
					<select name="etablissement" size=""> 
					
					<option value="emi">EMI</option>
				    <option value="encg">ENCG</option>
				    <option value="bts">BTS</option>
					</select>
                    <br />
                    <br />
                    
                    
                    </fieldset>
                    
                <input type="submit" value="Valider"  />
                <input type="reset" value="Remettre à zéro" /> <br />
            </form>
        </div>
    </body>
</html>