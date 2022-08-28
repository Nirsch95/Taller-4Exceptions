package exercise1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

import static exercise1.Planet.gravitationalForce;

public class Main {
    public static int indexPlanet(ArrayList<Planet> planets, String planet) {
        int index = 0;
        for (int i = 0; i < planets.size(); i++) {
            if (planets.get(i).getName().equals(planet)) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet mercury = new Planet(1, "Mercurio", new BigDecimal("3.302E23"), 4880f, new BigDecimal("5.791E7"));
        planets.add(mercury);
        Planet venus = new Planet(2, "Venus", new BigDecimal("4.867E24"), 12104f, new BigDecimal("1.082E8"));
        planets.add(venus);
        Planet earth = new Planet(3, "Tierra", new BigDecimal("5.972E24"), 12756f, new BigDecimal("1.496E8"));
        planets.add(earth);
        Planet mars = new Planet(4, "Marte", new BigDecimal("6.39E23"), 6794f, new BigDecimal("2.2794E8"));
        planets.add(mars);
        Planet jupiter = new Planet(5, "Jupiter", new BigDecimal("1.899E27"), 142984f, new BigDecimal("7.7833E8"));
        planets.add(jupiter);
        Planet saturn = new Planet(6, "Saturno", new BigDecimal("5.683E26"), 108728f, new BigDecimal("1.4294E9"));
        planets.add(saturn);
        Planet uranus = new Planet(7, "Urano", new BigDecimal("8.681E25"), 51118f, new BigDecimal("2.87099E9"));
        planets.add(uranus);
        Planet neptune = new Planet(8, "Neptuno", new BigDecimal("1.024E26"), 49532f, new BigDecimal("4.5043E9"));
        planets.add(neptune);
        Planet pluton = new Planet(9, "Plutón", new BigDecimal("1.29E22"), 2320f, new BigDecimal("5.91352E9"));
        planets.add(pluton);

        System.out.println("Favor ingresar el primer planeta");
        String planet1 = input.next();
        System.out.println("Favor ingresar el segundo planeta");
        String planet2 = input.next();
        int index, index2;
        index = indexPlanet(planets, planet1);
        index2 = indexPlanet(planets, planet2);
        try {
            BigDecimal force = gravitationalForce(planets.get(index), planets.get(index2));
            System.out.println("La fuerza de atracción gravitacional es de: " + force + " Nw");
        } catch (Exception exception) {
            System.out.println("La fuerza de atracción gravitacional de un cuerpo sobre el mismo es 0");
        }


    }
}
