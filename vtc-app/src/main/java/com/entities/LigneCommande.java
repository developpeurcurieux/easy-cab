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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.springframework.format.annotation.DateTimeFormat;



@Entity 
public class LigneCommande implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateCourse;
    
    private double prix;
    
    @ManyToOne
    @JoinColumn(name="FK_Commande")
    private Commande commande;
    
    @ManyToOne
    @JoinColumn(name="FK_Service")
    private Service service;
    
    @OneToMany(mappedBy="ligneCommande")
    private Collection<Statut> status;

    @OneToOne(mappedBy="ligneCommande")
    private Notation notation;
    
    @OneToOne(mappedBy="ligneCommande")
    private Commentaire commentaire;

    public LigneCommande() {
    }

    public LigneCommande(Date dateCourse, double prix, Commande commande, Service service, Collection<Statut> status, Commentaire commentaire) {
        this.dateCourse = dateCourse;
        this.prix = prix;
        this.commande = commande;
        this.service = service;
        this.status = status;
        this.commentaire = commentaire;
    }

    public Date getDateCourse() {
        return dateCourse;
    }

    public void setDateCourse(Date dateCourse) {
        this.dateCourse = dateCourse;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Collection<Statut> getStatus() {
        return status;
    }

    public void setStatus(Collection<Statut> status) {
        this.status = status;
    }

    public Notation getNotation() {
        return notation;
    }

    public void setNotation(Notation notation) {
        this.notation = notation;
    }

    public Commentaire getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(Commentaire commentaire) {
        this.commentaire = commentaire;
    }
    
    
    
}
