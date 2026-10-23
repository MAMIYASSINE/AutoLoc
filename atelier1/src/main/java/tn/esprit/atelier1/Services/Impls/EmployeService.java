package tn.esprit.atelier1.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.Repositories.IEmployeRepository;
import tn.esprit.atelier1.Services.IEmployeService;
import tn.esprit.atelier1.domain.Employe;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeService implements IEmployeService {

    private final IEmployeRepository employeRepository;

    @Override
    public Employe createEmploye(Employe e) {
        return employeRepository.save(e);
    }

    @Override
    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return employeRepository.save(e);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }
}
