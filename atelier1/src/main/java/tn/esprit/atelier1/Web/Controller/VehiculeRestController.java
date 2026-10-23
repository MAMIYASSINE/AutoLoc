package tn.esprit.atelier1.Web.Controller;


import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import tn.esprit.atelier1.Services.Impls.VehiculeService;
import tn.esprit.atelier1.domain.Vehicule;

@RequiredArgsConstructor
@RestController
@RequestMapping ("vehicules")
public class VehiculeRestController {
    private final VehiculeService vehiculeService;

    @PostMapping 
    public void createVehicule(@RequestBody Vehicule v) {
        vehiculeService.createVehicule(v);
    }
    @GetMapping("/{id}")
    public Vehicule getVehicule(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }
}
