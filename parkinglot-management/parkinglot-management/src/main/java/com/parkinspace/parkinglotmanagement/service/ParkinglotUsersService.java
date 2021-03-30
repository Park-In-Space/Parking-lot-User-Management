package com.parkinspace.parkinglotmanagement.service;

import com.parkinspace.parkinglotmanagement.repository.ParkinglotUsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


import com.parkinspace.parkinglotmanagement.data.ParkinglotUser;
import com.parkinspace.parkinglotmanagement.exception.ResourceNotFoundException;


@Service
public class ParkinglotUsersService {

    @Autowired
    private ParkinglotUsersRepository ParkinglotUsersRepository;

    public List<ParkinglotUser> findAll(){
        return ParkinglotUsersRepository.findAll();
    }

    public ParkinglotUser findById(int id){
        return ParkinglotUsersRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ParkinglotUser", "id", id));
    }

    public ParkinglotUser save(ParkinglotUser parkinglotUser){
        return ParkinglotUsersRepository.save(parkinglotUser);
    }

    public void deleteById(int id){
        ParkinglotUsersRepository.deleteById(id);
    }

}
