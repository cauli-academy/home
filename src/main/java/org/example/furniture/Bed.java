package org.example.furniture;

public class Bed extends Furniture {

    private boolean hasPlace;

    public Bed(double height, double width, double depth, boolean hasPlace) {
        super(height, width, depth);
        this.hasPlace = hasPlace;
    }

    public Bed(double height, double width, double depth) {
        super(height, width, depth);
        this.hasPlace = true;
    }

    public Bed(double height, double width, double depth, int numberOfPlaces, int numberOfTakenPlaces){
        super(height, width, depth);
        this.hasPlace = numberOfPlaces > numberOfTakenPlaces;
    }

    public void setHasPlace(boolean hasPlace) {
        this.hasPlace = hasPlace;
    }

    public String toString() {
        return "height: " + getHeight() + ", width: " + getWidth() + ", depth: " + getDepth() + ", hasPlace: " + hasPlace;
    }
}