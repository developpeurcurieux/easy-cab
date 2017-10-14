/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.validator.constraints.NotEmpty;




@Entity 
public class Statut implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idStatut;
    
    @NotEmpty
    private String libelle;
    
    @ManyToOne
    @JoinColumn(name="fk_course")
    private Course course;

    public Statut() {
    }

    public Statut(String libelle, Course course) {
        this.libelle = libelle;
        this.course = course;
    }

    public Long getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(Long idStatut) {
        this.idStatut = idStatut;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Course getcourse() {
        return course;
    }

    public void setcourse(Course course) {
        this.course = course;
    }
    
    
}
