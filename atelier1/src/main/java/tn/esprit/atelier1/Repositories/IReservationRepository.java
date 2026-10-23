package tn.esprit.atelier1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.domain.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long> {
}
