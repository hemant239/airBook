package com.example.airBook.dao;

import com.example.airBook.entity.BookingRecord;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingDao extends JpaRepository<BookingRecord, Long> {

    @Query( nativeQuery = true,  value = "select * from booking_record br where br.booking_id= 181")
    List<BookingRecord> getBookingRecordsByUserId(long userId);

    @EntityGraph(attributePaths = { "passengers" })
    BookingRecord findByBookingId(long bookingId);
}
