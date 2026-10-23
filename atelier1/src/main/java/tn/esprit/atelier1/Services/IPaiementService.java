package tn.esprit.atelier1.Services;

import tn.esprit.atelier1.domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement createPaiement(Paiement p);
    Paiement getPaiementById(Long id);
    Paiement updatePaiement(Paiement p);
    void deletePaiement(Long id);
    List<Paiement> getAllPaiements();
}
