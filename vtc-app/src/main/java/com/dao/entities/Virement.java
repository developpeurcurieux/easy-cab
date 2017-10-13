/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Virement {
    @Id
    @GeneratedValue()
    private Long idVirement;
    
    @NotEmpty
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVirement;
    
    @NotEmpty
    private Double montant;

    
    
    
    public Virement() {
    }
    
    
}
