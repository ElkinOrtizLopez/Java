package EjerciciosEnClasePDF;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite un número");
        num = scanner.nextInt();

        if (num > 0){
            System.out.println("El número es positivo.");
        } else if (num < 0){
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
        scanner.close();
    }

}
