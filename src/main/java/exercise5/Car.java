package exercise5;
/**
 * Representa el codigo que representa el objeto Car que hereda de Vehicule
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import exercise4.Vehicule;
import java.util.Date;

public class Car extends Vehicule {
    /**
     * Atributo para darle una cantidad de puertas al carro creado.
     */
    private Boolean doors;

    /**
     * Constructor: Permite crear una instancia de la clase Car.
     * @param plate
     * @param numpassengers
     * @param crew
     * @param numberwheels
     * @param registration
     * @param displacement
     * @param doors
     */
    public Car(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement, Boolean doors) {
        super(plate, numpassengers, crew, numberwheels, registration, displacement);
        this.doors = doors;
    }

    /**
     * Método para acceder al atributo doors.
     * @return
     */
    public Boolean getDoors() {
        return doors;
    }

    /**
     * Método modificar del atributo doors.
     * @param doors
     */
    public void setDoors(Boolean doors) {
        this.doors = doors;
    }
}
