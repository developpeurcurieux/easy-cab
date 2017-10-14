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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class CarteBancaire implements Serializable {
    @Id
    @NotEmpty
    private Long numeroCarte;
    
    @NotEmpty
    private String typeCarte;
    
    @NotEmpty
    private Long codeCryptographique;
    
    @NotEmpty
    @Size(min=2, max=100)
    private String nomTitulaire;
    
    @NotEmpty
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateExpiration;
   
    @OneToOne
    @JoinColumn(name="fk_client")
    private Client client;

    public CarteBancaire() {
    }

    public CarteBancaire(Long numeroCarte, String typeCarte, Long codeCryptographique, String nomTitulaire, Client client) {
        this.numeroCarte = numeroCarte;
        this.typeCarte = typeCarte;
        this.codeCryptographique = codeCryptographique;
        this.nomTitulaire = nomTitulaire;
        this.client = client;
    }

    public CarteBancaire(Long numeroCarte, String typeCarte, Long codeCryptographique, String nomTitulaire) {
        this.numeroCarte = numeroCarte;
        this.typeCarte = typeCarte;
        this.codeCryptographique = codeCryptographique;
        this.nomTitulaire = nomTitulaire;
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

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
            
    
    
}
