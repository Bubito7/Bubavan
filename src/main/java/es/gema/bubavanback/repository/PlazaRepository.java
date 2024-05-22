package es.gema.bubavanback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.gema.bubavanback.model.Plaza;

@Repository
public interface PlazaRepository extends JpaRepository<Plaza, Long> {

}
