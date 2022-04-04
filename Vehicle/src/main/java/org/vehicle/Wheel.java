package org.vehicle;

public class Wheel {
    private int width;
    private int diameter;

    public Wheel(int width, int diameter) {
        setWidth(width);
        setDiameter(diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public int getWidth() {
        return width;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
