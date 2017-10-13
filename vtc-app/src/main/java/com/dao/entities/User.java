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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERSONNE")
public class User implements Serializable {
    @Id
    @GeneratedValue()
    private Long id;
    
    @NotEmpty
    @Column(length=1)
    private String genre;
    
    @NotEmpty
    @Size(min=2, max=100)
    private String nom;
    
    @NotEmpty
    @Size(min=2, max=100)
    private String prenom;
    
    @NotEmpty
    @Size(min=4, max=255)
    private String mdp;
    
    @NotEmpty
    @Temporal(TemporalType.DATE)
    private Date dateEntree;
    
    
    @Temporal(TemporalType.DATE)
    private Date dateArret;

    public User() {
    }

    public User(String genre, String nom, String prenom, String mdp, Date dateEntree) {
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.dateEntree = dateEntree;
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
    
    
    
}
