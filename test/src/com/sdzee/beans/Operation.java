package com.sdzee.beans;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Operation {
	
	
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void add(Candidat c) {
		try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root",""); 

            PreparedStatement statement = cn.prepareStatement("INSERT INTO coordcandidat (IdCoord, Nom, Prenom, DateNaiss, LieuNaiss, ProfessionActuel, IdDiplome, IdConcours, CIN) VALUES (NULL, ?, ?, ?, ?, ?, '', '',?) ");
            statement.setString(1, c.getNom());
            statement.setString(2, c.getPrenom());
            statement.setString(3, c.getDatedenaissance());
            statement.setString(4, c.getLieudenaissance());
            statement.setString(5, c.getProfession());
            statement.setString(6, c.getCin());
            statement.execute();

            PreparedStatement statementt = cn.prepareStatement("INSERT INTO region (IdRegion, Region) VALUES (NULL, ?)");
            statementt.setString(1, c.getRegion());
            statementt.execute();
            
            PreparedStatement statementtt = cn.prepareStatement("INSERT INTO `province` (`IdProvince`, `IdRegion`, `Province`) VALUES (NULL, NULL, ?)");
            statementtt.setString(1, c.getProvince());
            statementtt.execute();
            
            PreparedStatement statementttt = cn.prepareStatement("INSERT INTO `ville` (`IdVille`, `IdProvince`, `ville`) VALUES (NULL, NULL, ?)");
            statementttt.setString(1, c.getVille());
            statementttt.execute();
            
            PreparedStatement statementtttt = cn.prepareStatement("INSERT INTO `adresse_candidat` (`IdAdresse`, `IdRegion`, `IdCoord`, `Adresse`, `Email`, `Codepostal`, `GSM1`, `GSM2`) VALUES (NULL, NULL, NULL, ?, ?, ?, ?, ?);");
            statementtttt.setString(1, c.getAdresse());
            statementtttt.setString(2, c.getEmail());
            statementtttt.setString(3, c.getCodepostal());
            statementtttt.setString(4, c.getTelephoneCandidat());
            statementtttt.setString(5, c.getTelephoneCandidat());

            statementtttt.execute();
            
            
            
            
            
            
            




            
	        
      
		 
	}
			catch (Exception e)
			{
			                System.out.print("impossible de se connecter à la base");
			                e.printStackTrace();
			    
			}
	}
	
	
	public void addconcours(Gestion g) {
		try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root",""); 

            PreparedStatement statement = cn.prepareStatement("INSERT INTO `gestion` (`idg`, `concours`, `dateconcours`, `datelimite`, `nombredepostes`, `Statut`) VALUES (NULL,?,?,?,?, ?) ");
            statement.setString(1, g.getConcours());
            statement.setString(2, g.getDateconcours());
            statement.setString(3, g.getDatelimite());
            statement.setString(4, g.getNombredepostes());
            statement.setString(5, g.getStatut());
            statement.execute();

            	        
      
		 
	}
			catch (Exception e)
			{
			                System.out.print("impossible de se connecter à la base");
			                e.printStackTrace();
			    
			}
	}
	
	public void suppconcours(Suppression s) {
		try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root",""); 

            PreparedStatement statement = cn.prepareStatement("DELETE FROM `gestion` WHERE `gestion`.`idg` = ? ");
            statement.setLong(1, s.getIdg());
            
            statement.execute();

            	        
      
		 
	}
			catch (Exception e)
			{
			                System.out.print("impossible de se connecter à la base");
			                e.printStackTrace();
			    
			}
		
		
	}
}