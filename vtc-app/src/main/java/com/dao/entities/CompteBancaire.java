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
import javax.persistence.OneToOne;


@Entity
public class CompteBancaire implements Serializable {
    @Id
    @GeneratedValue()
    private Long idCompteBancaire;
    
    private String titulaireCompte;
    private String codeBanque;
    private String codeGuichet;
    private Long numeroCompte;
    private String cleRIB;
    private String iban;
    private String bic;
    private String Domiciliation;
    
    @OneToOne
    @JoinColumn(name="fk_chauffeur")
    private Chauffeur chauffeur;

    public CompteBancaire() {
    }

    public CompteBancaire(String titulaireCompte, String codeBanque, String codeGuichet, Long numeroCompte, String cleRIB, String iban, String bic, String Domiciliation, Chauffeur chauffeur) {
        this.titulaireCompte = titulaireCompte;
        this.codeBanque = codeBanque;
        this.codeGuichet = codeGuichet;
        this.numeroCompte = numeroCompte;
        this.cleRIB = cleRIB;
        this.iban = iban;
        this.bic = bic;
        this.Domiciliation = Domiciliation;
        this.chauffeur = chauffeur;
    }

    public Long getIdCompteBancaire() {
        return idCompteBancaire;
    }

    public void setIdCompteBancaire(Long idCompteBancaire) {
        this.idCompteBancaire = idCompteBancaire;
    }

    public String getTitulaireCompte() {
        return titulaireCompte;
    }

    public void setTitulaireCompte(String titulaireCompte) {
        this.titulaireCompte = titulaireCompte;
    }

    public String getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(String codeBanque) {
        this.codeBanque = codeBanque;
    }

    public String getCodeGuichet() {
        return codeGuichet;
    }

    public void setCodeGuichet(String codeGuichet) {
        this.codeGuichet = codeGuichet;
    }

    public Long getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(Long numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getCleRIB() {
        return cleRIB;
    }

    public void setCleRIB(String cleRIB) {
        this.cleRIB = cleRIB;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getDomiciliation() {
        return Domiciliation;
    }

    public void setDomiciliation(String Domiciliation) {
        this.Domiciliation = Domiciliation;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }
    
    
    
    
}
