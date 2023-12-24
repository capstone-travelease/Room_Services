package com.capstone.Room.Controllers;

import com.capstone.Room.DTOs.ResponseDTOsRooms;
import com.capstone.Room.Services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/room")
public class RoomController {
    private RoomService roomService;
    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/list")
    public ResponseDTOsRooms ListRooms(@RequestParam(value = "hotelId",required = true) Integer hotelId){
        return roomService.ListRooms(hotelId);
    }

//    @PostMapping("/add")
//    public ResponseDTOsRooms AddRoom(@RequestBody )
}
