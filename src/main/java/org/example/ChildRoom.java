package org.example;

import org.example.rooms.Room;

public class ChildRoom extends Room {

    public ChildRoom() {
        window.setIsOpen(false);
    }

    public String toString() {
        return "isOpen: " + window;
    }
}
