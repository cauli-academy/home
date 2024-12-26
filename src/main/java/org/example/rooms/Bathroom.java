package org.example.rooms;

import org.example.interfaces.RoomWithWater;
import org.example.interfaces.RoomWithWindow;

import java.util.List;

import static org.example.enums.RoomType.BATHROOM;

public class Bathroom extends Room implements RoomWithWindow, RoomWithWater {

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

    @Override
    public void interactWithObjects() {

    }

    @Override
    public void describeWindowView() {

    }

    @Override
    public void turnWaterOn() {

    }
}