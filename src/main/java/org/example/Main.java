package org.example;

import org.example.rooms.*;

import java.util.Scanner;

public class Main {

    private static Room currentRoom = Corridor.getInstance();

    public static void main(String[] args) {
        System.out.println("Witaj w grze!");

        do {
            currentRoom.printRoomInfo();
            Scanner scanner = new Scanner(System.in);

            String userValue1 = scanner.nextLine();
            if (userValue1.equals("1")) {
                currentRoom.interactWithObjects();
            } else if (userValue1.equals("2")) {
                currentRoom.goToDifferentRoom();
                try {
                    int userValue = scanner.nextInt();
                    currentRoom = currentRoom.calculateRoom(userValue);
                } catch (Exception e) {
                    currentRoom = null;
                }
            } else {
                break;
            }
        }
        while (currentRoom != null);

        System.out.println("Zła wartość, koniec gry");
    }
}