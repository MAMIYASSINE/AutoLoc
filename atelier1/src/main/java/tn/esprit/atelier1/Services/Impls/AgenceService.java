package tn.esprit.atelier1.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.Repositories.IAgenceRepository;
import tn.esprit.atelier1.Services.IAgenceService;
import tn.esprit.atelier1.domain.Agence;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AgenceService implements IAgenceService {

    private final IAgenceRepository agenceRepository;

    @Override
    public Agence createAgence(Agence a) {
        return agenceRepository.save(a);
    }

    @Override
    public Agence getAgenceById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return agenceRepository.save(a);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }
}
