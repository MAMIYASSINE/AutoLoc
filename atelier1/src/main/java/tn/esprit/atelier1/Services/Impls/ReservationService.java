package tn.esprit.atelier1.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.Repositories.IReservationRepository;
import tn.esprit.atelier1.Services.IReservationService;
import tn.esprit.atelier1.domain.Reservation;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationService implements IReservationService {

    private final IReservationRepository reservationRepository;

    @Override
    public Reservation createReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
