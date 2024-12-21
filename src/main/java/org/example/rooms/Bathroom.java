package org.example.rooms;

import java.util.List;

import static org.example.enums.RoomType.BATHROOM;

public class Bathroom extends Room {

    // Singleton

    private static Bathroom instance;

    private Bathroom() {
        super(BATHROOM);
    }

    public static Bathroom getInstance() {
        if (instance == null) {
            instance = new Bathroom();
        }
        return instance;
    }

    //

    @Override
    List<Room> getAvailableRooms() {
        return List.of(Corridor.getInstance());
    }
}