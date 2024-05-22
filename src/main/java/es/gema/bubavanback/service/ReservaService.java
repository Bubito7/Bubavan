package es.gema.bubavanback.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.gema.bubavanback.model.Reserva;
import es.gema.bubavanback.repository.PlazaRepository;
import es.gema.bubavanback.repository.ReservaRepository;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;
    @Autowired
    private PlazaRepository plazaRepository;
 
    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }
 
    public Optional<Reserva> getReservaById(Long id) {
        return reservaRepository.findById(id);
    }
 
    public Reserva createReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
 
    public Optional<Reserva> updateReserva(Long id, Reserva reserva) {
        return reservaRepository.findById(id).map(existingReserva -> {
            existingReserva.setNombre(reserva.getNombre());
            existingReserva.setApellido1(reserva.getApellido1());
            existingReserva.setApellido2(reserva.getApellido2());
            existingReserva.setTelefono(reserva.getTelefono());
            existingReserva.setEmail(reserva.getEmail());
            existingReserva.setMatricula(reserva.getMatricula());
            existingReserva.setFechaReserva(reserva.getFechaReserva());
            existingReserva.setFechaEntrada(reserva.getFechaEntrada());
            existingReserva.setFechaSalida(reserva.getFechaSalida());
            existingReserva.setDni(reserva.getDni());
            existingReserva.setPlaza(plazaRepository.findById(reserva.getPlaza().getId()).orElse(null));
            return reservaRepository.save(existingReserva);
        });
    }
 
    public boolean deleteReserva(Long id) {
        if (reservaRepository.existsById(id)) {
            reservaRepository.deleteById(id);
            return true;
        }
        return false;
    }
 
    public Reserva generarReserva(Reserva reserva) {
        reserva.setFechaReserva(LocalDate.now());
        reserva.setPlaza(plazaRepository.findById(reserva.getPlaza().getId()).orElse(null));
        return reservaRepository.save(reserva);
    }
 
    public boolean cancelarReserva(Long id) {
        return deleteReserva(id);
    }
}