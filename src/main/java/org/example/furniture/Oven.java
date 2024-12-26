package org.example.furniture;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Oven {
    private String brand;            // Marka piekarnika
    private String temperature;         // Temperatura piekarnika (w stopniach Celsjusza)
    private boolean isOn;            // Czy piekarnik jest włączony
    private boolean isPreheated;     // Czy piekarnik jest wstępnie podgrzany
    private List<String> contents;   // Zawartość piekarnika (np. lista przedmiotów, które się pieką)

    // Przykładowe dodatkowe metody:

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

    public void preheatOven(String targetTemperature) {
        if (isOn) {
            temperature = targetTemperature;
            isPreheated = true;
            System.out.println("Piekarnik podgrzany do " + targetTemperature + "°C.");
        } else {
            System.out.println("Piekarnik nie jest włączony. Proszę włączyć piekarnik.");
        }
    }

    public void displayContents() {
        System.out.println("Zawartość piekarnika:");
        if (contents.isEmpty()) {
            System.out.println("Piekarnik jest pusty.");
        } else {
            contents.forEach(System.out::println);
        }
    }
}