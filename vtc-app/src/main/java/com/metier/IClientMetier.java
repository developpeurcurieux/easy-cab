/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metier;

import com.dao.entities.CarteBancaire;
import com.dao.entities.Client;
import com.dao.entities.Course;
import com.dao.entities.Service;
import java.util.List;



public interface IClientMetier {
    public Client inscrireClient(Client client);
    public Client connecterClient(String email, String mdp);
    public void enregisterCB(Client client, CarteBancaire carteBancaire);
    public Client chercherClient(Long id_client);
   
 
    public Course commander();
    public List<Service> listerLesServices();
        
 
    /*
    public Course annulerCourse();
    public Course noterChauffeur(Course course);
    public List consulterListeCourses();
    public List consulterListeCommandes
    */
}
