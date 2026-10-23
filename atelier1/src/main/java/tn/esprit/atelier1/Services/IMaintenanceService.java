package tn.esprit.atelier1.Services;

import tn.esprit.atelier1.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance createMaintenance(Maintenance m);
    Maintenance getMaintenanceById(Long id);
    Maintenance updateMaintenance(Maintenance m);
    void deleteMaintenance(Long id);
    List<Maintenance> getAllMaintenances();
}
