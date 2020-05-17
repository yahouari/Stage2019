package com.sdzee.beans;

public class Gestion {
	    private String concours;
	    private String dateconcours;
	    private String datelimite;
	    private String nombredepostes;
	    private String statut;
	    private int idg;
		public String getConcours() {
			return concours;
		}
		public void setConcours(String concours) {
			this.concours = concours;
		}
		public String getDateconcours() {
			return dateconcours;
		}
		public void setDateconcours(String dateconcours) {
			this.dateconcours = dateconcours;
		}
		public String getDatelimite() {
			return datelimite;
		}
		public void setDatelimite(String datelimite) {
			this.datelimite = datelimite;
		}
		public String getNombredepostes() {
			return nombredepostes;
		}
		public void setNombredepostes(String nombredepostes) {
			this.nombredepostes = nombredepostes;
		}
		public String getStatut() {
			return statut;
		}
		public void setStatut(String statut) {
			this.statut = statut;
		}
		public int getIdg() {
			return idg;
		}
		public void setIdg(int idg) {
			this.idg = idg;
		}
		public Gestion() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Gestion(String concours, String dateconcours, String datelimite, String nombredepostes, String statut) {
			super();
			this.concours = concours;
			this.dateconcours = dateconcours;
			this.datelimite = datelimite;
			this.nombredepostes = nombredepostes;
			this.statut = statut;
		}
		

}
