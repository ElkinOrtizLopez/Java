package EjerciciosEnClasePDF;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        float valor = 0;
        System.out.println("----Menú----");
        System.out.println("Escoge la opción que deseas realizar");
        System.out.println("1- Celsius/Fahrenheit");
        System.out.println("2- km/millas");
        opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingresa la temperatura en °C");
                valor = scanner.nextFloat();
                System.out.println(((valor * 1.8)+32)+"°F");
                break;
            case 2:
                System.out.println("Ingresa la distancia en Km");
                valor = scanner.nextFloat();
                System.out.println(valor * 0.621371+"mi");
                break;
            default:
                System.out.println("Elija una opción del menú");
        }
        scanner.close();
    }
}
