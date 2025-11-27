package br.eti.naju.airports.service;

import br.eti.naju.airports.repositories.AirportRepository;
import br.eti.naju.airports.entities.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;
    
    public List<Airport> findAll(){
        List<Airport> result = airportRepository.findAll();
        return result;
        }
        
    public List<Airport> findByCity(String city) {
        List<Airport> result = airportRepository.findByCityIgnoreCase(city);
        
        return result;

    }
}
