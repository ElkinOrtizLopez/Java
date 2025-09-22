package EjerciciosEnClasePDF;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        double saldo = 1000;
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println("---Presione---");
            System.out.println("1 para consultar saldo");
            System.out.println("2 para retirar");
            System.out.println("3 para depositar");
            System.out.println("0 para salir");
            opcion= scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Su saldo es: $"+saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea retirar");
                    saldo = saldo - scanner.nextDouble();
                    break;
                case 3:
                    System.out.println("Ingrese el valor que desea depositar");
                    saldo = saldo + scanner.nextDouble();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestro servicio");
                    break;
                default:
                    System.out.println("Presione una opcion valida");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
