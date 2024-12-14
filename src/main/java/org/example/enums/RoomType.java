package org.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoomType {

    CORRIDOR("Korytarz"),
    KITCHEN("Kuchnia"),
    BATHROOM("Łazienka"),
    LIVING_ROOM("Salon"),
    BEDROOM("Sypialnia");

    private final String roomName;
}