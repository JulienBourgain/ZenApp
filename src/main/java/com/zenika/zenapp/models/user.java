package com.zenika.zenapp.models;

/**
 * @author Julien Bourgain
 */
public class User {
    String username;
    String password;
    boolean enabled;
    boolean accountExpired;
    boolean accountLocked;
    boolean passwordExpired;

    //Champs supplémentaires
    String nom;
    String prenom;
    Civilite civilite;
    String titre;
    String email;
    String tel;
    String im;
    String commentaires;
    Agence agence;
//    Avatar avatar;


}
