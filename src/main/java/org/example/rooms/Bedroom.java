package org.example.rooms;

import org.example.furniture.Bed;
import org.example.furniture.Wardrobe;

public class Bedroom extends Room {

    private Bed bigBed = new Bed(45.5, 160, 200, true);
    private Bed smallBed = new Bed(45.5, 90, 200);
    private Wardrobe bigWardrobe;

    public Bedroom() {
        System.out.println("Bedroom created");
    }

    public void takePlaceOnBigBed(){
        bigBed.setHasPlace(false);
    }

    public void checkOnBed(){
        System.out.println(bigBed);
        System.out.println(smallBed);
    }
}