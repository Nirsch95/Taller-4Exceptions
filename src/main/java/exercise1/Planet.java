package exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Planet {
    private Integer id;
    private String name;
    private BigDecimal mass;
    private Float diameter;
    private BigDecimal distanceSun;

    public Planet(Integer id, String name, BigDecimal mass, Float diameter, BigDecimal distanceSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    public Float getDiameter() {
        return diameter;
    }

    public void setDiameter(Float diameter) {
        this.diameter = diameter;
    }

    public BigDecimal getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(BigDecimal distanceSun) {
        this.distanceSun = distanceSun;
    }

    public static BigDecimal gravitationalForce (Planet planet1, Planet planet2){
        BigDecimal G = new BigDecimal("6.67408E-11");
        BigDecimal m1 = planet1.getMass();
        BigDecimal m2 = planet2.getMass();
        BigDecimal d = planet1.getDistanceSun().subtract(planet2.getDistanceSun());

        BigDecimal F = G.multiply((m1.multiply(m2))).divide(d.pow(2),2, RoundingMode.HALF_EVEN);
        return F;
    }

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
