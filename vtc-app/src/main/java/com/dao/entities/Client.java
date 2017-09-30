/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

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
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idClient;
    
    @NotEmpty
    @Size(min=4, max=100)
    private String nom;
    
    @NotEmpty
    @Size(min=4, max=100)
    private String prenom;
    
    @NotEmpty
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateNaissance;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateInscription;
    private String telephone;
    private String statut;
    
    @Size(min=1, max=1)
    private String genre;
    
    @NotEmpty
    @Email
    private String email;
    
    @OneToMany(mappedBy="client")
    private Collection<Adresse> adresses;
    
    @OneToMany(mappedBy="client")
    private Collection<Commande> commandes;

    public Client() {
    }

    public Client(String nom, String prenom, Date dateNaissance, Date dateInscription, String telephone, String statut, String genre, String email, Collection<Adresse> adresses) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateInscription = dateInscription;
        this.telephone = telephone;
        this.statut = statut;
        this.genre = genre;
        this.email = email;
        this.adresses = adresses;
    }

   

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
    
    
    

}
