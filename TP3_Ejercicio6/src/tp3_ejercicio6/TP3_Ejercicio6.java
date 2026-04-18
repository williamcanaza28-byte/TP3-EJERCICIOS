package tp3_ejercicio6;
import java.util.Scanner;
public class TP3_Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        // Validación de datos
        do {
            System.out.print("Ingrese el valor de N : ");
            N = sc.nextInt();

            System.out.print("Ingrese el valor de M : ");
            M = sc.nextInt();

            if (N <= 0 || M <= 0) {
                System.out.println("Error: ambos números deben ser positivos.");
            } else if (N >= M) {
                System.out.println("Error: N debe ser menor que M.");
            }
        } while (N <= 0 || M <= 0 || N >= M);
        // Mostrar múltiplos de N desde 1 hasta M
        System.out.println("Múltiplos de " + N + " hasta " + M + ":");
        for (int i = 1; i <= M; i++) {
            if (i % N == 0) {
                System.out.println(i);
            }
        }
    }
}