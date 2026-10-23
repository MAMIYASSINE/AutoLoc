package tn.esprit.atelier1.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.Repositories.IClientRepository;
import tn.esprit.atelier1.Services.IClientService;
import tn.esprit.atelier1.domain.Client;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientService implements IClientService {

    private final IClientRepository clientRepository;

    @Override
    public Client createClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
