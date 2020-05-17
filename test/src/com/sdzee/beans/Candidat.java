package com.sdzee.beans;



public class Candidat {
    /* Propriétés du bean */
    private String nom;
    private String prenom;
    private String lieudenaissance;
    private String datedenaissance;
    private String cin;
    private String profession;
    private int id;
    
    private String adresse;
    private String email;
    private String region;
    private String province; 
    private String ville;
    private String codepostal;
    private String telephoneCandidat;
    private String telephoneCandidat2;
    
    private String pays;
    private String obtentionCandidat;
    private String diplome;
    private String specialite;
    private String etablissement;
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
	public String getLieudenaissance() {
		return lieudenaissance;
	}
	public void setLieudenaissance(String lieudenaissance) {
		this.lieudenaissance = lieudenaissance;
	}
	public String getDatedenaissance() {
		return datedenaissance;
	}
	public void setDatedenaissance(String datedenaissance) {
		this.datedenaissance = datedenaissance;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getTelephoneCandidat() {
		return telephoneCandidat;
	}
	public void setTelephoneCandidat(String telephoneCandidat) {
		this.telephoneCandidat = telephoneCandidat;
	}
	public String getTelephoneCandidat2() {
		return telephoneCandidat2;
	}
	public void setTelephoneCandidat2(String telephoneCandidat2) {
		this.telephoneCandidat2 = telephoneCandidat2;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getObtentionCandidat() {
		return obtentionCandidat;
	}
	public void setObtentionCandidat(String obtentionCandidat) {
		this.obtentionCandidat = obtentionCandidat;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidat(String nom, String prenom, String lieudenaissance, String datedenaissance, String cin,
			String profession, String adresse, String email, String region, String province, String ville,
			String codepostal, String telephoneCandidat, String telephoneCandidat2, String pays,
			String obtentionCandidat, String diplome, String specialite, String etablissement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.lieudenaissance = lieudenaissance;
		this.datedenaissance = datedenaissance;
		this.cin = cin;
		this.profession = profession;
		this.adresse = adresse;
		this.email = email;
		this.region = region;
		this.province = province;
		this.ville = ville;
		this.codepostal = codepostal;
		this.telephoneCandidat = telephoneCandidat;
		this.telephoneCandidat2 = telephoneCandidat2;
		this.pays = pays;
		this.obtentionCandidat = obtentionCandidat;
		this.diplome = diplome;
		this.specialite = specialite;
		this.etablissement = etablissement;
	}
    
    

   
	}
