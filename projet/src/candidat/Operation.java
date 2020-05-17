package candidat;


import java.util.ArrayList; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet ;

public class Operation {
	private ArrayList<Candidat> candidats = new  ArrayList<Candidat>();

	public ArrayList<Candidat> getCandidats() {
		return candidats;
	}

	public void setCandidats(ArrayList<Candidat> candidats) {
		this.candidats = candidats;
	}
	
	public void add(Candidat c) {
		try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/formulaire","root",""); 

            PreparedStatement statement = cn.prepareStatement("insert into candidat values(NULL,?,?,?,?,?,?,?) ");
            statement.setString(1, c.getNom());
            statement.setString(2, c.getPrenom());
            statement.setString(3, c.getNom());
            statement.setString(4, c.getCin());
            statement.setString(5, c.getDatedenaissance());
            statement.setString(6, c.getLieudenaissance());
            statement.setString(7, c.getProfession());
            
            
            statement.execute();





            
	        
      
		 
	}
			catch (Exception e)
			{
			                System.out.print("impossible de se connecter à la base");
			                e.printStackTrace();
			    
			}
	}
	
	public void remove (int id) {
		for(Candidat c: candidats) {
			if(c.getId()==id) {
				candidats.remove(c);
				break;
			}
		}
	}
	public ArrayList getAll() {
		return candidats;
	}
}
	