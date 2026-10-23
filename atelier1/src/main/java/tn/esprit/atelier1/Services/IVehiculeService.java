package tn.esprit.atelier1.Services;

import tn.esprit.atelier1.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule v);
    Vehicule getVehiculeById(Long id);
    Vehicule updateVehicule(Vehicule v);
    void deleteVehicule(Long id);
    List<Vehicule> getAllVehicules();
}
