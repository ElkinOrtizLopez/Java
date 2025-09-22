package Clase5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su edad");
        int edad = 0;
        edad = scanner.nextInt();


        if (edad>=18 && edad < 88){
            System.out.println("Puede entrar al bar");
        }else
            System.out.println("No puede entrar al bar");

        scanner.close();*/
        //sout para print
        System.out.println("----------------------");
        int diaDelaSemana = 7;

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
                System.out.println("Es otro dia");
        }
    }
}
