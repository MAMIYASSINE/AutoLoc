package tn.esprit.atelier1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.domain.Equipement;

public interface IEquipementRepository extends JpaRepository<Equipement, Long> {
}
