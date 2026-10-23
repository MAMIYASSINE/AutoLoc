package tn.esprit.atelier1.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.Repositories.IContratRepository;
import tn.esprit.atelier1.Services.IContratService;
import tn.esprit.atelier1.domain.Contrat;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ContratService implements IContratService {

    private final IContratRepository contratRepository;

    @Override
    public Contrat createContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }
}
