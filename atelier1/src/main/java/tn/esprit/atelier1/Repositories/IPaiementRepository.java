package tn.esprit.atelier1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.domain.Paiement;

public interface IPaiementRepository extends JpaRepository<Paiement, Long> {
}
