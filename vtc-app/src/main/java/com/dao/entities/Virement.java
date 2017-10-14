/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Virement implements Serializable {
    @Id
    @GeneratedValue()
    private Long idVirement;
    
    @NotEmpty
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVirement;
    
    @NotEmpty
    private Double montant;

    @OneToOne
    @JoinColumn(name="fk_course")
    private Course course;
    
    @ManyToOne
    @JoinColumn(name="fk_chauffeur")
    private Chauffeur chauffeur;
    
    
    public Virement() {
    }

    public Virement(Date dateVirement, Double montant, Course course, Chauffeur chauffeur) {
        this.dateVirement = dateVirement;
        this.montant = montant;
        this.course = course;
        this.chauffeur = chauffeur;
    }

    public Long getIdVirement() {
        return idVirement;
    }

    public void setIdVirement(Long idVirement) {
        this.idVirement = idVirement;
    }

    public Date getDateVirement() {
        return dateVirement;
    }

    public void setDateVirement(Date dateVirement) {
        this.dateVirement = dateVirement;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Course getLigneCommande() {
        return course;
    }

    public void setLigneCommande(Course course) {
        this.course = course;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }
    
    
}
