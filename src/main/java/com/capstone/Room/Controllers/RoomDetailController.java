package com.capstone.Room.Controllers;

import com.capstone.Room.DTOs.ResponseData;
import com.capstone.Room.Services.RoomDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/room/detail")
public class RoomDetailController {
    private RoomDetailService roomDetailService;

    @Autowired
    public RoomDetailController(RoomDetailService roomDetailService) {
        this.roomDetailService = roomDetailService;
    }

    @GetMapping("/list")
    public ResponseData ListRoomDetail(@RequestParam(value = "hotelId",required = true) Integer hotelId){
        return roomDetailService.ListRoomDetail(hotelId);
    }
}
