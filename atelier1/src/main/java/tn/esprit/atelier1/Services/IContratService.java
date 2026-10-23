package tn.esprit.atelier1.Services;

import tn.esprit.atelier1.domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat createContrat(Contrat c);
    Contrat getContratById(Long id);
    Contrat updateContrat(Contrat c);
    void deleteContrat(Long id);
    List<Contrat> getAllContrats();
}
