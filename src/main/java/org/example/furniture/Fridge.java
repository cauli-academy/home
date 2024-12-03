package org.example.furniture;

//import lombok.Data;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//
import java.util.List;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Fridge {
    private String brand;            // Marka lodówki
    private int capacity;            // Pojemność w litrach
    private boolean isOn;            // Czy lodówka jest włączona
    private List<String> contents;   // Zawartość lodówki (lista przedmiotów)

    // Przykład dodatkowych metod biznesowych:

    public void addItem(String item) {
        if (!contents.contains(item)) {
            contents.add(item);
        }
    }

    public void removeItem(String item) {
        contents.remove(item);
    }

    public void togglePower() {
        isOn = !isOn;
    }

    public void displayContents() {
        System.out.println("Zawartość lodówki:");
        if (contents.isEmpty()) {
            System.out.println("Lodówka jest pusta.");
        } else {
            contents.forEach(System.out::println);
        }
    }
}