package br.eti.naju.airports.controllers;

import br.eti.naju.airports.entities.Airport;
import br.eti.naju.airports.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirportController {
    @Autowired
    private AirportService airportService;
    
    @GetMapping("/airport")
    public List<Airport> findAll(){
        List<Airport> result = airportService.findAll();
        return result;
    }
}
