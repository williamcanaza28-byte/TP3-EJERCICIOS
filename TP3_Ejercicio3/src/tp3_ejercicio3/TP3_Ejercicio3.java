package tp3_ejercicio3;
import java.util.Scanner;
public class TP3_Ejercicio3 {
    //Version con for
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
/*    
    //Version con while
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int N = sc.nextInt();
        int i = N;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
    //Version con do-while
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int N = sc.nextInt();
        int i = N;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
    }
}
*/