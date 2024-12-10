package org.example.rooms;

import org.example.enums.Rooms;

import java.util.List;

import static org.example.enums.Rooms.*;

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
    List<Rooms> getAvailableRooms() {
        return List.of(CORRIDOR);
    }
}