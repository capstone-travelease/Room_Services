package com.capstone.Room.Services;

import com.capstone.Room.DTOs.ResponseData;
import com.capstone.Room.Entities.ResponseRoomDetail;
import com.capstone.Room.Repositories.RoomDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class RoomDetailService {
    private RoomDetailRepository roomDetailRepository;

    @Autowired
    public RoomDetailService(RoomDetailRepository roomDetailRepository) {
        this.roomDetailRepository = roomDetailRepository;
    }

    public List<ResponseData> ListRoomDetail(Integer hotelId){
        return List.of(
                new ResponseData(
                        200,
                        roomDetailRepository.listRoomDetail(hotelId),
                        "Successful"
                )
        );
    }
}
