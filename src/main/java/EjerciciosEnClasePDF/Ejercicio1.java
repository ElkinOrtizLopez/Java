package EjerciciosEnClasePDF;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite un número");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número ingresado es par.");
        }else {
            System.out.println("El número ingresado es impar.");
        }
        scanner.close();
    }


}
