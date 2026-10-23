package tn.esprit.atelier1.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.Repositories.IMaintenanceRepository;
import tn.esprit.atelier1.Services.IMaintenanceService;
import tn.esprit.atelier1.domain.Maintenance;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MaintenanceService implements IMaintenanceService {

    private final IMaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance createMaintenance(Maintenance m) {
        return maintenanceRepository.save(m);
    }

    @Override
    public Maintenance getMaintenanceById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {
        return maintenanceRepository.save(m);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }
}
