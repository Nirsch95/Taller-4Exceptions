package exercise5;

import exercise4.Vehicule;

import java.util.Date;

public class Boat extends Vehicule {
    private Boolean engine;

    public Boat(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement, Boolean engine) {
        super(plate, numpassengers, crew, numberwheels, registration, displacement);
        this.engine = engine;
    }

    public Boolean getEngine() {
        return engine;
    }

    public void setEngine(Boolean engine) {
        this.engine = engine;
    }
}
