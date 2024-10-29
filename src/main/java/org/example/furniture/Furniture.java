package org.example.furniture;

public class Furniture {

    private double height;
    private double width;
    private double depth;

    public Furniture(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public String getHeight() {
        return String.valueOf(height);
    }

    public String getWidth() {
        return String.valueOf(width);
    }

    public String getDepth() {
        return String.valueOf(depth);
    }
}
