package tn.esprit.atelier1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.domain.Contrat;

public interface IContratRepository extends JpaRepository<Contrat, Long> {
}
