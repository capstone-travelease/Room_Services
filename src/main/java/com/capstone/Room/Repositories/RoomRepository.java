package com.capstone.Room.Repositories;

import com.capstone.Room.Entities.ResponseRoomDetail;
import com.capstone.Room.Entities.ResponseRooms;
import com.capstone.Room.Entities.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Rooms, Long> {
    @Query("SELECT new com.capstone.Room.Entities.ResponseRooms(rd.room_id, r.room_name, rd.room_size, rd.room_bed_quantity, rd.room_capacity, atc.file_url, fac.facility_name, r.room_price) FROM Roomdetail rd \n" +
            "INNER JOIN RoomAttachment rat ON rat.room_id = rd.room_detail_id\n" +
            "INNER JOIN Attachment atc ON atc.attachment_id = rat.attachmentId\n" +
            "INNER JOIN Rooms r ON r.room_id = rd.room_id\n" +
            "INNER JOIN Hotels h ON h.hotel_id = r.hotel_id\n" +
            "INNER JOIN RoomFacilities rf ON rf.room_id = rd.room_detail_id\n" +
            "INNER JOIN Facilities fac ON fac.facility_id = rf.facility_id\n" +
            "WHERE h.hotel_id = ?1")
    List<ResponseRooms> listRoom(Integer hotelId);
}
