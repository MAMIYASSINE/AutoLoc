package tn.esprit.atelier1.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.Repositories.IPaiementRepository;
import tn.esprit.atelier1.Services.IPaiementService;
import tn.esprit.atelier1.domain.Paiement;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaiementService implements IPaiementService {

    private final IPaiementRepository paiementRepository;

    @Override
    public Paiement createPaiement(Paiement p) {
        return paiementRepository.save(p);
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public Paiement updatePaiement(Paiement p) {
        return paiementRepository.save(p);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }
}
