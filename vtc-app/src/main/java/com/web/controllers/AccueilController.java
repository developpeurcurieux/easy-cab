/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.web.controllers;

import com.dao.entities.Client;
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



@Controller
@RequestMapping("/accueil")
public class AccueilController {
    @Autowired
    private IClientRepository clientRepository;
    
    
    @RequestMapping("/index")
    public String index() {
        return "accueil";
    }
    
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
        
        System.out.println(client.getDateNaissance());
        
        client.setDateInscription(new Date());
        client.setStatut("active");
        
        clientRepository.save(client);
        
        model.addAttribute("client", client);
        return "redirect:index";
    }
    
    @RequestMapping(value="/seConnecter", method=RequestMethod.GET)
    public String seConnecter(Model model) {
        model.addAttribute("client", new Client());
        return "connexionClient";
        
    }
    
    @RequestMapping(value="/espaceClient", method=RequestMethod.POST)
    public String espaceClient(Model model, @Valid Client client, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "connexionClient";
        }
        
        return "";
        
    }
    
}
