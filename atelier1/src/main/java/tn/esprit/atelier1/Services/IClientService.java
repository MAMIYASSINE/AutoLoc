package tn.esprit.atelier1.Services;

import tn.esprit.atelier1.domain.Client;

import java.util.List;

public interface IClientService {
    Client createClient(Client c);
    Client getClientById(Long id);
    Client updateClient(Client c);
    void deleteClient(Long id);
    List<Client> getAllClients();
}
