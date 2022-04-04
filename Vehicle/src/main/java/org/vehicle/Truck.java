package org.vehicle;

public class Truck extends MotorVehicle{
    private int capacity;

    public Truck(Engine tipe, Transmision transmision, Tire tire, Wheel wheel, int i) {
        setEngine(tipe);
        setTransmision(transmision);
        setWheel(wheel);
        setTire(tire);
        setCapacity(i);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void backward() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void forward() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}
