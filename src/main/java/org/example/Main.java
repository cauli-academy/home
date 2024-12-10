package org.example;

import org.example.enums.Rooms;
import org.example.rooms.*;

import java.util.Scanner;

public class Main {

    private static final Room bathroom = Bathroom.getInstance();
    private static final Room bedroom = Bedroom.getInstance();
    private static final Room kitchen = Kitchen.getInstance();
    private static final Room corridor = Corridor.getInstance();
    private static final Room livingRoom = LivingRoom.getInstance();

    private static Room currentRoom = corridor;

    public static void main(String[] args) {
        System.out.println("Witaj w grze!");

        do {
            currentRoom.printRoomInfo();
            currentRoom.printAvailableRooms();
            Scanner scanner = new Scanner(System.in);
            String userValue = scanner.nextLine();
            currentRoom = calculateRoom(userValue);
        } while (currentRoom != null);

        System.out.println("Zła wartość, koniec gry");
    }

    private static Room calculateRoom(String userValue) {
        int userChoice;
        try {
            userChoice = Integer.parseInt(userValue);
        } catch (Exception e) {
            return null;
        }

        Rooms calculatedRoom = currentRoom.calculateRoom(userChoice);

        if(calculatedRoom != null) {
            return switch (calculatedRoom) {
                case KITCHEN -> kitchen;
                case BEDROOM -> bedroom;
                case BATHROOM -> bathroom;
                case CORRIDOR -> corridor;
                case LIVING_ROOM -> livingRoom;
            };
        }
        return null;
    }
}