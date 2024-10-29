package org.example.rooms;

public class Kitchen extends Room {

    protected String name;

    public Kitchen() {
        window.setIsOpen(true);
    }

    public String toString() {
        return "isOpen: " + window;
    }
}
