package com.tangent.hotel.roomservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomRestController {
    private final RoomRepository roomRepository;


    public RoomRestController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping
    public Iterable<Room> getAllRooms(){
        return this.roomRepository.findAll();
    }

    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable("id") long id){
        return this.roomRepository.findById(id).get();
    }
}
