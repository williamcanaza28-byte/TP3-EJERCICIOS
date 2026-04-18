package tp3_ejercicio10;
import java.util.Scanner;
public class TP3_Ejercicio10 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        int meses;
        int precio;
        int interes;
        System.out.println("Ingrese el precio:");
        precio = teclado.nextInt();
        System.out.println("ingrese el plazo:");
        meses = teclado.nextInt();
        for(int i= 1; i<=meses; ++i){
            System.out.println("La cuota "+ i +" es de "+ precio+ " pesos");
            precio = precio * 2;
    }
    } 
}
