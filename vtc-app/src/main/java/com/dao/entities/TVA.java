/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class TVA implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idTva;
    
    private String nom;
    private double montant;

    @OneToMany(mappedBy="tva")
    private Collection<Service> services;
    
    
    public TVA() {
    }

    public TVA(String nom, double montant, Collection<Service> services) {
        this.nom = nom;
        this.montant = montant;
        this.services = services;
    }

    public Long getIdTva() {
        return idTva;
    }

    public void setIdTva(Long idTva) {
        this.idTva = idTva;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Collection<Service> getServices() {
        return services;
    }

    public void setServices(Collection<Service> services) {
        this.services = services;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    

    @Override
    public String toString() {
        return "TVA{" + "idTva=" + idTva + ", nom=" + nom + ", montant=" + montant + ", services=" + services + '}';
    }

    
    
    

}
