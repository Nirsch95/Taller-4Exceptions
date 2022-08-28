package exercise5;

import exercise4.Vehicule;

import java.util.Date;

public class Truck extends Vehicule {
    private Double height;

    public Truck(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement, Double height) {
        super(plate, numpassengers, crew, numberwheels, registration, displacement);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
