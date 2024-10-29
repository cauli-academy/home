package org.example;

import org.example.rooms.Kitchen;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        ChildRoom childRoom = new ChildRoom();
        System.out.println(childRoom);
        System.out.println(kitchen);

    }
}