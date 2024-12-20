package org.example.rooms;

import java.util.List;

import static org.example.enums.RoomType.*;

public class LivingRoom extends Room {

    //Singleton

    private static LivingRoom instance;

    private LivingRoom() {
        super(LIVING_ROOM);
    }

    public static LivingRoom getInstance() {
        if (instance == null) {
            instance = new LivingRoom();
        }
        return instance;
    }

    //

    @Override
    List<Room> getAvailableRooms() {
        return List.of(Corridor.getInstance());
    }
}