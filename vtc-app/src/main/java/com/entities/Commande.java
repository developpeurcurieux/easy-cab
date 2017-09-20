/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCommande;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateCommande;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateReservation;
    
    @NotEmpty
    private String modePaiement;
    
    private String remise;
    
    @ManyToOne
    @JoinColumn(name="FK_Client")
    private Client client;
    
    @OneToOne(mappedBy="commande")
    private Facture facture;
    
    @OneToMany(mappedBy="commande")
    private Collection<LigneCommande> ligneCommandes;

    public Commande() {
    }

    public Commande(Date dateCommande, Date dateReservation, String modePaiement, String remise, Client client, Collection<LigneCommande> ligneCommandes) {
        this.dateCommande = dateCommande;
        this.dateReservation = dateReservation;
        this.modePaiement = modePaiement;
        this.remise = remise;
        this.client = client;
        this.ligneCommandes = ligneCommandes;
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public String getRemise() {
        return remise;
    }

    public void setRemise(String remise) {
        this.remise = remise;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }
            
            
    
}
