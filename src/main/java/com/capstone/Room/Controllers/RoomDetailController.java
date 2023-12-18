package com.capstone.Room.Controllers;

import com.capstone.Room.DTOs.ResponseDTOsRoomDetail;
import com.capstone.Room.Services.RoomDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/room/detail")
public class RoomDetailController {
    private RoomDetailService roomDetailService;

    @Autowired
    public RoomDetailController(RoomDetailService roomDetailService) {
        this.roomDetailService = roomDetailService;
    }

    @GetMapping("/get-room")
    public ResponseDTOsRoomDetail GetRoomDetail(@RequestParam(value = "roomId",required = true) Integer hotelId){
        return roomDetailService.getRoomDetail(hotelId);
    }
}
