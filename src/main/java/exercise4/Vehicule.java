package exercise4;
/**
 * Representa el codigo que representa un objeto Vehicule.
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Vehicule {
    /**
     * Atributo para darle una placa al vehiculo creada.
     */
    private String plate;
    /**
     * Atributo para darle un número de pasajeros al vehiculo creada.
     */
    private Integer numPassengers;
    /**
     * Atributo para darle una capacidad de tripulación al vehiculo creada.
     */
    private Boolean crew;
    /**
     * Atributo para darle una cantidad de ruedas al vehiculo creada.
     */
    private Integer numberWheels;
    /**
     * Atributo para darle un registro al vehiculo creada.
     */
    private Date registration;
    /**
     * Atributo para darle un tipo de desplazamiento al vehiculo creada.
     */
    private String displacement;

    /**
     * Constructor: Permite crear una instancia de la clase Vehicule.
     * @param plate
     * @param numpassengers
     * @param crew
     * @param numberwheels
     * @param registration
     * @param displacement
     */
    public Vehicule(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement) {
        this.plate = plate;
        this.numPassengers = numpassengers;
        this.crew = crew;
        this.numberWheels = numberwheels;
        this.registration = registration;
        this.displacement = displacement;
    }
    /**
     * Método para acceder al atributo plate.
     * @return
     */
    public String getPlate() {
        return plate;
    }

    /**
     * Método modificador del atributo plate.
     * @param plate
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * Método para acceder al atributo numPassengers.
     * @return
     */
    public Integer getNumPassengers() {
        return numPassengers;
    }

    /**
     * Método modificador del atributo numPassengers.
     * @param numPassengers
     */
    public void setNumPassengers(Integer numPassengers) {
        this.numPassengers = numPassengers;
    }

    /**
     * Método para acceder al atributo crew.
     * @return
     */
    public Boolean getCrew() {
        return crew;
    }

    /**
     * Método modificador del atributo crew.
     * @param crew
     */
    public void setCrew(Boolean crew) {
        this.crew = crew;
    }

    /**
     * Método para acceder al atributo numberWheels.
     * @return
     */
    public Integer getNumberWheels() {
        return numberWheels;
    }

    /**
     * Método modificador del atributo numberWheels.
     * @param numberWheels
     */
    public void setNumberWheels(Integer numberWheels) {
        this.numberWheels = numberWheels;
    }

    /**
     * Método para acceder al atributo registration.
     * @return
     */
    public Date getRegistration() {
        return registration;
    }

    /**
     * Método modificador del atributo registration.
     * @param registration
     */
    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    /**
     * Método para acceder al atributo displacement.
     * @return
     */
    public String getDisplacement() {
        return displacement;
    }

    /**
     * Método modificador del atributo displacement.
     * @param displacement
     */
    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    /**
     * Sobreescribe el método toString para mostrar el vehiculo de la manera deseada.
     * @return
     */
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
