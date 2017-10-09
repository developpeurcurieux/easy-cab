/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metier;

import com.dao.entities.Vehicule;



public interface IChauffeurMetier {
    public void sinscrire();
    public void seConnecter();
    public Vehicule ajouterVehicule();
    public void supprimerVehicule(String idVoiture);
}
