package exercise5;
/**
 * Representa el codigo que representa el objeto Truck que hereda de Vehicule
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import exercise4.Vehicule;
import java.util.Date;

public class Truck extends Vehicule {
    /**
     * Atributo para darle una altura al camion creado.
     */
    private Double height;

    /**
     * Constructor: Permite crear una instancia de la clase Truck.
     * @param plate
     * @param numpassengers
     * @param crew
     * @param numberwheels
     * @param registration
     * @param displacement
     * @param height
     */
    public Truck(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement, Double height) {
        super(plate, numpassengers, crew, numberwheels, registration, displacement);
        this.height = height;
    }

    /**
     * Método para acceder al atributo height.
     * @return
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Método modificar del atributo height.
     * @param height
     */
    public void setHeight(Double height) {
        this.height = height;
    }
}
