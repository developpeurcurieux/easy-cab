/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class CarteBancaire implements Serializable {
    @Id
    private Long numeroCarte;
    private String typeCarte;
    private Long codeCryptographique;
    private String nomTitulaireCB;
    private Date dateExpiration;
   
   
    private Client client;

    public CarteBancaire() {
    }

    public CarteBancaire(Long numeroCarte, String typeCarte, Long codeCryptographique, String nomTitulaireCB, Client client) {
        this.numeroCarte = numeroCarte;
        this.typeCarte = typeCarte;
        this.codeCryptographique = codeCryptographique;
        this.nomTitulaireCB = nomTitulaireCB;
        this.client = client;
    }

    public CarteBancaire(Long numeroCarte, String typeCarte, Long codeCryptographique, String nomTitulaireCB) {
        this.numeroCarte = numeroCarte;
        this.typeCarte = typeCarte;
        this.codeCryptographique = codeCryptographique;
        this.nomTitulaireCB = nomTitulaireCB;
    }

    public Long getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(Long numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getTypeCarte() {
        return typeCarte;
    }

    public void setTypeCarte(String typeCarte) {
        this.typeCarte = typeCarte;
    }

    public Long getCodeCryptographique() {
        return codeCryptographique;
    }

    public void setCodeCryptographique(Long codeCryptographique) {
        this.codeCryptographique = codeCryptographique;
    }

    public String getNomTitulaireCB() {
        return nomTitulaireCB;
    }

    public void setNomTitulaireCB(String nomTitulaireCB) {
        this.nomTitulaireCB = nomTitulaireCB;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
            
    
    
}
