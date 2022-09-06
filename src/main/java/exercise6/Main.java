package exercise6;
/**
 * Representa el codigo principal de ejecución
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        Vector<Integer> vector = new Vector<>();
        System.out.println("Digite el número que desea agregar");
        try {
            do {
                num = input.nextInt();
                vector.addElement(num);
            } while ((vector.size() == 1) || (num != vector.elementAt(vector.size() - 2)));
            System.out.println(vector);
        } catch (InputMismatchException match) {
            System.out.println("No recibo datos de tipo caracter");
        }
    }
}
