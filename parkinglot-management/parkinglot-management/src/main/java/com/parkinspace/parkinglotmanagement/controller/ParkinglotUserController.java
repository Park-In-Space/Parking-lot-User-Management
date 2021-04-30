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

import com.parkinspace.parkinglotmanagement.data.ParkinglotUser;
import com.parkinspace.parkinglotmanagement.exception.ResourceNotFoundException;
import com.parkinspace.parkinglotmanagement.service.ParkinglotUsersService;

@RestController
@RequestMapping("/api/parkinglotuser")
public class ParkinglotUserController {

    @Autowired
    private ParkinglotUsersService ParkinglotUsersService;

    @GetMapping
    public List<ParkinglotUser> findAll() {
        return ParkinglotUsersService.findAll();
    }

    @GetMapping("/{id}")
    public ParkinglotUser findById(@PathVariable int id) {
        return ParkinglotUsersService.findById(id);
    }

    @PostMapping
    public ParkinglotUser create(@RequestBody ParkinglotUser parkinglotUser) {
        return ParkinglotUsersService.save(parkinglotUser);
    }


    @PutMapping("/{id}")
    public ParkinglotUser update(@PathVariable(value = "id") int id, @RequestBody ParkinglotUser parkinglotuserDetails)
            throws ResourceNotFoundException {
        ParkinglotUser parkinglotuser = ParkinglotUsersService.findById(id);
        if (parkinglotuserDetails.getUserId() != null) {
            parkinglotuser.setUserId(parkinglotuserDetails.getUserId());
        }
        if (parkinglotuserDetails.getUsername() != null) {
            parkinglotuser.setUsername(parkinglotuserDetails.getUsername());
        }
        if (parkinglotuserDetails.getEmail() != null) {
            parkinglotuser.setEmail(parkinglotuserDetails.getEmail());
        }
        if (parkinglotuserDetails.getName() != null) {
            parkinglotuser.setName(parkinglotuserDetails.getName());
        }
        if (parkinglotuserDetails.getPhone() != null) {
            parkinglotuser.setPhone(parkinglotuserDetails.getPhone());
        }
        final ParkinglotUser updatedParkinglotuser = ParkinglotUsersService.save(parkinglotuser);
        return updatedParkinglotuser;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        ParkinglotUsersService.deleteById(id);
    }

}