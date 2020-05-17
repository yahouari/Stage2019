package com.sdzee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdzee.beans.Operation;
import com.sdzee.beans.Suppression;

public class SuppressionServlet extends HttpServlet {

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /*
         * Récupération des données saisies, envoyées en tant que paramètres de
         * la requête GET générée à la validation du formulaire
         * 
         
    	
    	String concours = request.getParameter( "Concours" );
    	String dateConcours = request.getParameter( "dateConcours" );
    	String dateLimite = request.getParameter( "DateLimite" );
    	String nombredepostes = request.getParameter( "nombredepostes" );
    	String statut = request.getParameter( "statut" );

    	
    	
         * Création du bean Candidat et initialisation avec les données récupérées
         */
    	String id = request.getParameter( "Idg" );
    	int idd = Integer.parseInt(id);
    	
    	
        
    	Suppression supp = new Suppression();
    	supp.setIdg(idd);
    	
    	Operation opp = new Operation();
    	
    	opp.suppconcours(new Suppression(idd));
    	
    	 request.setAttribute( "supp", supp );
    	 

    	 this.getServletContext().getRequestDispatcher("/supprime.jsp").forward( request, response );
    	
    
    
    
    
    
    
    
    
    
    
    
    
    }
    


}