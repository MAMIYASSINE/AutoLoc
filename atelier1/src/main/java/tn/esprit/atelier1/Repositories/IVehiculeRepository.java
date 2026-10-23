package tn.esprit.atelier1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.domain.Vehicule;

public interface IVehiculeRepository  extends JpaRepository<Vehicule,Long> {

}
