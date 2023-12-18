package com.capstone.Room.Services;

import com.capstone.Room.DTOs.ResponseData;
import com.capstone.Room.DTOs.RoomDetailCombined;
import com.capstone.Room.Entities.ResponseRoomDetail;
import com.capstone.Room.Entities.Roomdetail;
import com.capstone.Room.Repositories.RoomDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RoomDetailService {
    private RoomDetailRepository roomDetailRepository;

    @Autowired
    public RoomDetailService(RoomDetailRepository roomDetailRepository) {
        this.roomDetailRepository = roomDetailRepository;
    }

    public ResponseData ListRoomDetail(Integer hotelId){
        List<ResponseRoomDetail> rooms = roomDetailRepository.listRoomDetail(hotelId);
        Map<Integer, ResponseRoomDetail> groupedRooms = rooms.stream()
                .collect(Collectors.groupingBy(ResponseRoomDetail::getRoom_id,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                roomList -> {
                                    ResponseRoomDetail firstRoom = roomList.get(0);
                                    firstRoom.setFacility_name(String.valueOf(roomList.stream()
                                            .map(ResponseRoomDetail::getFacility_name)
                                            .collect(Collectors.toList())));
                                    return firstRoom;
                                })));
        List<ResponseRoomDetail> combinedRooms = new ArrayList<>(groupedRooms.values());

        return new ResponseData(
                200,
                combinedRooms,
                "Successful"
        );
    }
}
