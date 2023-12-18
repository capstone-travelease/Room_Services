package com.capstone.Room.Services;

import com.capstone.Room.DTOs.ResponseDTOsRooms;
import com.capstone.Room.Entities.ResponseRooms;
import com.capstone.Room.Repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RoomService {
    private RoomRepository roomRepository;
    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public ResponseDTOsRooms ListRooms(Integer hotelId){
        List<ResponseRooms> rooms = roomRepository.listRoom(hotelId);
        Map<Integer, ResponseRooms> groupedRooms = rooms.stream()
                .collect(Collectors.groupingBy(ResponseRooms::getRoom_id,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                roomList -> {
                                    ResponseRooms firstRoom = (ResponseRooms) roomList.get(0);
                                    firstRoom.setFacility_name(String.valueOf(roomList.stream()
                                            .map(ResponseRooms::getFacility_name)
                                            .collect(Collectors.toList())));
                                    return firstRoom;
                                })));
        List<ResponseRooms> combinedRooms = new ArrayList<>(groupedRooms.values());

        return new ResponseDTOsRooms(
                200,
                combinedRooms,
                "Successful"
        );
    }
}
