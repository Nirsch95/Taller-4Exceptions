package exercise5;

import exercise4.Vehicule;

import java.util.Date;

public class Car extends Vehicule {
    private Boolean doors;

    public Car(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement, Boolean doors) {
        super(plate, numpassengers, crew, numberwheels, registration, displacement);
        this.doors = doors;
    }

    public Boolean getDoors() {
        return doors;
    }

    public void setDoors(Boolean doors) {
        this.doors = doors;
    }
}
