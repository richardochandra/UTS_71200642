package org.vehicle;

public class Engine {
    private String fuelType;
    private int capacity;

    public Engine(String fuelType, int capacity) {
        setCapacity(capacity);
        setFuelType(fuelType);
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
