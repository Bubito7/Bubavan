package es.gema.bubavanback.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.gema.bubavanback.model.Plaza;
import es.gema.bubavanback.repository.PlazaRepository;

@Service
public class PlazaService {
    @Autowired
    private PlazaRepository plazaRepository;
 
    public List<Plaza> getAllPlazas() {
        return plazaRepository.findAll();
    }
 
    public Optional<Plaza> getPlazaById(Long id) {
        return plazaRepository.findById(id);
    }
 
    public Plaza createPlaza(Plaza plaza) {
        return plazaRepository.save(plaza);
    }
 
    public Optional<Plaza> updatePlaza(Long id, Plaza plaza) {
        return plazaRepository.findById(id).map(existingPlaza -> {
            existingPlaza.setTipo(plaza.getTipo());
            existingPlaza.setDisponible(plaza.getDisponible());
            existingPlaza.setConLuz(plaza.getConLuz());
            return plazaRepository.save(existingPlaza);
        });
    }
 
    public boolean deletePlaza(Long id) {
        if (plazaRepository.existsById(id)) {
            plazaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}