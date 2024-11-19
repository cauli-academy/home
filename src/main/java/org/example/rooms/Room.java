package org.example.rooms;

import java.util.Scanner;

public class Room {

    private static final String KITCHEN = "Kuchnia";
    private static final String BATHROOM = "Łazienka";
    private static final String LIVING_ROOM = "Salon";
    private static final String BEDROOM = "Sypialnia";
    private static final String CORRIDOR = "Korytarz";

    private final String roomName;

    public Room(String roomName) {
        this.roomName = roomName;
        System.out.println("Jesteś w pomieszczeniu: " + roomName);
        System.out.println("Do jakiego pomieszczenia chciałbyś przejść?");

        if (isCorridor()) {
            System.out.println("1. " + KITCHEN);
            System.out.println("2. " + BATHROOM);
            System.out.println("3. " + LIVING_ROOM);
            System.out.println("4. " + BEDROOM);
        } else {
            System.out.println("5. " + CORRIDOR);
        }

        Scanner scanner = new Scanner(System.in);
        int userValue = 5;
        try {
            userValue = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Zła wartość, gra zaczyna się od nowa");
        }

        if (userValue == 1 && isCorridor()) {
            new Room(KITCHEN);
        } else if (userValue == 2 && isCorridor()) {
            new Room(BATHROOM);
        } else if (userValue == 3 && isCorridor()) {
            new Room(LIVING_ROOM);
        } else if (userValue == 4 && isCorridor()) {
            new Room(BEDROOM);
        } else if (userValue == 5) {
            new Room(CORRIDOR);
        } else {
            System.out.println("Zła wartość, gra zaczyna się od nowa");
            new Room(roomName);
        }
    }

    private boolean isCorridor() {
        return roomName.equals(CORRIDOR);
    }
}