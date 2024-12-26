package org.example.rooms;

import org.example.furniture.Fridge;
import org.example.furniture.Oven;

import java.util.List;
import java.util.Scanner;

import static org.example.enums.RoomType.KITCHEN;

public class Kitchen extends Room {

    private final Fridge fridge = new Fridge();
    private final Oven oven = new Oven();

    //Singleton

    private static Kitchen instance;

    private Kitchen() {
        super(KITCHEN);
    }

    public static Kitchen getInstance() {
        if (instance == null) {
            instance = new Kitchen();
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
                    fridge.displayContents();
                    break;
                case "2":
                    System.out.println("Co chcesz włożyć do lodówki?");
                    String itemToAdd = scanner.nextLine();
                    fridge.addItem(itemToAdd);
                    break;
                case "3":
                    System.out.println("Co chcesz wyjąć z lodówki?");
                    String itemToRemove = scanner.nextLine();
                    fridge.removeItem(itemToRemove);
                    break;
                case "4":
                    oven.togglePower();
                    break;
                case "5":
                    System.out.println("Ile stopni ustawić?");
                    String temperature = scanner.nextLine();
                    oven.preheatOven(temperature);
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
        System.out.println("\nDostępne przedmioty: Piekarnik, Lodówka");
        System.out.println("\nMożliwe interakcje:\n");

        System.out.println("1. Sprawdzić zawartość lodówki");
        System.out.println("2. Włożyć coś do lodówki");
        System.out.println("3. Wyjąć coś z lodówki");
        System.out.println("4. Włączyć/Wyłączyć pierkarnik");
        System.out.println("5. Podgrzać pierkarnik");
        System.out.println("6. Przejść do innego pomieszczenia");

        System.out.println("\nCo chciałbyś zrobić?");
    }
}
