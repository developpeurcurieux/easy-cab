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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idService;
    
    @NotEmpty
    @Size(min=4, max=50)
    private String nom;
    
    private Long quantiteVoiture;
    private double prixService;
    
    @ManyToOne
    @JoinColumn(name="FK_TVA")
    private TVA tva;
    
    @OneToMany(mappedBy="service")
    private Collection<Course> courses;
    
    @ManyToOne
    @JoinColumn(name="FK_promotion")
    private Promotion promotion;
    
    @ManyToMany
    @JoinTable(name="Service_Voiture")
    private Collection<Voiture> voitures;

    public Service() {
    }

    public Service(String nom, Long quantiteVoiture, double prixService, TVA tva, Collection<Voiture> voitures) {
        this.nom = nom;
        this.quantiteVoiture = quantiteVoiture;
        this.prixService = prixService;
        this.tva = tva;
        this.voitures = voitures;
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getQuantiteVoiture() {
        return quantiteVoiture;
    }

    public void setQuantiteVoiture(Long quantiteVoiture) {
        this.quantiteVoiture = quantiteVoiture;
    }

    public double getPrixService() {
        return prixService;
    }

    public void setPrixService(double prixService) {
        this.prixService = prixService;
    }

    public TVA getTva() {
        return tva;
    }

    public void setTva(TVA tva) {
        this.tva = tva;
    }

    public Collection<Course> getcourses() {
        return courses;
    }

    public void setcourses(Collection<Course> courses) {
        this.courses = courses;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public Collection<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(Collection<Voiture> voitures) {
        this.voitures = voitures;
    }
    
    
    
    
}
