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
            try {
                int userValue = scanner.nextInt();
                currentRoom = currentRoom.calculateRoom(userValue);
            } catch (Exception e) {
                currentRoom = null;
            }

        } while (currentRoom != null);

        System.out.println("Zła wartość, koniec gry");
    }
}