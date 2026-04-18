package tp3_ejercicio7;
import java.util.Scanner;
public class TP3_Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double millas;
        do {
            System.out.print("Ingrese millas: ");
            millas = sc.nextDouble();
            if (millas != 0) {
                double km = millas * 1.6093;
                System.out.println("Equivalente en kilometros: " + km);
            }
        } while (millas != 0);
        System.out.println("Programa finalizado.");
    }
}