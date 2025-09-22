package EjerciciosEnClasePDF;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        int num3 = 0;
        System.out.println("Digite un número");
        num = scanner.nextInt();
        System.out.println("Digite un número");
        num2 = scanner.nextInt();
        System.out.println("Digite un número");
        num3 = scanner.nextInt();

        if (num>num2 && num>num3){
            System.out.println("El numero mayor es "+num);
        } else if (num2>num && num2>num3){
            System.out.println("El numero mayor es "+num2);
        } else {
            System.out.println("El numero mayor es "+num3);
        }
        scanner.close();
    }
}
