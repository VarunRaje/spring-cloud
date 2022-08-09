package com.tangent.hotel.roomreservationservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("roomservices")
public interface RoomClient {
    @GetMapping("/room")
    List<Room> getAllRooms();
    @GetMapping("/room/{id}")
    Room getRoom(@PathVariable("id")long id);

}
