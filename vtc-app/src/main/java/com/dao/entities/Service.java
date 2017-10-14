/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
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
    
    
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="fk_tva")
    private TVA tva;
    
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="fk_prix")
    private Prix prix;
    
    @OneToMany(mappedBy="service")
    private Collection<Course> courses;
    
    @ManyToOne
    @JoinColumn(name="fk_promotion")
    private Promotion promotion;
    
    @ManyToOne
    @JoinColumn(name="fk_chauffeur")
    private Chauffeur chauffeur;

    public Service() {
    }

    public Service(String nom, Long quantiteVoiture) {
        this.nom = nom;
        this.quantiteVoiture = quantiteVoiture;
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

    public TVA getTva() {
        return tva;
    }

    public void setTva(TVA tva) {
        this.tva = tva;
    }

    public Prix getPrix() {
        return prix;
    }

    public void setPrix(Prix prix) {
        this.prix = prix;
    }

    public Collection<Course> getLigneCommandes() {
        return courses;
    }

    public void setLigneCommandes(Collection<Course> courses) {
        this.courses = courses;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }

    
}
