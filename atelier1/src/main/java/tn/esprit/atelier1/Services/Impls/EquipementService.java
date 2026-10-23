package tn.esprit.atelier1.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.Repositories.IEquipementRepository;
import tn.esprit.atelier1.Services.IEquipementService;
import tn.esprit.atelier1.domain.Equipement;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EquipementService implements IEquipementService {

    private final IEquipementRepository equipementRepository;

    @Override
    public Equipement createEquipement(Equipement e) {
        return equipementRepository.save(e);
    }

    @Override
    public Equipement getEquipementById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public Equipement updateEquipement(Equipement e) {
        return equipementRepository.save(e);
    }

    @Override
    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }
}
