package tn.esprit.atelier1.Services;

import tn.esprit.atelier1.domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement createEquipement(Equipement e);
    Equipement getEquipementById(Long id);
    Equipement updateEquipement(Equipement e);
    void deleteEquipement(Long id);
    List<Equipement> getAllEquipements();
}
