package tp3_ejercicio9;
import java.util.Scanner;
public class TP3_Ejercicio9 {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a;
    int b;
    int resultado = 1;
    System.out.println("Ingrese el numero exponente:");
    a =teclado.nextInt();

    System.out.println("Ingrese el numero base:");
    b =teclado.nextInt();
    for(int c= 1;c<b;c++){
        resultado = resultado * b;
        System.out.println("El valor es:"+resultado);
    }
  } 
}
  
    
