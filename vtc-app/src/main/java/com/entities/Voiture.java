/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.validator.constraints.NotEmpty;



@Entity 
public class Voiture implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idVoiture;
    
    @NotEmpty
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

    @ManyToMany(mappedBy="voitures")
    private Collection<Service> services;
    
    @ManyToOne
    @JoinColumn(name="FK_chauffeur")
    private Chauffeur chauffeur;

    public Voiture() {
    }

    public Voiture(String numeroCarteGrise, String nom, String marque, Long nombrePlaces, String motorisation, double puissance, Collection<Service> services, Chauffeur chauffeur) {
        this.numeroCarteGrise = numeroCarteGrise;
        this.nom = nom;
        this.marque = marque;
        this.nombrePlaces = nombrePlaces;
        this.motorisation = motorisation;
        this.puissance = puissance;
        this.services = services;
        this.chauffeur = chauffeur;
    }

    public Long getIdVoiture() {
        return idVoiture;
    }

    public void setIdVoiture(Long idVoiture) {
        this.idVoiture = idVoiture;
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
