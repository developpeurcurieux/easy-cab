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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idClient;
    
    @Column(length = 1)
    private String genre;
    
    @NotEmpty
    @Size(min=2, max=100)
    private String nom;
    
    @NotEmpty
    @Size(min=2, max=100)
    private String prenom;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateInscription;
    private String telephone;
    private String statut;
    
    
    
    @NotEmpty
    @Email
    private String email;
    
    @NotEmpty
    private String mdp;
    
    @OneToMany(mappedBy="client", cascade=CascadeType.DETACH)
    private Collection<Adresse> adresses;
    
    @OneToMany(mappedBy="client")
    private Collection<Commande> commandes;

    @OneToOne(cascade=CascadeType.REMOVE) 
    private CarteBancaire carteBancaire;
    
    
    public Client() {
    }

    public Client(String genre, String nom, String prenom, Date dateNaissance, String telephone, String statut, String email, String mdp) {
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.telephone = telephone;
        this.statut = statut;
        this.email = email;
        this.mdp = mdp;
    }

    public Long getIdClient() {
        return idClient;
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

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Collection<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(Collection<Adresse> adresses) {
        this.adresses = adresses;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    public CarteBancaire getCarteBancaire() {
        return carteBancaire;
    }

    public void setCarteBancaire(CarteBancaire carteBancaire) {
        this.carteBancaire = carteBancaire;
    }

    
    
}
