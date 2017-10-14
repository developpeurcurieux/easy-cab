/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metier;



public interface IClientMetier {
    public void sinscrire();
    public void commander();
    public void seConnecter();
    public void annulerLigneCommande();
    public void noterChauffeur(String numeroLigneCommande);
    public void consulterListeLigneCommandes();
}
