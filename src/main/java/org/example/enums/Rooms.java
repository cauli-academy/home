package org.example.enums;

public enum Rooms {

    KITCHEN("Kuchnia", 1),
    BATHROOM("Łazienka", 2),
    LIVING_ROOM("Salon", 3),
    BEDROOM("Sypialnia", 4),
    CORRIDOR("Korytarz", 5);

    private final String roomName;
    private final int number;

    Rooms(String roomName, int number) {
        this.roomName = roomName;
        this.number = number;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public String toString() {
        return this.number + ". " + this.roomName;
    }
}