package org.example.furniture;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor  // Tworzy konstruktor z wszystkimi parametrami
@NoArgsConstructor   // Tworzy konstruktor bezparametrowy
@ToString            // Tworzy metodę toString
public class Wardrobe {
    private String material;      // materiał, z jakiego wykonana jest szafa (np. drewno, metal)
    private int numberOfDoors;    // liczba drzwi w szafie
    private boolean isOpen;       // czy szafa jest otwarta
    private boolean hasClothes;   // czy szafa jest wypełniona ubraniami
    private String color;         // kolor szafy

    // Interakcje z szafą

    // Otwieranie szafy
    public void openWardrobe() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Szafa została otwarta.");
        } else {
            System.out.println("Szafa jest już otwarta.");
        }
    }

    // Zamknięcie szafy
    public void closeWardrobe() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Szafa została zamknięta.");
        } else {
            System.out.println("Szafa jest już zamknięta.");
        }
    }

    // Sprawdzanie zawartości szafy
    public void checkContents() {
        if (hasClothes) {
            System.out.println("Szafa jest pełna ubrań.");
        } else {
            System.out.println("Szafa jest pusta.");
        }
    }

    // Przechowywanie ubrań w szafie
    public void storeClothes() {
        if (!hasClothes) {
            hasClothes = true;
            System.out.println("Ubrania zostały schowane w szafie.");
        } else {
            System.out.println("Szafa już zawiera ubrania.");
        }
    }

    // Usuwanie ubrań z szafy
    public void removeClothes() {
        if (hasClothes) {
            hasClothes = false;
            System.out.println("Ubrania zostały wyjęte ze szafy.");
        } else {
            System.out.println("Szafa jest pusta.");
        }
    }

    // Wyświetlanie informacji o szafie
    public void displayInfo() {
        System.out.println(this);
    }
}
