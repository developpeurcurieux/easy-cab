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
import javax.persistence.OneToOne;



@Entity
public class Commentaire implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCommentaire;
    
    private String champLibre;
    
    @OneToOne
    @JoinColumn(name="FK_course")
    private Course course;

    public Commentaire() {
    }

    public Commentaire(String champLibre, Course course) {
        this.champLibre = champLibre;
        this.course = course;
    }

    public Long getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Long idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public String getChampLibre() {
        return champLibre;
    }

    public void setChampLibre(String champLibre) {
        this.champLibre = champLibre;
    }

    public Course getcourse() {
        return course;
    }

    public void setcourse(Course course) {
        this.course = course;
    }
    
    

}
