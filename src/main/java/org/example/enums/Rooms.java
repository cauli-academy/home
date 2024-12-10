package org.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Rooms {

    KITCHEN("Kuchnia"),
    BATHROOM("Łazienka"),
    LIVING_ROOM("Salon"),
    BEDROOM("Sypialnia"),
    CORRIDOR("Korytarz");

    private final String roomName;
}