package exercise5;


import exercise4.Vehicule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Vehicule> vehicules = new ArrayList<>();
        String plate, registration, displacement;
        int numPass, intCrew, numberWheels, option, intBool;
        Double height;
        boolean crew, bool;
        Date date;
        do {
            System.out.println("""
                    Ingrese el tipo de vehiculo que desea agregar
                    1. Carro
                    2. Moto
                    3. Camión
                    4. Bicicleta
                    5. Lancha
                    """);
            option = input.nextInt();
            System.out.println("Ingrese placa");
            plate = input.next();
            System.out.println("Ingrese número de pasajeros");
            numPass = input.nextInt();
            System.out.println("¿Lleva tripulación?");
            System.out.println("(1) Verdadero (0) Falso");
            intCrew = input.nextInt();
            crew = intCrew == 1;
            System.out.println("Ingrese número de ruedas");
            numberWheels = input.nextInt();
            System.out.println("Ingrese fecha de registro");
            registration = input.next();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = df.parse(registration);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Ingrese forma de desplazamiento");
            displacement = input.next();
            switch (option) {
                case 1:
                    System.out.println("""
                            ¿Cuantas puertas tiene?
                            (1) 5 (0) 3""");
                    intBool = input.nextInt();
                    bool = intBool == 1;
                    Car car = new Car(plate, numPass, crew, numberWheels, date, displacement, bool);
                    vehicules.add(car);
                    break;
                case 2:
                    System.out.println("""
                            ¿Cuantas focos tiene?
                            (1) 2 (0) 1""");
                    intBool = input.nextInt();
                    bool = intBool == 1;
                    Moto moto = new Moto(plate, numPass, crew, numberWheels, date, displacement, bool);
                    vehicules.add(moto);
                    break;
                case 3:
                    System.out.println("¿Cuanta altura tiene?");
                    height = input.nextDouble();
                    Truck truck = new Truck(plate, numPass, crew, numberWheels, date, displacement, height);
                    vehicules.add(truck);
                    break;
                case 4:
                    System.out.println("""
                            ¿Tiene silla auxiliar?
                            (1) Si (0) No""");
                    intBool = input.nextInt();
                    bool = intBool == 1;
                    Bicycle bicycle = new Bicycle(plate, numPass, crew, numberWheels, date, displacement, bool);
                    vehicules.add(bicycle);
                    break;
                case 5:
                    System.out.println("""
                            ¿Tiene motor?
                            (1) Si (0) No""");
                    intBool = input.nextInt();
                    bool = intBool == 1;
                    Boat boat = new Boat(plate, numPass, crew, numberWheels, date, displacement, bool);
                    vehicules.add(boat);
                    break;
                default:
                    System.out.println("Esa opción no esta disponible");
            }

        } while (vehicules.size() < 10);
        System.out.println(vehicules);
    }
}
