/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Chauffeur implements Serializable {
    @Id
    @NotEmpty
    private String numeroCarteChauffeur;
    
    @Column(length = 1)
    private String genre;
   
    @NotEmpty
    @Size(min=1, max=100)
    private String nom;
    
    @NotEmpty
    @Size(min=1, max=100)
    private String prenom;
    
    @NotEmpty
    @DateTimeFormat(pattern= "yyyy-MM-dd")
    private Date dateNaissance;
    
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
    
    @OneToMany(mappedBy="chauffeur", cascade = CascadeType.REMOVE)
    private Collection<Voiture> voitures;
    
    @OneToOne(mappedBy="chauffeur", cascade = CascadeType.REMOVE)
    private CompteBancaire compteBancaire;
    
    @OneToMany(mappedBy="chauffeur")
    private Collection<Service> services;
    
    @OneToOne(mappedBy="chauffeur", cascade = CascadeType.REMOVE)
    private Telephone telephone;

    @OneToMany(mappedBy="chauffeur")
    private Collection<Virement> virements;
    
    public Chauffeur() {
        
    }

    public Chauffeur(String numeroCarteChauffeur, String genre, String nom, String prenom, Date dateNaissance, Date dateInscription, String statut, String email) {
        this.numeroCarteChauffeur = numeroCarteChauffeur;
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateInscription = dateInscription;
        this.statut = statut;
        this.email = email;
    }

    public String getNumeroCarteChauffeur() {
        return numeroCarteChauffeur;
    }

    public void setNumeroCarteChauffeur(String numeroCarteChauffeur) {
        this.numeroCarteChauffeur = numeroCarteChauffeur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
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

    public CompteBancaire getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(CompteBancaire compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

    public Collection<Service> getServices() {
        return services;
    }

    public void setServices(Collection<Service> services) {
        this.services = services;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public Collection<Virement> getVirements() {
        return virements;
    }

    public void setVirements(Collection<Virement> virements) {
        this.virements = virements;
    }

  
   
}
