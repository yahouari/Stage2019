package com.sdzee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdzee.beans.Gestion;
import com.sdzee.beans.Operation;

public class GestionServlet extends HttpServlet {

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /*
         * Récupération des données saisies, envoyées en tant que paramètres de
         * la requête GET générée à la validation du formulaire
         * 
         */
    	
    	String concours = request.getParameter( "Concours" );
    	String dateConcours = request.getParameter( "dateConcours" );
    	String dateLimite = request.getParameter( "DateLimite" );
    	String nombredepostes = request.getParameter( "nombredepostes" );
    	String statut = request.getParameter( "statut" );

    	
    	/*
         * Création du bean Candidat et initialisation avec les données récupérées
         */
    	
    	
    	String message;
        /*
         * Initialisation du message à afficher : si un des champs obligatoires
         * du formulaire n'est pas renseigné, alors on affiche un message
         * d'erreur, sinon on affiche un message de succès
         */
        if ( concours.trim().isEmpty() || dateConcours.trim().isEmpty() || dateLimite.trim().isEmpty()|| nombredepostes.trim().isEmpty() ) {
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. "
            		+ "<br> <a href=\"Gestion.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'un Candidat.";
        } else {
            message = "<h1> <legend> Informations validés avec succés</legend> </h1>";
        }
        
    	Gestion gestion = new Gestion();
    	gestion.setConcours(concours);
    	gestion.setDateconcours(dateConcours);
    	gestion.setDatelimite(dateLimite);
    	gestion.setNombredepostes(nombredepostes);
    	gestion.setStatut(statut);
    	
    	Operation opp = new Operation();
    	
    	opp.addconcours(new Gestion(concours,dateConcours,dateLimite,nombredepostes,statut));
    	
    	 request.setAttribute( "gestion", gestion );
    	 request.setAttribute( "message", message );

    	
    	 this.getServletContext().getRequestDispatcher("/valide.jsp").forward( request, response );
    	
    
    
    
    
    
    
    
    
    
    
    
    
    }
    


}