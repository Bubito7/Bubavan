package es.gema.bubavanback.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import es.gema.bubavanback.model.Reserva;
import es.gema.bubavanback.service.ReservaService;
@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;
 
    @GetMapping
    public List<Reserva> getAllReservas() {
        return reservaService.getAllReservas();
    }
 
    @GetMapping("/{id}")
    public Optional<Reserva> getReservaById(@PathVariable Long id) {
        return reservaService.getReservaById(id);
    }
 
    @PostMapping
    public Reserva createReserva(@RequestBody Reserva reserva) {
        return reservaService.createReserva(reserva);
    }
 
    @PutMapping("/{id}")
    public Optional<Reserva> updateReserva(@PathVariable Long id, @RequestBody Reserva reserva) {
        return reservaService.updateReserva(id, reserva);
    }
 
    @DeleteMapping("/{id}")
    public boolean deleteReserva(@PathVariable Long id) {
        return reservaService.deleteReserva(id);
    }
 
    @PostMapping("/generar")
    public Reserva generarReserva(@RequestBody Reserva reserva) {
        return reservaService.generarReserva(reserva);
    }
 
    @DeleteMapping("/cancelar/{id}")
    public boolean cancelarReserva(@PathVariable Long id) {
        return reservaService.cancelarReserva(id);
    }
}