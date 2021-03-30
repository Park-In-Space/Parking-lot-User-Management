package com.parkinspace.parkinglotmanagement.repository;


import com.parkinspace.parkinglotmanagement.data.ParkinglotUser;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ParkinglotUsersRepository extends JpaRepository<ParkinglotUser, Integer> {}