package org.example;

import org.example.rooms.Room;

import java.util.Scanner;

import static org.example.enums.Rooms.*;

public class Main {

    private static final Room bathroom = new Room(BATHROOM);
    private static final Room bedroom = new Room(BEDROOM);
    private static final Room kitchen = new Room(KITCHEN);
    private static final Room corridor = new Room(CORRIDOR);
    private static final Room livingRoom = new Room(LIVING_ROOM);

    private static Room destinationRoom = corridor;

    public static void main(String[] args) {
        System.out.println("Witaj w grze!");

        do {
            destinationRoom.printRoomInfo();
            Scanner scanner = new Scanner(System.in);
            String userValue = scanner.nextLine();
            destinationRoom = calculateRoom(userValue);
        } while (destinationRoom != null);

        System.out.println("Zła wartość, koniec gry");
    }

    private static Room calculateRoom(String userValue) {
        return switch (userValue) {
            case "1" -> isCorridor() ? kitchen : null;
            case "2" -> isCorridor() ? bathroom : null;
            case "3" -> isCorridor() ? livingRoom : null;
            case "4" -> isCorridor() ? bedroom : null;
            case "5" -> corridor;
            default -> null;
        };
    }

    public static boolean isCorridor() {
        return destinationRoom.isCorridor();
    }
}