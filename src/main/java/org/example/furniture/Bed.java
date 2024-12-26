package org.example.furniture;

import lombok.*;

//@Getter
//@Setter
@AllArgsConstructor  // Tworzy konstruktor z wszystkimi parametrami
@NoArgsConstructor   // Tworzy konstruktor bezparametrowy
@ToString            // Tworzy metodę toString
public class Bed {
    private String material;  // materiał, z jakiego wykonane jest łóżko
    private int capacity;     // liczba osób, które mogą spać na łóżku
    private boolean isOccupied; // czy łóżko jest zajęte
    private boolean isMade;    // czy łóżko jest zaścielone
    private int comfortLevel;  // poziom komfortu łóżka (od 1 do 10)

    // Interakcje z łóżkiem

    // Spanie na łóżku
    public void sleep() {
        if (isOccupied) {
            System.out.println("Łóżko jest już zajęte!");
        } else {
            isOccupied = true;
            System.out.println("Położono się do łóżka. Zrelaksuj się!");
        }
    }

    // Wstawianie pościeli (zaścielanie łóżka)
    public void makeBed() {
        if (!isMade) {
            isMade = true;
            System.out.println("Łóżko zostało zaścielone.");
        } else {
            System.out.println("Łóżko jest już zaścielone.");
        }
    }

    // Opuszczanie łóżka
    public void wakeUp() {
        if (isOccupied) {
            isOccupied = false;
            System.out.println("Wstałeś z łóżka. Dzień dobry!");
        } else {
            System.out.println("Nie leżysz na łóżku.");
        }
    }

    // Sprawdzenie komfortu łóżka
    public void checkComfort() {
        System.out.println("Poziom komfortu łóżka: " + comfortLevel + "/10");
    }

    // Wyświetlanie informacji o łóżku
    public void displayInfo() {
        System.out.println(this);
    }
}