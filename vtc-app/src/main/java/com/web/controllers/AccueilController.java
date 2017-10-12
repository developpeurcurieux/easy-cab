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
    private IClientRepository clientRepository;
    @Autowired
    private ICarteBancaireRepository cbRepository;
    
    
    
    @RequestMapping("")
    public String index() {
        return "accueil";
    }
    
    @RequestMapping(value="/sinscrire", method=RequestMethod.GET)
    public String sinscrire(Model model) {
        model.addAttribute("nouveauClient", new Client());
        return "formInscription";
    }
    
    @RequestMapping(value="/saveClient", method=RequestMethod.POST)
    public String enregistrerClient(Model model, @Valid Client client, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "formInscription";
        }
        
        System.out.println(client.getDateNaissance());
        
        client.setDateInscription(new Date());
        client.setStatut("active");
        
        clientRepository.save(client);
        
        
        model.addAttribute("client", client);
        return "formCB";
    }
    
    @RequestMapping(name="/saveCB", method = RequestMethod.POST)
    public String enregistrerCarteBancaireClient(Model model, @Valid CarteBancaire carteBancaire, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "formCB";
        }
        
        
        //id client
        // id cb ==> save
        // return espace perso
        
        return "redirect:espaceClient";
    }
    
    @RequestMapping(value="/seConnecter", method=RequestMethod.GET)
    public String seConnecter(Model model) {
        model.addAttribute("clientMembre", new Client());
        return "connexionClient";
        
    }
    
    @RequestMapping(value="/espaceClient")
    public String espaceClient(Model model, @Valid Client client, BindingResult bindingResult,
            @RequestParam(name="email") String email ) {
        if(bindingResult.hasErrors()) {
            return "connectionClient";
        }
      
        Client c = clientRepository.findByEmail(email);
       
        model.addAttribute("client", c);
        return "espaceClient";
        
    }
    
    @RequestMapping(value="/seDeconnecter")
    public String seDeconnecter() {
        return "redirect:";
    }
    
}
