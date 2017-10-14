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
public class Notation implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idNotation;
    
    private double note;
    private String commentaire;
    
    @OneToOne
    @JoinColumn(name="fk_course")
    private Course course;

    public Notation() {
    }

    public Notation(double note, String commentaire, Course course) {
        this.note = note;
        this.commentaire = commentaire;
        this.course = course;
    }

    public Long getIdNotation() {
        return idNotation;
    }

    public void setIdNotation(Long idNotation) {
        this.idNotation = idNotation;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Course getcourse() {
        return course;
    }

    public void setcourse(Course course) {
        this.course = course;
    }
    
    

}
