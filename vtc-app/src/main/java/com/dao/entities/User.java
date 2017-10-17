/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PROFIL")
public class User implements Serializable {
    @Id
    @GeneratedValue()
    private Long id;
    
    @NotNull
    @Column(length=1)
    private String genre;
    
    @NotNull
    @Size(min=2, max=100)
    private String nom;
    
    @NotNull
    @Size(min=2, max=100)
    private String prenom;
    
    @NotNull
    @Size(min=4, max=255)
    private String mdp;
    
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEntree;
    
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateArret;

    private String telephone;
    
    private String statut;
    
    public User() {
    }

    public User(String genre, String nom, String prenom, String mdp, Date dateEntree, String telephone, String statut) {
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.dateEntree = dateEntree;
        this.telephone = telephone;
        this.statut = statut;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Date getDateArret() {
        return dateArret;
    }

    public void setDateArret(Date dateArret) {
        this.dateArret = dateArret;
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
    
    
    
}
