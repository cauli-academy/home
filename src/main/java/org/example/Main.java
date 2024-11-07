package org.example;

import org.example.furniture.Bed;
import org.example.furniture.Wardrobe;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("wood", 2, false, true, 10);
        System.out.println(bed);
        Wardrobe wardrobe = new Wardrobe();
        System.out.println(wardrobe);
    }
}