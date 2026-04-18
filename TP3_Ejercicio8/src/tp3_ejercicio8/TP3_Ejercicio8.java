package tp3_ejercicio8;
import java.util.Scanner;
public class TP3_Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        do {
            System.out.print("Ingrese un caracter: ");
            letra = sc.next().charAt(0);
            if (letra != '0') {
                // Convertir a minúscula para simplificar la comparación
                char l = Character.toLowerCase(letra);
                if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                    System.out.println("Vocal");
                } else {
                    System.out.println("No vocal");
                }
            }
        } while (letra != '0');
        System.out.println("Programa finalizado.");
    }
}