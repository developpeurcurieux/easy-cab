/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity 
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCourse;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCourse;
    
    private double prix;
    
    @ManyToOne
    @JoinColumn(name="fk_commande")
    private Commande commande;
    
    @ManyToOne
    @JoinColumn(name="fk_service")
    private Service service;
    
    @OneToOne(mappedBy="course", cascade=CascadeType.REMOVE)
    private Statut statut;

    @OneToOne(mappedBy="course", cascade=CascadeType.DETACH)
    private Notation notation;
    
    @OneToOne
    @JoinColumn(name="fk_destination")
    private Destination destination;

    @OneToOne(mappedBy="course")
    private Virement virement;
    
    
    
    public Course() {
    }

    public Course(Date dateCourse, double prix, Commande commande, Service service, Statut statut, Destination destination) {
        this.dateCourse = dateCourse;
        this.prix = prix;
        this.commande = commande;
        this.service = service;
        this.statut = statut;
        this.destination = destination;
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

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Notation getNotation() {
        return notation;
    }

    public void setNotation(Notation notation) {
        this.notation = notation;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Virement getVirement() {
        return virement;
    }

    public void setVirement(Virement virement) {
        this.virement = virement;
    }

    
}
