package exercise5;

import exercise4.Vehicule;

import java.util.Date;

public class Bicycle extends Vehicule {
    private Boolean extraBikeSeat;

    public Bicycle(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement, Boolean extraBikeSeat) {
        super(plate, numpassengers, crew, numberwheels, registration, displacement);
        this.extraBikeSeat = extraBikeSeat;
    }

    public Boolean getExtraBikeSeat() {
        return extraBikeSeat;
    }

    public void setExtraBikeSeat(Boolean extraBikeSeat) {
        this.extraBikeSeat = extraBikeSeat;
    }
}
