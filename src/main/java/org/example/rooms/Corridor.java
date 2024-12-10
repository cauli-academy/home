package org.example.rooms;

import org.example.enums.Rooms;

import java.util.List;

import static org.example.enums.Rooms.*;

public class Corridor extends Room {

    //Singleton

    private static Corridor instance;

    private Corridor() {
        super(CORRIDOR);
    }

    public static Corridor getInstance() {
        if (instance == null) {
            instance = new Corridor();
        }
        return instance;
    }

    //

    @Override
    List<Rooms> getAvailableRooms() {
        return List.of(KITCHEN, LIVING_ROOM, BEDROOM, BATHROOM);
    }
}