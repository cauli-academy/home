package org.example;

import org.example.rooms.Bedroom;

public class Main {
    public static void main(String[] args) {
        Bedroom bigBedroom = new Bedroom();
        bigBedroom.goToBedroom();
        bigBedroom.checkIfRoom();
        bigBedroom.checkOnBed();
    }
}