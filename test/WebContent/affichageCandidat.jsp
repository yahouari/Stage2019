<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title> Affichage d'un candidat </title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
        
    </head>
    <body>
        
        <p class="info"><h3 >${ message } </h3> </p>
        <p> <h4>Informations personnelles</h4></p>
        
        <p>Nom : ${ candidat.nom }</p>
        <p>Prénom : ${ candidat.prenom }</p>
        <p>CIN : ${ candidat.cin }</p>
        <p>Date de naissance : ${ candidat.datedenaissance }</p>
        <p>Lieu de naissance : ${ candidat.lieudenaissance }</p>
        <p>Profession : ${ candidat.profession }</p>
        
		<p> <h4>Adresses & Coordonées </h4></p>
		<p> Adresse :  ${ candidat.adresse } </p>
		<p> Région :  ${ candidat.region }</p>
		<p> Province :  ${ candidat.province }</p>
		<p> Ville :  ${ candidat.ville }</p>
		<p> Email:  ${ candidat.email }</p>
		<p> CodePostal :  ${ candidat.codepostal }</p>
		<p> GSM1:  ${ candidat.telephoneCandidat }</p>
		<p> GSM2: ${ candidat.telephoneCandidat2 }</p>
		
		<p> <h4>Diplome & Concours </h4></p>
		<p> Pays :  ${ candidat.pays } </p>
		<p> Obtention :  ${ candidat.obtentionCandidat }</p>
		<p> Diplome :  ${ candidat.diplome }</p>
		<p> Specialité :  ${ candidat.specialite }</p>
		<p> Etablissement:  ${ candidat.etablissement }</p>
		
        
        <br/>
        <input type="button" value="Télécharger"/>
    </body>
</html>