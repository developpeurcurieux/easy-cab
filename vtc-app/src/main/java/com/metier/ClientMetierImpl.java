package com.metier;

import com.dao.entities.Aeroport;
import com.dao.entities.CarteBancaire;
import com.dao.entities.Client;
import com.dao.entities.Course;
import com.dao.entities.Gare;
import com.dao.entities.Ville;
import com.dao.repository.IAeroportRepository;
import com.dao.repository.ICarteBancaireRepository;
import com.dao.repository.IClientRepository;
import com.dao.repository.IGareRepository;
import com.dao.repository.IServiceRepository;
import com.dao.repository.IVilleRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientMetierImpl implements IClientMetier {
    @Autowired
    IClientRepository clientRepository;
    
    @Autowired
    ICarteBancaireRepository carteBancaireRepository;
    @Autowired
    IServiceRepository serviceRepository;
    @Autowired
    IAeroportRepository aeroportRepository;
    @Autowired
    IGareRepository gareRepository;
    @Autowired
    IVilleRepository villeRepository;
    
    
    @Override
    public Client inscrireClient(Client client) {
        if(client != null) {
            clientRepository.save(client);
            return client;
        }
        else {
           throw new RuntimeException("client invalide ");
        }
    }

    @Override
    public Client connecterClient(String email, String mdp) {
        if(email != null || !email.isEmpty()) {
            Client c = clientRepository.findByEmail(email);
            
            if(c.getMdp().equals(mdp)){
                return c;
            }
            else {
                throw new RuntimeException("mot de passe invalide");
            }
        }
        else {
            throw new RuntimeException("client introuvable ");
        }
    }

    @Override
    public void enregisterCB(Client client, CarteBancaire carteBancaire) {
        if(client != null) {
            if(carteBancaire != null) {
                carteBancaire.setClient(client);
                carteBancaireRepository.save(carteBancaire);
            }
            else {
                throw new RuntimeException("carte bancaire invalide");
            }
        }
        else {
            throw new RuntimeException("client invalide ou null");
        }
        
    }

    @Override
    public Client chercherClient(Long id_client) {
           Client c = clientRepository.findOne(id_client);
           if(c == null) {
               throw new RuntimeException("client introuvable");
           }
           else {
               return c;
           }
    }

    @Override
    public Course commander() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public List listerLesServices() {
        return serviceRepository.findAll();
        
    }

    @Override
    public List<Aeroport> listerLesAeroports() {
        return aeroportRepository.findAll();
    }

    @Override
    public List<Gare> listerLesGares() {
        return gareRepository.findAll();
    }

    @Override
    public List<Ville> listerLesVilles() {
        return villeRepository.findAll();
    }
    
    
    
    
    
    
    
    
    
    
    

    
}
