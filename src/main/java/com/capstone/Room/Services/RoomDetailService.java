package com.capstone.Room.Services;

import com.capstone.Room.DTOs.ResponseDTOsRoomDetail;
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

    public ResponseDTOsRoomDetail getRoomDetail(Integer hotelId){
        List<com.capstone.Room.Entities.ResponseRoomDetail> rooms = roomDetailRepository.getRoomDetail(hotelId);
        Map<Integer, com.capstone.Room.Entities.ResponseRoomDetail> groupedRooms = rooms.stream()
                .collect(Collectors.groupingBy(com.capstone.Room.Entities.ResponseRoomDetail::getRoom_id,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                roomList -> {
                                    com.capstone.Room.Entities.ResponseRoomDetail firstRoom = roomList.get(0);
                                    firstRoom.setFacility_name(String.valueOf(roomList.stream()
                                            .map(com.capstone.Room.Entities.ResponseRoomDetail::getFacility_name)
                                            .collect(Collectors.toList())));
                                    return firstRoom;
                                })));
        List<com.capstone.Room.Entities.ResponseRoomDetail> combinedRooms = new ArrayList<>(groupedRooms.values());

        return new ResponseDTOsRoomDetail(
                200,
                combinedRooms,
                "Successful"
        );
    }
}
