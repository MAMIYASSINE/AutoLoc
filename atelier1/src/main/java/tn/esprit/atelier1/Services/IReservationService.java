package tn.esprit.atelier1.Services;

import tn.esprit.atelier1.domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation createReservation(Reservation r);
    Reservation getReservationById(Long id);
    Reservation updateReservation(Reservation r);
    void deleteReservation(Long id);
    List<Reservation> getAllReservations();
}
