package org.example.rooms;

import lombok.Getter;
import org.example.enums.RoomType;

import java.util.List;

@Getter
public abstract class Room {

    private final RoomType roomType;

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public void printRoomInfo() {
        System.out.println("Jesteś w pomieszczeniu: " + roomType.getRoomName());
        System.out.println("Do jakiego pomieszczenia chciałbyś przejść lub jaką akcję wykonać?");
        printAvailableRooms();
    }

    abstract List<Room> getAvailableRooms();

    private void printAvailableRooms() {
        for (int index = 1; index < getAvailableRooms().size(); index++) {
            int roomIndex = getRoomIndex(index);
            String valueToPrint = index + ". " + getAvailableRooms().get(roomIndex).getRoomType().getRoomName();
            System.out.println(valueToPrint);
        }
    }

    public Room calculateRoom(int userChoice) {
        int roomIndex = getRoomIndex(userChoice);
        return roomIndex < getAvailableRooms().size() && userChoice > 0 ? getAvailableRooms().get(roomIndex) : null;
    }

    private int getRoomIndex(int userIndex) {
        return userIndex -1;
    }
}