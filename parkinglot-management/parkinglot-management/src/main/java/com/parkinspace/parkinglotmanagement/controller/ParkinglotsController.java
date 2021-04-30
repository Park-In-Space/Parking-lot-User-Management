package com.parkinspace.parkinglotmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.parkinspace.parkinglotmanagement.data.Parkinglots;
import com.parkinspace.parkinglotmanagement.exception.ResourceNotFoundException;
import com.parkinspace.parkinglotmanagement.service.ParkinglotsService;

@RestController
@RequestMapping("/api/parkinglots")
public class ParkinglotsController {

    @Autowired
    private ParkinglotsService parkinglotsService;

    @GetMapping
    public List<Parkinglots> findAll() {
        return parkinglotsService.findAll();
    }

    @GetMapping("/{id}")
    public Parkinglots findById(@PathVariable int id) {
        return parkinglotsService.findById(id);
    }

    @PostMapping
    public Parkinglots create(@RequestBody Parkinglots parkinglots) {
        return parkinglotsService.save(parkinglots);
    }

    @PutMapping("/{id}")
    public Parkinglots update(@PathVariable(value = "id") int id, @RequestBody Parkinglots parkinglotDetails)
            throws ResourceNotFoundException {
        Parkinglots parkinglot = parkinglotsService.findById(id);
        if(parkinglotDetails.getParkinglotuser()!= null){
            parkinglot.setParkinglotuser(parkinglotDetails.getParkinglotuser());
        }
        if(parkinglotDetails.getParkingid() != 0){
            parkinglot.setParkingid(parkinglotDetails.getParkingid());
        }
        
        final Parkinglots updatedParkinglot = parkinglotsService.save(parkinglot);
        return updatedParkinglot;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        parkinglotsService.deleteById(id);
    }

}