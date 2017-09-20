/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Chauffeur implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idChauffeur;
    
    @NotEmpty
    @Size(min=1, max=100)
    private String nom;
    
    @NotEmpty
    @Size(min=1, max=100)
    private String prenom;
    
    @NotEmpty
    private String numeroCarteChauffeur;
    
    @NotEmpty
    private String telephone;
    
    private String nomPhoto;
    private Byte[] photo;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateInscription;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateSortie;
    
    private String statut;
    
    @NotEmpty
    @Email
    private String email;
    
    @OneToMany(mappedBy="chauffeur")
    private Collection<Adresse> adresses;
    
    @OneToMany(mappedBy="chauffeur")
    private Collection<Voiture> voitures;

    public Chauffeur() {
        
    }

    public Chauffeur(String nom, String prenom, String numeroCarteChauffeur, String telephone, Byte[] photo, Date dateInscription, String statut, String email, Collection<Adresse> adresses, Collection<Voiture> voitures) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroCarteChauffeur = numeroCarteChauffeur;
        this.telephone = telephone;
        this.photo = photo;
        this.dateInscription = dateInscription;
        this.statut = statut;
        this.email = email;
        this.adresses = adresses;
        this.voitures = voitures;
    }

    public Long getIdChauffeur() {
        return idChauffeur;
    }

    public void setIdChauffeur(Long idChauffeur) {
        this.idChauffeur = idChauffeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroCarteChauffeur() {
        return numeroCarteChauffeur;
    }

    public void setNumeroCarteChauffeur(String numeroCarteChauffeur) {
        this.numeroCarteChauffeur = numeroCarteChauffeur;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    public Byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(Byte[] photo) {
        this.photo = photo;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(Collection<Adresse> adresses) {
        this.adresses = adresses;
    }

    public Collection<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(Collection<Voiture> voitures) {
        this.voitures = voitures;
    }
    
    
}
