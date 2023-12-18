package com.capstone.Room.Repositories;

import com.capstone.Room.Entities.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Rooms, Long> {

}
