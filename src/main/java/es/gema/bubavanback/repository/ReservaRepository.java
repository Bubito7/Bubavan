package es.gema.bubavanback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.gema.bubavanback.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
