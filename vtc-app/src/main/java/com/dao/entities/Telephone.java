/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Telephone implements Serializable {
    @Id
    @GeneratedValue()
    private Long idTelephone;
    
    private String telephonePortable;
    private String telephoneVoiture;
    
    @ManyToOne
    @JoinColumn(name="fk_chauffeur")
    private Chauffeur chauffeur;

    public Telephone() {
    }

    public Telephone(String telephonePortable, String telephoneVoiture, Chauffeur chauffeur) {
        this.telephonePortable = telephonePortable;
        this.telephoneVoiture = telephoneVoiture;
        this.chauffeur = chauffeur;
    }

    public Long getIdTelephone() {
        return idTelephone;
    }

    public void setIdTelephone(Long idTelephone) {
        this.idTelephone = idTelephone;
    }

    public String getTelephonePortable() {
        return telephonePortable;
    }

    public void setTelephonePortable(String telephonePortable) {
        this.telephonePortable = telephonePortable;
    }

    public String getTelephoneVoiture() {
        return telephoneVoiture;
    }

    public void setTelephoneVoiture(String telephoneVoiture) {
        this.telephoneVoiture = telephoneVoiture;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }
    
    
}
