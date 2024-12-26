package org.example.rooms;

import org.example.furniture.Wardrobe;

import java.util.List;
import java.util.Scanner;

import static org.example.enums.RoomType.*;

public class LivingRoom extends Room {

    private final Wardrobe wardrobe = new Wardrobe();

    //Singleton

    private static LivingRoom instance;

    private LivingRoom() {
        super(LIVING_ROOM);
    }

    public static LivingRoom getInstance() {
        if (instance == null) {
            instance = new LivingRoom();
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
                    wardrobe.openWardrobe();
                    break;
                case "2":
                    wardrobe.closeWardrobe();
                    break;
                case "3":
                    wardrobe.storeClothes();
                    break;
                case "4":
                    wardrobe.removeClothes();
                    break;
                case "5":
                    wardrobe.checkContents();
                    break;
                case "6":
                    System.out.println("\nKoniec interackji z przedmiotami");
                    break;
                default:
                    System.out.println("\nNie ma takiej opcji");
                    break;
            }
        } while (!userActionValue.equals("6"));
    }

    private void printInteractionInfo() {
        System.out.println("\nDostępne przedmioty: Szafa");
        System.out.println("\nMożliwe interakcje:\n");

        System.out.println("1. Otworzyć szafę");
        System.out.println("2. Zamknąć szafę");
        System.out.println("3. Włożyć ubrania do szafy");
        System.out.println("4. Wyjąć ubrania z szafy");
        System.out.println("5. Sprawdzić czy są ubrania w szafie");
        System.out.println("6. Przejść do innego pomieszczenia");

        System.out.println("\nCo chciałbyś zrobić?");
    }
}