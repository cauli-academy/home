package org.example.rooms;

import java.util.List;

import static org.example.enums.RoomType.KITCHEN;

public class Kitchen extends Room {

    //Singleton

    private static Kitchen instance;

    private Kitchen() {
        super(KITCHEN);
    }

    public static Kitchen getInstance() {
        if (instance == null) {
            instance = new Kitchen();
        }
        return instance;
    }

    //

    @Override
    List<Room> getAvailableRooms() {
        return List.of(Corridor.getInstance());
    }
}
