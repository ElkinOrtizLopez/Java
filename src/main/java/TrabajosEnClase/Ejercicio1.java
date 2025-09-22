package TrabajosEnClase;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su valor en pesos (COP)");
        float pesos = scanner.nextFloat();
        System.out.println("Valor en dolares "+pesos/(3950));
    }
}
