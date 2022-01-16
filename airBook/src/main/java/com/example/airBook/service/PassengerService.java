package com.example.airBook.service;

import com.example.airBook.dao.PassengerDao;
import com.example.airBook.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerDao passengerDao;

    public List<Passenger> getAllPassengers() {
        return passengerDao.findAll();
    }


    public Passenger findById(Long id) {
        return passengerDao.findById(id).get();
    }

    public void saveAll(List<Passenger> passengers) {
        passengerDao.saveAll(passengers);
    }

    public void save(Passenger passenger) {
        passengerDao.save(passenger);
    }
}
