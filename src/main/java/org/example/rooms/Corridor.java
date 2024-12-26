package org.example.rooms;

import java.util.List;

import static org.example.enums.RoomType.*;

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
    List<Room> getAvailableRooms() {
        return List.of(Kitchen.getInstance(), LivingRoom.getInstance(), Bedroom.getInstance(), Bathroom.getInstance());
    }

    @Override
    public void interactWithObjects() {

    }
}