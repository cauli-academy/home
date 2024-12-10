package org.example.rooms;

import org.example.enums.Rooms;

import java.util.List;

import static org.example.enums.Rooms.BATHROOM;
import static org.example.enums.Rooms.CORRIDOR;

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
    List<Rooms> getAvailableRooms() {
        return List.of(CORRIDOR);
    }
}