/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@DiscriminatorValue("VO")
public class Voiture extends Vehicule {
   

    @ManyToMany(mappedBy="voitures")
    private Collection<Service> services;
    
    @ManyToOne
    @JoinColumn(name="FK_chauffeur")
    private Chauffeur chauffeur;

    public Voiture() {
    }

    public Voiture(Collection<Service> services, Chauffeur chauffeur, String numeroCarteGrise, String nom, String marque, Long nombrePlaces, String motorisation, double puissance) {
        super(numeroCarteGrise, nom, marque, nombrePlaces, motorisation, puissance);
        this.services = services;
        this.chauffeur = chauffeur;
    }

    public Voiture(String numeroCarteGrise, String nom, String marque, Long nombrePlaces, String motorisation, double puissance) {
        super(numeroCarteGrise, nom, marque, nombrePlaces, motorisation, puissance);
    }

    public Voiture(Chauffeur chauffeur, String numeroCarteGrise, String nom, String marque, Long nombrePlaces, String motorisation, double puissance) {
        super(numeroCarteGrise, nom, marque, nombrePlaces, motorisation, puissance);
        this.chauffeur = chauffeur;
    }

    public Collection<Service> getServices() {
        return services;
    }

    public void setServices(Collection<Service> services) {
        this.services = services;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }

    
}
