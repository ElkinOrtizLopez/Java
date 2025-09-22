package EjerciciosEnClasePDF;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;
        System.out.println("Ingresa una nota entre 0-100");
        nota = scanner.nextInt();

        if (nota > 95 && nota <= 100){
            System.out.println("Su calificación es A");//A96-100 B95 C80 D60 E40 F20
        } else if (nota <= 95 && nota > 80){
            System.out.println("Su calificación es B");
        } else if (nota <= 80 && nota > 60){
            System.out.println("Su calificación es C");
        } else if (nota <= 60 && nota > 40){
            System.out.println("Su calificacion es D");
        } else if (nota <= 40 && nota > 20){
            System.out.println("Su calificacion es E");
        } else if (nota <= 20 && nota > 0){
            System.out.println("Su calificacion es F");
        } else {
            System.out.println("Ingrese una nota entre 0-100");
        }
        scanner.close();
    }
}
