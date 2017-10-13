/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
@DiscriminatorValue("CLIENT")
public class Client extends User {
     
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateInscription;
    private String telephone;
    private String statut;
     
    @NotEmpty
    @Email
    private String email;
    
    @OneToMany(mappedBy="client", cascade=CascadeType.DETACH)
    private Collection<Adresse> adresses;
    
    @OneToMany(mappedBy="client")
    private Collection<Commande> commandes;

    @OneToOne(cascade=CascadeType.REMOVE) 
    private CarteBancaire carteBancaire;
    
    @OneToOne(mappedBy="client")
    private Destination destination;
    
    public Client() {
    }

    public Client(Date dateNaissance, Date dateInscription, String telephone, String statut, String email, String genre, String nom, String prenom, String mdp, Date dateEntree) {
        super(genre, nom, prenom, mdp, dateEntree);
        this.dateNaissance = dateNaissance;
        this.dateInscription = dateInscription;
        this.telephone = telephone;
        this.statut = statut;
        this.email = email;
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
