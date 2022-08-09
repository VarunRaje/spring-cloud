package com.tangent.hotel.reservationservice;

import java.sql.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationRestController {

    private final ReservationRepository repository;


    public ReservationRestController(ReservationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Reservation> getAllReservations(@RequestParam(name = "date", required = false)Date date) {
        if (date != null) {
            return this.repository.findAllByDate(date);
        }
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Reservation getReservationbyId(@PathVariable("id") long id){
        return this.repository.findById(id).get();
    }
}
