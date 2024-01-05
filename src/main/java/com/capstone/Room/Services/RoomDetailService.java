package com.capstone.Room.Services;

import com.capstone.Room.DTOs.ResponseDTOsRoomDetail;
import com.capstone.Room.DTOs.ResponseFacility;
import com.capstone.Room.DTOs.ResponseImage;
import com.capstone.Room.Entities.ResponseRoomDetail;
import com.capstone.Room.Entities.ResponseRooms;
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

    public ResponseDTOsRoomDetail getRoomDetail(Integer roomId){
        List<ResponseRoomDetail> rooms = roomDetailRepository.getRoomDetail(roomId);
        List<ResponseFacility> facilitiesList = roomDetailRepository.listFacilitiesDetail(roomId);
        List<ResponseImage> imageList = roomDetailRepository.listImageDetail(roomId);

        Map<Integer, List<ResponseFacility>> groupedFacility = facilitiesList.stream()
                .collect(Collectors.groupingBy(ResponseFacility::getRoom_id));

        Map<Integer, List<ResponseImage>> groupedImage = imageList.stream()
                .collect(Collectors.groupingBy(ResponseImage::getRoom_id));

        Map<Integer, List<ResponseRoomDetail>> groupedRoom = rooms.stream()
                .collect(Collectors.groupingBy(ResponseRoomDetail::getRoom_id));

        List<ResponseRoomDetail> transformedRoom = groupedRoom.values().stream()
                .map(roomsInGroup -> roomsInGroup.get(0))
                .collect(Collectors.toList());

        transformedRoom.forEach(i -> {
            var facilityListData = groupedFacility.get(i.getRoom_id());
            var imageListData = groupedImage.get(i.getRoom_id());
            i.setFacilities(facilityListData);
            i.setimages(imageListData);
        });

        return new ResponseDTOsRoomDetail(
                200,
                transformedRoom.get(0),
                "Successful"
        );
    }
}
