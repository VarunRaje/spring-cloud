package com.tangent.hotel.roomreservationservice;

import java.sql.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("reservationservices")
public interface ReservationClient {
    @GetMapping("/reservation")
    List<Reservation> getAllReservations(@RequestParam(name="date", required = false) Date date);

    @GetMapping("/reservation/{id}")
    Reservation getReservation(@PathVariable("id")long id);
}
