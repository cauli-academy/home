package org.example.rooms;

import org.example.furniture.Bed;

import java.util.List;
import java.util.Scanner;

import static org.example.enums.RoomType.*;

public class Bedroom extends Room {

    private final Bed bed = new Bed();

    // Singleton

    private static Bedroom instance;

    private Bedroom() {
        super(BEDROOM);
    }

    public static Bedroom getInstance() {
        if (instance == null) {
            instance = new Bedroom();
        }
        return instance;
    }

    //

    @Override
    List<Room> getAvailableRooms() {
        return List.of(Corridor.getInstance());
    }

    @Override
    public void interactWithObjects() {
        String userActionValue;
        do {
            printInteractionInfo();
            Scanner scanner = new Scanner(System.in);
            userActionValue = scanner.nextLine();

            switch (userActionValue) {
                case "1":
                    bed.sleep();
                    break;
                case "2":
                    bed.wakeUp();
                    break;
                case "3":
                    bed.makeBed();
                    break;
                case "4":
                    System.out.println("\nKoniec interackji z przedmiotami");
                    break;
                default:
                    System.out.println("\nNie ma takiej opcji");
                    break;
            }
        } while (!userActionValue.equals("4"));
    }

    private void printInteractionInfo() {
        System.out.println("\nDostępne przedmioty: Łóżko");
        System.out.println("\nMożliwe interakcje:\n");

        System.out.println("1. Położyć się w łóżku");
        System.out.println("2. Wstać z łóżka");
        System.out.println("3. Pościelić łóżko");
        System.out.println("4. Przejść do innego pomieszczenia");

        System.out.println("\nCo chciałbyś zrobić?");
    }
}