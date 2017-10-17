package com.metier;

import com.dao.entities.CarteBancaire;
import com.dao.entities.Client;
import com.dao.repository.ICarteBancaireRepository;
import com.dao.repository.IClientRepository;
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
        }        
    }
    
    

    
}
