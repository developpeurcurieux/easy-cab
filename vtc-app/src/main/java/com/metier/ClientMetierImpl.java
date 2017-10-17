package com.metier;

import com.dao.entities.Client;
import com.dao.repository.IClientRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientMetierImpl implements IClientMetier {
    @Autowired
    IClientRepository clientRepository;
    
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
    public Client connecterClient(String email) {
        if(email != null || !email.isEmpty()) {
            Client c = clientRepository.findByEmail(email);
            return c;
        }
        else {
            throw new RuntimeException("client introuvable ");
        }
    }

    
}
