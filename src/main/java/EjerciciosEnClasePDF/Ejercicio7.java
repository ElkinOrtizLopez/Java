package EjerciciosEnClasePDF;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int diaDelaSemana = 0;
        System.out.println("Ingrese un número que representa un dia de la semana 1-lunes...");
        diaDelaSemana = scanner.nextInt();
        switch (diaDelaSemana){
            case 1:
                System.out.println("Es Lunes");
                break;//para que no revise mas
            case 2:
                System.out.println("Es Martes");
                break;//para que no revise mas
            case 3:
                System.out.println("Es Miercoles");
                break;//para que no revise mas
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("Una semana tiene 7 dias ingrese un numero entre 1 y 7");
        }
        scanner.close();
    }
}
