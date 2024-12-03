package org.example.rooms;

import org.example.enums.Rooms;

import static org.example.enums.Rooms.*;

public class Room {

    private final Rooms roomName;

    public Room(Rooms roomName) {
        this.roomName = roomName;
    }

    public void printRoomInfo() {
        System.out.println("Jesteś w pomieszczeniu: " + roomName.getRoomName());
        System.out.println("Do jakiego pomieszczenia chciałbyś przejść?");

        if (isCorridor()) {
            System.out.println(KITCHEN);
            System.out.println(BATHROOM);
            System.out.println(LIVING_ROOM);
            System.out.println(BEDROOM);
        } else {
            System.out.println(CORRIDOR);
        }
    }

    public boolean isCorridor() {
        return roomName.equals(CORRIDOR);
    }
}