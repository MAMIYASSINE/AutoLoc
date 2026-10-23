package tn.esprit.atelier1.Services;

import tn.esprit.atelier1.domain.Employe;

import java.util.List;

public interface IEmployeService {
    Employe createEmploye(Employe e);
    Employe getEmployeById(Long id);
    Employe updateEmploye(Employe e);
    void deleteEmploye(Long id);
    List<Employe> getAllEmployes();
}
