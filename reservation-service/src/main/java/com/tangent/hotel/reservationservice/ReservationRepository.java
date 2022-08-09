package com.tangent.hotel.reservationservice;

import java.sql.Date;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findAllByDate(Date date);
}
