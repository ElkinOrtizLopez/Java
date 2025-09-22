package EjerciciosEnClasePDF;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        String operador = "";

        System.out.println("Digita el primer número");
        num1 = scanner.nextFloat();
        System.out.println("Digita el segundo número");
        num2 = scanner.nextFloat();
        System.out.println("Que operacion deseas realizar (+,-,*,/)");
        operador = scanner.next();

        switch (operador){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Por favor escoja un operador valido");
        }
        scanner.close();
    }
}
