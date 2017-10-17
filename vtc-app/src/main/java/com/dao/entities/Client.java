/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.validator.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@DiscriminatorValue("CLIENT")
public class Client extends User {
     
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance;
    
    @NotEmpty
    private String email;
    
    @OneToMany(mappedBy="client", cascade=CascadeType.DETACH)
    private Collection<Adresse> adresses;
    
    @OneToMany(mappedBy="client")
    private Collection<Commande> commandes;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private CarteBancaire carteBancaire;
    
    
    @OneToOne(mappedBy="client")
    private Destination destination;
    
    public Client() {
    }

    public Client(Date dateNaissance, String email, String genre, String nom, String prenom, String mdp, Date dateEntree, String telephone, String statut) {
        super(genre, nom, prenom, mdp, dateEntree, telephone, statut);
        this.dateNaissance = dateNaissance;
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
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

   

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Client{" + "dateNaissance=" + dateNaissance + ", email=" + email + ", adresses=" + adresses + ", commandes=" + commandes + ", carteBancaire=" + carteBancaire + ", destination=" + destination + '}';
    }

   
    
}
