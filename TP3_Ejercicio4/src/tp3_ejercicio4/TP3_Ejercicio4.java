package tp3_ejercicio4;
import java.util.Scanner;
public class TP3_Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        // Pedir números hasta que sean distintos
        do {
            System.out.print("Ingrese el primer numero: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = sc.nextInt();
            if (num1 == num2) {
                System.out.println("Los numeros son iguales, intente de nuevo.");
            }
        } while (num1 == num2);
        // Determinar menor y mayor
        int menor, mayor;
        if (num1 < num2) {
            menor = num1;
            mayor = num2;
        } else {
            menor = num2;
            mayor = num1;
        }
        // Mostrar desde menor hasta mayor
        System.out.println("Numeros desde el menor hasta el mayor:");
        int i = menor;
        while (i <= mayor) {
            System.out.println(i);
            i++;
        }
    }
}