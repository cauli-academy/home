package org.example.objects;

public class Window {

    private boolean isOpen;

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String toString() {
        return String.valueOf(isOpen);
    }
}