package com.example.airBook.dao;

import com.example.airBook.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PassengerDao extends JpaRepository<Passenger, Long> {
}
