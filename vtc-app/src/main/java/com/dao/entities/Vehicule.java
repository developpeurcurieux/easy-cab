/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_VEHICULE", discriminatorType=DiscriminatorType.STRING, length=2)
public abstract class Vehicule implements Serializable {
     @Id
    private String numeroCarteGrise;
    
    @NotEmpty
    private String nom;
    
    @NotEmpty
    private String marque;
    
    @NotEmpty
    private Long nombrePlaces;
    
    @NotEmpty
    private String motorisation;
    
    @NotEmpty
    private double puissance;

    public Vehicule() {
    }

    public Vehicule(String numeroCarteGrise, String nom, String marque, Long nombrePlaces, String motorisation, double puissance) {
        this.numeroCarteGrise = numeroCarteGrise;
        this.nom = nom;
        this.marque = marque;
        this.nombrePlaces = nombrePlaces;
        this.motorisation = motorisation;
        this.puissance = puissance;
    }

    public String getNumeroCarteGrise() {
        return numeroCarteGrise;
    }

    public void setNumeroCarteGrise(String numeroCarteGrise) {
        this.numeroCarteGrise = numeroCarteGrise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Long getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(Long nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public String getMotorisation() {
        return motorisation;
    }

    public void setMotorisation(String motorisation) {
        this.motorisation = motorisation;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }
    
    
    
}
