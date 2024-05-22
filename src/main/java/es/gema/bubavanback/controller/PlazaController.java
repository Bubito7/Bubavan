package es.gema.bubavanback.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import es.gema.bubavanback.model.Plaza;
import es.gema.bubavanback.service.PlazaService;

@RestController
@RequestMapping("/api/plazas")
public class PlazaController {
    @Autowired
    private PlazaService plazaService;
 
    @GetMapping
    public List<Plaza> getAllPlazas() {
        return plazaService.getAllPlazas();
    }
 
    @GetMapping("/{id}")
    public Optional<Plaza> getPlazaById(@PathVariable Long id) {
        return plazaService.getPlazaById(id);
    }
 
    @PostMapping
    public Plaza createPlaza(@RequestBody Plaza plaza) {
        return plazaService.createPlaza(plaza);
    }
 
    @PutMapping("/{id}")
    public Optional<Plaza> updatePlaza(@PathVariable Long id, @RequestBody Plaza plaza) {
        return plazaService.updatePlaza(id, plaza);
    }
 
    @DeleteMapping("/{id}")
    public boolean deletePlaza(@PathVariable Long id) {
        return plazaService.deletePlaza(id);
    }
}