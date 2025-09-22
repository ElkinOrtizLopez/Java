package Clase3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //opcion 1 null
        //Scanner scanner = null;
        //opcion 2 inicializar el objeto
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Imp..."+nombre);

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("Imp..."+edad);

        scanner.close();
    }

}
