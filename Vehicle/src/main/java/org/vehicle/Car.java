package org.vehicle;

public class Car extends MotorVehicle{
    public Car(Engine tipe, Transmision transmision, Tire tire, Wheel wheel) {
        setEngine(tipe);
        setTransmision(transmision);
        setWheel(wheel);
        setTire(tire);
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
