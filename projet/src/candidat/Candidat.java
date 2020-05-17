package candidat;


import java.sql.Connection ;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Candidat {
   /* Propriétés du bean */
   private int id;
   private String nom;
   private String prenom;
   private String cin;
   private String datedenaissance;
   private String lieudenaissance;
   private String profession;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getDatedenaissance() {
		return datedenaissance;
	}
	public void setDatedenaissance(String datedenaissance) {
		this.datedenaissance = datedenaissance;
	}
	public String getLieudenaissance() {
		return lieudenaissance;
	}
	public void setLieudenaissance(String lieudenaissance) {
		this.lieudenaissance = lieudenaissance;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidat(String nom, String prenom, String cin, String datedenaissance, String lieudenaissance,
			String profession) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.datedenaissance = datedenaissance;
		this.lieudenaissance = lieudenaissance;
		this.profession = profession;
	}
	
	@Override
	public String toString() {
		return "Candidat [nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", datedenaissance=" + datedenaissance
				+ ", lieudenaissance=" + lieudenaissance + ", profession=" + profession + "]";
	}
	
	public void show() {
		System.out.println(toString());
	}
}
   
   

  
