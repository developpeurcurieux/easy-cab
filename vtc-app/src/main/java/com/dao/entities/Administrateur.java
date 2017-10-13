/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("ADMIN")
public class Administrateur extends User{

    public Administrateur() {
    }

    public Administrateur(String genre, String nom, String prenom, String mdp, Date dateEntree) {
        super(genre, nom, prenom, mdp, dateEntree);
    }
    
    
}
