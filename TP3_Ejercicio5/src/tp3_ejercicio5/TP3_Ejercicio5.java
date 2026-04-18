package tp3_ejercicio5;
import java.util.Scanner;
public class TP3_Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        // Validar que A sea menor que B
        do {
            System.out.print("Ingrese el valor de A: ");
            A = sc.nextInt();

            System.out.print("Ingrese el valor de B: ");
            B = sc.nextInt();

            if (A >= B) {
                System.out.println("Error: A debe ser menor que B. Intente nuevamente.");
            }
        } while (A >= B);
        // Mostrar números pares entre A y B
        System.out.println("Números pares entre " + A + " y " + B + ":");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}