package org.example.rooms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.enums.RoomType;

import java.util.List;

@Getter
@AllArgsConstructor
public abstract class Room {

    private final RoomType roomType;

    abstract List<Room> getAvailableRooms();

    public abstract void interactWithObjects();

    public void printRoomInfo() {
        System.out.println("\nJesteś w pomieszczeniu: " + roomType.getRoomName());
        System.out.println("\nCo chcesz zrobić?");
        System.out.println("1. Wejść w interakcję z przedmiotami w pomieszczeniu");
        System.out.println("2. Przejść do innego pomieszczenia");
    }

    public void goToDifferentRoom() {
        System.out.println("\nDo jakiego pomieszczenia chciałbyś przejść?");
        printAvailableRooms();
    }

    private void printAvailableRooms() {
        for (int index = 1; index <= getAvailableRooms().size(); index++) {
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
        return userIndex - 1;
    }
}