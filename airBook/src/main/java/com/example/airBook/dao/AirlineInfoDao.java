package com.example.airBook.dao;

import com.example.airBook.entity.AirlineInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AirlineInfoDao extends JpaRepository<AirlineInfo, Long> {

    AirlineInfo findByNameOfAirline(String name);
}
