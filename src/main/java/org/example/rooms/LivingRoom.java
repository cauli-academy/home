package org.example.rooms;

import org.example.enums.Rooms;

import java.util.List;

import static org.example.enums.Rooms.*;

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
    List<Rooms> getAvailableRooms() {
        return List.of(CORRIDOR);
    }
}