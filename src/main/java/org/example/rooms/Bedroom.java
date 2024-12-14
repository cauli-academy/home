package org.example.rooms;

import java.util.List;

import static org.example.enums.RoomType.*;

public class Bedroom extends Room {

    // Singleton

    private static Bedroom instance;

    private Bedroom() {
        super(BEDROOM);
    }

    public static Bedroom getInstance() {
        if (instance == null) {
            instance = new Bedroom();
        }
        return instance;
    }

    //

    @Override
    List<Room> getAvailableRooms() {
        return List.of(Corridor.getInstance());
    }
}