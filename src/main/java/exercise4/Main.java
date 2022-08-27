package exercise4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Vehicule> vehicules = new ArrayList<>();
        String plate, registration, displacement;
        int numPass,intCrew, numberWheels;
        boolean crew;
        Date date;
        do{
        System.out.println("Ingrese placa");
        plate = input.next();
        System.out.println("Ingrese número de pasajeros");
        numPass = input.nextInt();
        System.out.println("¿Lleva tripulación?");
        System.out.println("(1) Verdadero (0) Falso");
        intCrew = input.nextInt();
        if (intCrew == 1){
            crew = true;
        }else{
            crew = false;
        }
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
        Vehicule vehicule = new Vehicule(plate,numPass,crew,numberWheels,date,displacement);
        vehicules.add(vehicule);
        }while(vehicules.size()<10);
        System.out.println(vehicules);
    }
}
