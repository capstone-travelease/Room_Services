package com.capstone.Room.Repositories;

import com.capstone.Room.DTOs.ResponseFacility;
import com.capstone.Room.DTOs.ResponseImage;
import com.capstone.Room.Entities.Facilities;
import com.capstone.Room.Entities.ResponseRoomDetail;
import com.capstone.Room.Entities.ResponseRooms;
import com.capstone.Room.Entities.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Rooms, Long> {
    @Query("SELECT new com.capstone.Room.Entities.ResponseRooms(rd.room_id, r.room_name, rd.room_size, rd.room_bed_quantity, rd.room_capacity, r.room_quantity, r.room_price) FROM Roomdetail rd \n" +
            "INNER JOIN RoomAttachment rat ON rat.room_id = rd.room_detail_id\n" +
            "INNER JOIN Attachment atc ON atc.attachment_id = rat.attachmentId\n" +
            "INNER JOIN Rooms r ON r.room_id = rd.room_id\n" +
            "INNER JOIN Hotels h ON h.hotel_id = r.hotel_id\n" +
            "INNER JOIN RoomFacilities rf ON rf.room_id = rd.room_detail_id\n" +
            "INNER JOIN Facilities fac ON fac.facility_id = rf.facility_id\n" +
            "WHERE h.hotel_id = ?1\n" +
            "ORDER BY r.room_price")
    List<ResponseRooms> listRoom(Integer hotelId);

    @Query("SELECT new com.capstone.Room.DTOs.ResponseFacility(f.facility_id, f.facility_name, r.room_id, f.facility_image)FROM Facilities f\n" +
            "INNER JOIN RoomFacilities rf ON rf.facility_id = f.facility_id\n" +
            "INNER JOIN Roomdetail rd ON rd.room_detail_id = rf.room_id\n" +
            "INNER JOIN Rooms r ON r.room_id = rd.room_id\n" +
            "INNER JOIN Hotels h ON h.hotel_id = r.hotel_id\n" +
            "WHERE h.hotel_id = ?1")
    List<ResponseFacility> listFacilities(Integer hotelId);

    @Query("SELECT new com.capstone.Room.DTOs.ResponseImage(atc.file_url, r.room_id) FROM Attachment atc\n" +
            "INNER JOIN RoomAttachment ratc ON ratc.attachmentId = atc.attachment_id\n" +
            "INNER JOIN Roomdetail rd ON rd.room_detail_id = ratc.room_id\n" +
            "INNER JOIN Rooms r ON r.room_id = rd.room_id\n" +
            "INNER JOIN Hotels h ON h.hotel_id = r.hotel_id\n" +
            "WHERE h.hotel_id = ?1")
    List<ResponseImage> listImages(Integer hotelId);
}
