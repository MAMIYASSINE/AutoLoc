package tn.esprit.atelier1.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.Repositories.IVehiculeRepository;
import tn.esprit.atelier1.Services.IVehiculeService;
import tn.esprit.atelier1.domain.Vehicule;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehiculeService implements IVehiculeService {


    private final IVehiculeRepository vehiculeRepository;
    @Override
    public Vehicule createVehicule(Vehicule v) {
        return vehiculeRepository.save(v);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return vehiculeRepository.save(v);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }


    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }
}
