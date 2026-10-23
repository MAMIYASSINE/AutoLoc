package tn.esprit.atelier1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.domain.Agence;

public interface IAgenceRepository extends JpaRepository<Agence, Long> {
}
