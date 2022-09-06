package exercise5;
/**
 * Representa el codigo que representa el objeto Moto que hereda de Vehicule
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import exercise4.Vehicule;
import java.util.Date;

public class Moto extends Vehicule {
    /**
     * Atributo para darle una cantidad de luces a la moto creada.
     */
    private Boolean spotlight;

    /**
     * Constructor: Permite crear una instancia de la clase Moto.
     * @param plate
     * @param numpassengers
     * @param crew
     * @param numberwheels
     * @param registration
     * @param displacement
     * @param spotlight
     */
    public Moto(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement, Boolean spotlight) {
        super(plate, numpassengers, crew, numberwheels, registration, displacement);
        this.spotlight = spotlight;
    }

    /**
     * Método para acceder al atributo spotlight.
     * @return
     */
    public Boolean getSpotlight() {
        return spotlight;
    }

    /**
     * Método modificar del atributo spotlight.
     * @param spotlight
     */
    public void setSpotlight(Boolean spotlight) {
        this.spotlight = spotlight;
    }
}
