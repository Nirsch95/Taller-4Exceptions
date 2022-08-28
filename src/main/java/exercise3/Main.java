package exercise3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static ArrayList<Double> bubble(ArrayList<Double> random) {
        int i, j;
        double aux;
        for (i = 0; i < random.size() - 1; i++) {
            for (j = 0; j < random.size() - i - 1; j++) {
                if (random.get(j + 1) < random.get(j)) {
                    aux = random.get(j + 1);
                    random.set(j + 1, random.get(j));
                    random.set(j, aux);
                }
            }
        }
        return random;
    }

    private static int partition(ArrayList<Double> array, int left, int right) {
        Double pivot = array.get(left);
        while (true) {
            while (array.get(left) < pivot) {
                left++;
            }
            while (array.get(right) > pivot) {
                right--;
            }
            if (left >= right) {
                return right;
            } else {
                Double temporal = array.get(left);
                array.set(left, array.get(right));
                array.set(right, temporal);
                left++;
                right--;
            }
        }
    }

    public static ArrayList<Double> quickSort(ArrayList<Double> random, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(random, left, right);
            quickSort(random, left, partitionIndex);
            quickSort(random, partitionIndex + 1, right);
        }
        return random;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> random = new ArrayList<>();
        int amount, option;
        try {
            System.out.println("Ingrese la cantidad de números aleatorios que desea usar");
            amount = input.nextInt();
            System.out.println("""
                    ¿Por cual metodo desea ordenarlo?
                    1. Algoritmo de Burbuja
                    2. Quick Sort
                    """);
            option = input.nextInt();


            for (int i = 0; i < amount; i++) {
                random.add((Math.random() * 20) + 1);
            }
            switch (option) {
                case 1:
                    System.out.println(bubble(random));
                    break;
                case 2:
                    System.out.println(quickSort(random, 0, amount - 1));
                    break;
                default:
                    System.out.println("Esa opción no esta disponible");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Error: No recibo tipo de dato caracter");
        }
    }
}
