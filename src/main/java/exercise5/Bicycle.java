package exercise5;
/**
 * Representa el codigo que representa el objeto Bicycle que hereda de Vehicule
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import exercise4.Vehicule;
import java.util.Date;

public class Bicycle extends Vehicule {
    /**
     * Atributo para darle una silla extra a la bicicleta creada.
     */
    private Boolean extraBikeSeat;

    /**
     * Constructor: Permite crear una instancia de la clase Bicycle.
     * @param plate
     * @param numpassengers
     * @param crew
     * @param numberwheels
     * @param registration
     * @param displacement
     * @param extraBikeSeat
     */
    public Bicycle(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement, Boolean extraBikeSeat) {
        super(plate, numpassengers, crew, numberwheels, registration, displacement);
        this.extraBikeSeat = extraBikeSeat;
    }

    /**
     * Método para acceder al atributo extraBikeSeat.
     * @return
     */
    public Boolean getExtraBikeSeat() {
        return extraBikeSeat;
    }

    /**
     * Método modificar del atributo extraBikeSeat.
     * @param extraBikeSeat
     */
    public void setExtraBikeSeat(Boolean extraBikeSeat) {
        this.extraBikeSeat = extraBikeSeat;
    }
}
