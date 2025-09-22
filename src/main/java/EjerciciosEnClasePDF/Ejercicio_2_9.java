package EjerciciosEnClasePDF;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_2_9 {

    public static void main(String[] args) {

        int opcion;
        Long numero;

        Scanner scanner = new Scanner(System.in);

        List<Long> listaNumeros = new ArrayList<>();
        do {
            System.out.println("---Lista de numeros---");
            System.out.println("Presione");
            System.out.println("1 para agregar elementos a la lista");
            System.out.println("0 para salir");
            opcion= scanner.nextInt();

            int opcionAgregar;

            switch (opcion) {
                case 1:
                    do {
                        System.out.println();
                        System.out.println("Ingrese el numero a agregar");
                        numero = scanner.nextLong();
                        listaNumeros.add(numero);


                        for (int i = 1; i < listaNumeros.size(); i++) {
                            long valor = listaNumeros.get(i);
                            int pos = i;

                            while (pos > 0 && valor < listaNumeros.get(pos - 1)) {
                                listaNumeros.set(pos, listaNumeros.get(pos - 1));
                                pos--;
                            }
                            listaNumeros.set(pos, valor);
                        }

                        System.out.println("Elementos de la lista ordenada:");
                        for (int i = 0; i < listaNumeros.size(); i++) {
                            System.out.print(listaNumeros.get(i)+" ");
                        }
                        System.out.println(" ");
                        System.out.println("Desea agregar otro elemento a la lista, presione");
                        System.out.println("1 si");
                        System.out.println("0 no");
                        opcionAgregar = scanner.nextInt();





                    } while (opcionAgregar != 0 && opcionAgregar > 0 && opcionAgregar < 1 );
                    break;
                case 0:
                    System.out.println("Vuelva pronto");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida, vuelva pronto");
            }

        } while (opcion != 0);


    }
}
