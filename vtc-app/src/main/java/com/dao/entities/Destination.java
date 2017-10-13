/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Destination {
    @Id
    @GeneratedValue()
    private Long idDestination;
    
    @NotEmpty
    @Size(min=2, max=100)
    private String ville;
    
    @NotEmpty
    @Size(min=2, max=100)
    private String aeroport;
    
    @NotEmpty
    @Size(min=2, max=100)
    private String gare;
    
    @OneToOne
    @JoinColumn(name="fk_client")
    private Client client;
    
    @OneToOne
    @JoinColumn(name="fk_course")
    private Course course;

    public Destination() {
    }


    public Long getIdDestination() {
        return idDestination;
    }

    public void setIdDestination(Long idDestination) {
        this.idDestination = idDestination;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAeroport() {
        return aeroport;
    }

    public void setAeroport(String aeroport) {
        this.aeroport = aeroport;
    }

    public String getGare() {
        return gare;
    }

    public void setGare(String gare) {
        this.gare = gare;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    
    
    
}
