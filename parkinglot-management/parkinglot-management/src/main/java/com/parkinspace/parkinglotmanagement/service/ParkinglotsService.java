package com.parkinspace.parkinglotmanagement.service;

import java.util.List;

import com.parkinspace.parkinglotmanagement.data.Parkinglots;
import com.parkinspace.parkinglotmanagement.exception.ResourceNotFoundException;
import com.parkinspace.parkinglotmanagement.repository.ParkinglotsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ParkinglotsService {

    @Autowired
    private ParkinglotsRepository ParkinglotsRepository;

    public List<Parkinglots> findAll(){
        return ParkinglotsRepository.findAll();
    }

    public Parkinglots findById(int id){
        return ParkinglotsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ParkinglotUser", "id", id));
    }

    public Parkinglots save(Parkinglots parkinglots){
        return ParkinglotsRepository.save(parkinglots);
    }

    public void deleteById(int id){
        ParkinglotsRepository.deleteById(id);
    }

}
