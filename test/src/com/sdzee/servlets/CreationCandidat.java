package com.sdzee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdzee.beans.Candidat;
import com.sdzee.beans.Operation;

public class CreationCandidat extends HttpServlet {

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /*
         * Récupération des données saisies, envoyées en tant que paramètres de
         * la requête GET générée à la validation du formulaire
         */
        String nom = request.getParameter( "nomCandidat" );
        String prenom = request.getParameter( "prenomCandidat" );
        String cin = request.getParameter( "cinCandidat" );
        String date = request.getParameter( "datedenaissance" );
        String lieu = request.getParameter( "lieuCandidat" );
        String profession = request.getParameter( "professionactuel" );
        
        String adresse = request.getParameter( "adresseCandidat" );
        String email = request.getParameter( "emailCandidat" );
        String region = request.getParameter( "region" );
        String codepostal = request.getParameter( "CodepostalCandidat" );
        String province = request.getParameter( "province" );
        String ville = request.getParameter( "ville" );
        String telephoneCandidat = request.getParameter( "telephoneCandidat" );
        String telephoneCandidat2 = request.getParameter( "telephoneCandidat2" );
        
        String pays = request.getParameter( "pays" );
        String obtentionCandidat = request.getParameter( "obtentionCandidat" );
        String diplome = request.getParameter( "diplome" );
        String specialite = request.getParameter( "specialite" );
        String etablissement = request.getParameter( "etablissement" );


        




        String message;
        /*
         * Initialisation du message à afficher : si un des champs obligatoires
         * du formulaire n'est pas renseigné, alors on affiche un message
         * d'erreur, sinon on affiche un message de succès
         */
        if ( nom.trim().isEmpty() || cin.trim().isEmpty() || date.trim().isEmpty() ) {
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. "
            		+ "<br> <a href=\"test.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'un Candidat.";
        } else {
            message = "<h2> <legend> Informations validés</legend> </h2>";
        }
        /*
         * Création du bean Candidat et initialisation avec les données récupérées
         */
        Candidat candidat = new Candidat();
        candidat.setNom( nom );
        candidat.setPrenom( prenom );
        candidat.setCin( cin );
        candidat.setLieudenaissance( lieu );
        candidat.setDatedenaissance( date );
        candidat.setProfession (profession );
        
        candidat.setAdresse(adresse);
        candidat.setCodepostal(codepostal);
        candidat.setEmail(email);
        candidat.setRegion(region);
        candidat.setProvince(province);
        candidat.setVille(ville);
        candidat.setTelephoneCandidat(telephoneCandidat);
        candidat.setTelephoneCandidat2(telephoneCandidat2);
        
        candidat.setPays(pays);
        candidat.setObtentionCandidat(obtentionCandidat);
        candidat.setDiplome(diplome);
        candidat.setSpecialite(specialite);
        candidat.setEtablissement(etablissement);
        
        
        
      
        
        Operation op2 = new Operation();

        op2.add(new Candidat(nom,  prenom,  lieu,  date,  cin,
			 profession,  adresse,  email,  region,  province,  ville,
			 codepostal,  telephoneCandidat,  telephoneCandidat2, pays,
				 obtentionCandidat,  diplome,  specialite,  etablissement));
        
        
        

        /* Ajout du bean et du message à l'objet requête */
        request.setAttribute( "candidat", candidat );
        request.setAttribute( "message", message );

        /* Transmission à la page JSP en charge de l'affichage des données */
        this.getServletContext().getRequestDispatcher("/affichageCandidat.jsp").forward( request, response );
    }

    
    
    
    
    
    
    
    
}