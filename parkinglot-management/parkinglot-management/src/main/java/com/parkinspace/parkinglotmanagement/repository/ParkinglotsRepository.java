package com.parkinspace.parkinglotmanagement.repository;

import com.parkinspace.parkinglotmanagement.data.Parkinglots;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkinglotsRepository extends JpaRepository<Parkinglots, Integer> {}