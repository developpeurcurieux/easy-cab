/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package com.web.controllers;

import com.dao.entities.Aeroport;
import com.dao.entities.CarteBancaire;
import com.dao.entities.Client;
import com.dao.entities.Course;
import com.dao.entities.Gare;
import com.dao.entities.Service;
import com.dao.entities.Ville;
import com.dao.repository.ICommandeRepository;
import com.dao.repository.ICourseRepository;
import com.metier.ClientMetierImpl;
import com.web.models.beans.Internaute;
import com.web.models.beans.MemoCourse;
import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//TODO ne pas oublier 'active' dans navbar 'accueil'
//TODO http.authorizeRequests().antMatchers("/webjars/**").permitAll();
@Controller
@RequestMapping("/")
public class ClientController {
    @Autowired
    private ICourseRepository courseRepository;
    @Autowired
    private ICommandeRepository commandeRepository;
    
    @Autowired
    private ClientMetierImpl clientMetier;
    
    
    
    @Autowired
    private Internaute internaute;
    @Autowired
    private MemoCourse memoCourse;
   
    
    
    
    @RequestMapping("/accueil")
    public String index() {
        return "accueil";
    }
    
    /***************************************************************************
     * Client 
     */
    
    @RequestMapping(value="/connexionClient", method=RequestMethod.GET)
    public String seConnecter(Model model) {
        model.addAttribute("internaute", new Internaute());
        return "connexionClient";
    }
    
    @RequestMapping(value="/espaceClient")
    public String espaceClient(Model model, @Valid Internaute internaute,
            BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "connexionClient";
        }
        
        Client c = clientMetier.connecterClient(internaute.getEmail(), internaute.getMdp());
     
        if(c != null) {
            model.addAttribute("client", c);
            return "espaceClient";
        }
        else {
            return "connexionClient";
        }
        
    }
   
    @RequestMapping(value="/inscriptionClient", method=RequestMethod.GET)
    public String sinscrire(Model model) {
        model.addAttribute("client", new Client());
        return "formInscription";
    }
    
    @RequestMapping(value="/saveClient", method=RequestMethod.POST)
    public String enregistrerClient(Model model, @Valid Client client, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
            return "formInscription";
        }
        
        
        client.setDateEntree(new Date());
        client.setStatut("active");
        
        clientMetier.inscrireClient(client);
   
      
        System.out.println("-------------- avant cb -----------------");
        System.out.println(client);
        System.out.println("--------------- avant cb ----------------");
        model.addAttribute("carteBancaire", new CarteBancaire());
       
        return "formCB";
    }
    
    @RequestMapping(value="/saveCB", method = RequestMethod.POST)
    public String enregistrerCarteBancaire(Model model, @Valid CarteBancaire carteBancaire, 
            @RequestParam("id")Long id_client, BindingResult bindingResult) {
        System.out.println("apres cb" + clientMetier.chercherClient(id_client));
        
        if(bindingResult.hasErrors()) {
            System.out.println("erreurs: " + bindingResult.getAllErrors());
            return "formCB";
        }
      
//        clientMetier.enregisterCB(client, carteBancaire);
//        model.addAttribute("client", client);
        
        return "espaceClient";
    }
    
    
    @RequestMapping(value="/deconnexionClient")
    public String seDeconnecter() {
        return "redirect:/accueil";
    }
    
    
    
    /***************************************************************************
     * Course 
     */
    
    @RequestMapping("/reservation") 
    public String reserverVtc(Model model ) {
        
        MemoCourse memoCourse = new MemoCourse(); 
        
        memoCourse.setListServices(clientMetier.listerLesServices());
        memoCourse.setListAeroports(clientMetier.listerLesAeroports());
        memoCourse.setListGares(clientMetier.listerLesGares());
        memoCourse.setListVilles(clientMetier.listerLesVilles());
        
        System.out.println(memoCourse.getListVilles());
        model.addAttribute("memoCourse", memoCourse);
               
        
        return "formCommande";
    }
    
    @RequestMapping("/confirmationCommande")
    public String confirmerLaCommande(Model model, MemoCourse memoCourse) {
        System.out.println(memoCourse);
        
        System.out.println(memoCourse);
        Course c = clientMetier.commander();
        
        model.addAttribute("idCourse", c.getIdCourse());
       
        
        return "confirmCommande";
        
    }
    
    
    
    
    
    /***************************************************************************
     *  Tarification
     */
    @RequestMapping(value="/tarification")
    public String afficherLesPrix() {
        return "prixLigneCommandes";
    }
    
}
