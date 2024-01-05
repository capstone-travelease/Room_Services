package com.capstone.Room.Services;

import com.capstone.Room.DTOs.ResponseDTOsRooms;
import com.capstone.Room.DTOs.ResponseFacility;
import com.capstone.Room.DTOs.ResponseImage;
import com.capstone.Room.Entities.ResponseRooms;
import com.capstone.Room.Repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RoomService {
    final RoomRepository roomRepository;
    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public ResponseDTOsRooms ListRooms(Integer hotelId){
        List<ResponseRooms> rooms = roomRepository.listRoom(hotelId);
        List<ResponseFacility> facilitiesList = roomRepository.listFacilities(hotelId);
        List<ResponseImage> imageList = roomRepository.listImages(hotelId);

        Map<Integer, List<ResponseFacility>> groupedFacility = facilitiesList.stream()
                .collect(Collectors.groupingBy(ResponseFacility::getRoom_id));

        Map<Integer, List<ResponseImage>> groupedImage = imageList.stream()
                .collect(Collectors.groupingBy(ResponseImage::getRoom_id));

        Map<Integer, List<ResponseRooms>> groupedRoom = rooms.stream()
                .collect(Collectors.groupingBy(ResponseRooms::getRoom_id));

        List<ResponseRooms> transformedRoom = groupedRoom.values().stream()
                .map(roomsInGroup -> roomsInGroup.get(0))
                .collect(Collectors.toList());

        transformedRoom.forEach(i -> {
            var facilityListData = groupedFacility.get(i.getRoom_id());
            var imageListData = groupedImage.get(i.getRoom_id());
            i.setfacilities(facilityListData);
            i.setimages(imageListData);
        });

        return new ResponseDTOsRooms(
                200,
                transformedRoom,
                "Successful"
        );
    }
}
