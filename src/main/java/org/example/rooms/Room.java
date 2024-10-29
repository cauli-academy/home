package org.example.rooms;

import org.example.objects.Window;

public class Room {

    protected Window window = new Window();

    public Room() {
        System.out.println("Room created");
    }
}