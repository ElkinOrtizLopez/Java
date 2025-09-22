package EjerciciosEnClasePDF;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        System.out.println("Digite su edad");
        edad = scanner.nextInt();

        if (edad<12){
            System.out.println("Usted es un niño");
        } else if (edad <18 && edad > 12) {
            System.out.println("Usted es adolescente");
        } else if (edad>=18 && edad<70) {
            System.out.println("Usted es adulto");
        } else if (edad>70) {
            System.out.println("Usted es adulto mayor");
        }
        scanner.close();
    }
}
