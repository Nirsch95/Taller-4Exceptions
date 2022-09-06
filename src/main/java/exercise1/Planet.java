package exercise1;
/**
 * Representa el codigo que representa el objeto Planet
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Planet {
    /**
     * Atributo para darle un id al planeta creado.
     */
    private Integer id;
    /**
     * Atributo para darle un nombre al planeta creado.
     */
    private String name;
    /**
     * Atributo para darle una masa al planeta creado.
     */
    private BigDecimal mass;
    /**
     * Atributo para darle un diametro al planeta creado.
     */
    private Float diameter;
    /**
     * Atributo para darle una distancia del sol al planeta creado.
     */
    private BigDecimal distanceSun;

    /**
     * Constructor: Permite crear una instancia de la clase Planet.
     *
     * @param id
     * @param name
     * @param mass
     * @param diameter
     * @param distanceSun
     */
    public Planet(Integer id, String name, BigDecimal mass, Float diameter, BigDecimal distanceSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
    }

    /**
     * Método que permite calcular la fuerza de atracción gravitacional generada por los planetas seleccionados.
     *
     * @param planet1
     * @param planet2
     * @return
     */
    public static BigDecimal gravitationalForce(Planet planet1, Planet planet2) {
        BigDecimal G = new BigDecimal("6.67408E-11");
        BigDecimal m1 = planet1.getMass();
        BigDecimal m2 = planet2.getMass();
        BigDecimal d = planet1.getDistanceSun().subtract(planet2.getDistanceSun());

        BigDecimal F = G.multiply((m1.multiply(m2))).divide(d.pow(2), 2, RoundingMode.HALF_EVEN);
        return F;
    }

    /**
     * Método para acceder al atributo id.
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * Método modificador del atributo id.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Método para acceder al atributo name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Método modificador del atributo name.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para acceder al atributo mass.
     * @return
     */
    public BigDecimal getMass() {
        return mass;
    }

    /**
     * Método modificador del atributo mass.
     * @param mass
     */
    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    /**
     * Método para acceder al atributo diameter.
     * @return
     */
    public Float getDiameter() {
        return diameter;
    }

    /**
     * Método modificador del atributo diameter.
     * @param diameter
     */
    public void setDiameter(Float diameter) {
        this.diameter = diameter;
    }

    /**
     * Método para acceder al atributo distanceSun.
     * @return
     */
    public BigDecimal getDistanceSun() {
        return distanceSun;
    }

    /**
     * Método modificador del atributo distanceSun.
     * @param distanceSun
     */
    public void setDistanceSun(BigDecimal distanceSun) {
        this.distanceSun = distanceSun;
    }

    /**
     * Sobreescribe el método toString para mostrar los planetas de la manera deseada
     * @return
     */
    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mass=" + mass +
                ", diameter=" + diameter +
                ", distanceSun=" + distanceSun +
                '}';
    }
}
