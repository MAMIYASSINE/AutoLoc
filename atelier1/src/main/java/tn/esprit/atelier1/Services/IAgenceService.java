package tn.esprit.atelier1.Services;

import tn.esprit.atelier1.domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence createAgence(Agence a);
    Agence getAgenceById(Long id);
    Agence updateAgence(Agence a);
    void deleteAgence(Long id);
    List<Agence> getAllAgences();
}
