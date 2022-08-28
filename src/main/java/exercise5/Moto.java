package exercise5;

import exercise4.Vehicule;

import java.util.Date;

public class Moto extends Vehicule {
    private Boolean spotlight;

    public Moto(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement, Boolean spotlight) {
        super(plate, numpassengers, crew, numberwheels, registration, displacement);
        this.spotlight = spotlight;
    }

    public Boolean getSpotlight() {
        return spotlight;
    }

    public void setSpotlight(Boolean spotlight) {
        this.spotlight = spotlight;
    }
}
