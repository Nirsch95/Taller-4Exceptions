package exercise4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicule {
    private String plate;
    private Integer numPassengers;
    private Boolean crew;
    private Integer numberWheels;
    private Date registration;
    private String displacement;

    public Vehicule(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement) {
        this.plate = plate;
        this.numPassengers = numpassengers;
        this.crew = crew;
        this.numberWheels = numberwheels;
        this.registration = registration;
        this.displacement = displacement;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Integer getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(Integer numPassengers) {
        this.numPassengers = numPassengers;
    }

    public Boolean getCrew() {
        return crew;
    }

    public void setCrew(Boolean crew) {
        this.crew = crew;
    }

    public Integer getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(Integer numberWheels) {
        this.numberWheels = numberWheels;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String strRegistration = df.format(registration.getTime());
        return "Vehicule{" +
                "plate='" + plate + '\'' +
                ", numPassengers=" + numPassengers +
                ", crew=" + crew +
                ", numberWheels=" + numberWheels +
                ", registration=" + strRegistration +
                ", displacement='" + displacement + '\'' +
                '}';
    }
}
