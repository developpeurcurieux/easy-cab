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
public class Adresse implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idAdresse;
    
    @NotEmpty
    private String numero;
    
    @NotEmpty
    private String voie;
    
    private String complement;
    
    @NotEmpty
    private String codePostal;
    
    @NotEmpty
    private String ville;
    
    @NotEmpty
    private String pays;
    
    private String statut;
    
    @ManyToOne
    @JoinColumn(name="FK_Client")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name="FK_Chauffeur")
    private Chauffeur chauffeur;

    public Adresse() {
    }

    public Adresse(String numero, String voie, String complement, String codePostal, String ville, String pays, String statut, Client client) {
        this.numero = numero;
        this.voie = voie;
        this.complement = complement;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
        this.statut = statut;
        this.client = client;
    }

    public Adresse(String numero, String voie, String complement, String codePostal, String ville, String pays, Chauffeur chauffeur) {
        this.numero = numero;
        this.voie = voie;
        this.complement = complement;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
        this.chauffeur = chauffeur;
    }

    public Long getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(Long idAdresse) {
        this.idAdresse = idAdresse;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }
    
    
}
