package com.example.airBook.controller;

import com.example.airBook.entity.Checkin;
import com.example.airBook.entity.Passenger;
import com.example.airBook.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class CheckinRestController {

    @Autowired
    private PassengerService passengerService;


    @PostMapping("/checkin")
    public Passenger checkinFormSubmit(@RequestBody Passenger passenger) {
        Passenger passengerFromDB= passengerService.findById(passenger.getPassengerId());
        Checkin checkinFromDB = passengerFromDB.getCheckIn();
        checkinFromDB.setSeatNumber(passenger.getCheckIn().getSeatNumber());
        checkinFromDB.setGateNumber("Gate3");
        passengerFromDB.setCheckIn(checkinFromDB);
        passengerService.save(passengerFromDB);
        return passengerFromDB;

    }
}
