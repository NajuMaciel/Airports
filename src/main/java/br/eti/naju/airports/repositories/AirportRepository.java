package br.eti.naju.airports.repositories;

import br.eti.naju.airports.entities.Airport;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DIT2A
 */
public interface AirportRepository extends JpaRepository<Airport, Long>{
    
    List<Airport> findByCityIgnoreCase(String city);
    List<Airport> findByCountryIgnoreCase(String country);
}
