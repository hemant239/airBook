package com.example.airBook.service;

import com.example.airBook.dao.AirlineInfoDao;
import com.example.airBook.entity.AirlineInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AirlineInfoService {

    @Autowired
    private AirlineInfoDao airlineInfoDao;


    public AirlineInfo findByNameOfAirline(String name) {
        return airlineInfoDao.findByNameOfAirline(name);
    }

}
