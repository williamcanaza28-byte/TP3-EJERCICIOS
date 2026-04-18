package tp3_ejercicio2;
import java.util.Scanner;
public class TP3_Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= N);
    }
}
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i++;
        }
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
*/