package exercise5;
/**
 * Representa el codigo que representa el objeto Boat que hereda de Vehicule
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import exercise4.Vehicule;
import java.util.Date;

public class Boat extends Vehicule {
    /**
     * Atributo para darle un motor al bote creado.
     */
    private Boolean engine;

    /**
     * Constructor: Permite crear una instancia de la clase Boat.
     * @param plate
     * @param numpassengers
     * @param crew
     * @param numberwheels
     * @param registration
     * @param displacement
     * @param engine
     */
    public Boat(String plate, Integer numpassengers, Boolean crew, Integer numberwheels, Date registration, String displacement, Boolean engine) {
        super(plate, numpassengers, crew, numberwheels, registration, displacement);
        this.engine = engine;
    }

    /**
     * Método para acceder al atributo engine.
     * @return
     */
    public Boolean getEngine() {
        return engine;
    }

    /**
     * Método modificar del atributo engine.
     * @param engine
     */
    public void setEngine(Boolean engine) {
        this.engine = engine;
    }
}
