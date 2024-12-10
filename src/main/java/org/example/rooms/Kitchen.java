package org.example.rooms;

import org.example.enums.Rooms;

import java.util.List;

import static org.example.enums.Rooms.CORRIDOR;
import static org.example.enums.Rooms.KITCHEN;

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
    List<Rooms> getAvailableRooms() {
        return List.of(CORRIDOR);
    }
}
