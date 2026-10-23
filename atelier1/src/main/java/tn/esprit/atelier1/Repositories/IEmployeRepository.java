package tn.esprit.atelier1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.domain.Employe;

public interface IEmployeRepository extends JpaRepository<Employe, Long> {
}
