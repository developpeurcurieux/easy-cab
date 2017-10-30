/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Aeroport implements Serializable {
    @Id
    private String nom;
    private String ville;

    public Aeroport() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Aeroport{" + "nom=" + nom + ", ville=" + ville + '}';
    }
    
    
    
}
