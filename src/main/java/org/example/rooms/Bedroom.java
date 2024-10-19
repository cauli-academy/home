package org.example.rooms;

import org.example.furniture.Bed;
import org.example.furniture.Wardrobe;

public class Bedroom extends Room {

    public Bed bigBed = new Bed();
    public Wardrobe bigWardrobe;

    public Bedroom() {
        System.out.println("Bedroom created");
    }

    public void goToBedroom() {
        System.out.println("I am in bedroom");
    }

    public void checkOnBed(){
        System.out.println("height " + bigBed.height + ", width " + bigBed.width + ", isOpen " + bigBed.isOpen + ", name " + bigBed.name);
    }
}