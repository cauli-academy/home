package org.example.rooms;

import org.example.enums.Rooms;

import java.util.List;

public abstract class Room {

    private final Rooms roomName;

    public Room(Rooms roomName) {
        this.roomName = roomName;
    }

    public void printRoomInfo() {
        System.out.println("Jesteś w pomieszczeniu: " + roomName.getRoomName());
        System.out.println("Do jakiego pomieszczenia chciałbyś przejść?");
    }

    abstract List<Rooms> getAvailableRooms();

    public void printAvailableRooms() {
        for (int index = 1; index <= getAvailableRooms().size(); index++) {
            int roomIndex = index - 1;
            String valueToPrint = index + ". " + getAvailableRooms().get(roomIndex).getRoomName();
            System.out.println(valueToPrint);
        }
    }

    public Rooms calculateRoom(int userChoice) {
        int roomIndex = userChoice - 1;
        return userChoice <= getAvailableRooms().size() ? getAvailableRooms().get(roomIndex) : null;
    }
}