/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metier;

import com.dao.entities.Client;



public interface IClientMetier {
    public Client inscrireClient(Client client);
    public Client connecterClient(String email);
   
    /*
    public Course commander();
    public Course annulerCourse();
    public void noterChauffeur(String numeroLigneCommande);
    public List consulterListeCourses();
    public List consulterListeCommandes
    */
}
