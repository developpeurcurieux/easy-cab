/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package com.web.controllers;

import com.dao.entities.CarteBancaire;
import com.dao.entities.Client;
import com.dao.repository.ICarteBancaireRepository;
import com.dao.repository.IClientRepository;
import com.metier.ClientMetierImpl;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//TODO ne pas oublier 'active' dans navbar 'accueil'

@Controller
@RequestMapping("/accueil")
public class AccueilController {
    @Autowired
    private ClientMetierImpl clientMetier;
   
    
    
    
    @RequestMapping("")
    public String index() {
        return "accueil";
    }
    
    /*************** CLIENT ******************************************/
    
    @RequestMapping(value="/sinscrire", method=RequestMethod.GET)
    public String sinscrire(Model model) {
        model.addAttribute("client", new Client());
        return "formInscription";
    }
    
    @RequestMapping(value="/saveClient", method=RequestMethod.POST)
    public String enregistrerClient(Model model, @Valid Client client, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "formInscription";
        }
        
     
        client.setDateEntree(new Date());
        client.setStatut("active");
        
        clientMetier.inscrireClient(client);
        
        model.addAttribute("idClient", client.getId());
        model.addAttribute("carteBancaire", new CarteBancaire());
        
        return "formCB";
    }
    
    @RequestMapping(name="/saveCB", method = RequestMethod.POST)
    public String enregistrerCarteBancaire(Model model, @Valid CarteBancaire carteBancaire, BindingResult bindingResult,
            @RequestParam("idClient") Long idClient) {
        if(bindingResult.hasErrors()) {
            System.out.println("erreurs: " + bindingResult.getAllErrors());
            return "formCB";
        }
//       
//       try {
//        Client client = clientRepository.findOne(idClient);
//       
//        carteBancaire.setClient(client);
//                
//        client.setCarteBancaire(carteBancaire);
//              
//        clientRepository.save(client);
//        System.out.println("cb :" + carteBancaire.getNumeroCarte());
//        System.out.println("client de la cb: " + carteBancaire.getClient().getNom() );
//       }
//       catch(Exception e) {
//           System.out.println("erreur ==> " + e);
//       }
        return "accueil";

    }
    
    // Connection Client
    
    
    @RequestMapping(value="/seConnecter", method=RequestMethod.GET)
    public String seConnecter(Model model) {
   
        // peutetre ca bloque especeClient
        model.addAttribute("client", new Client());
        return "connexionClient";
        
    }
    
    @RequestMapping(value="/espaceClient")
    public String espaceClient(Model model, @Valid Client client, 
            @RequestParam("email") String email, 
            BindingResult bindingResult) {
           
        if(bindingResult.hasErrors()) {
            return "connexionClient";
        }
      
        
        Client c = clientMetier.connecterClient(email);
        // il faut verifier le mot de passe
        
        model.addAttribute("client", c);
        
        return "espaceClient";
        
    }
    
    @RequestMapping(value="/seDeconnecter")
    public String seDeconnecter() {
        return "redirect:";
    }
    
    /******************* TARIFICATION **********************************/
    @RequestMapping(value="/tarifs")
    public String afficherLesPrix() {
        return "prixLigneCommandes";
    }
    
}
