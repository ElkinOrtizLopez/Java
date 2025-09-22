package EjerciciosEnClasePDF;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_2_2 {

    public static void main(String[] args) {

        String nombreProducto;
        int opcion;
        Scanner scanner = new Scanner(System.in);
        List<String> listaProducto = new ArrayList<>();

        do {
            System.out.println("---Lista de compras---");
            System.out.println("Presione");
            System.out.println("1 para agregar elementos a la lista");
            System.out.println("2 para mostrar la lista");
            System.out.println("3 para eliminar elementos especificos de la lista");
            System.out.println("0 para salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int opcionAgregar;
                    do {
                        System.out.println("Ingrese el nombre del elemento");
                        nombreProducto = scanner.next();
                        listaProducto.add(nombreProducto);
                        System.out.println("Desea agregar otro elemento a la lista, presione");
                        System.out.println("1 si");
                        System.out.println("0 no");
                        opcionAgregar = scanner.nextInt();
                    } while (opcionAgregar != 0);
                    break;
                case 2:
                    System.out.println("Elementos de la lista:");
                    for (int i = 0; i < listaProducto.size(); i++) {
                        System.out.println(listaProducto.get(i));
                    }
                    break;
                case 3:
                    if (listaProducto.isEmpty()) {
                        System.out.println("La lista está vacía, no hay elementos para eliminar.");
                    } else {
                        System.out.println("Elementos de la lista:");
                        for (int i = 0; i < listaProducto.size(); i++) {
                            System.out.println((i+1) + ". " + listaProducto.get(i));
                        }

                        System.out.println("Ingrese el número del elemento que desea eliminar:");
                        int indice = scanner.nextInt();

                        if (indice > 0 && indice <= listaProducto.size()) {
                            String eliminado = listaProducto.remove(indice - 1);
                            System.out.println("Se eliminó: " + eliminado);
                        } else {
                            System.out.println("Número inválido. No se eliminó nada.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Vuelva pronto");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }


        } while (opcion != 0);



        scanner.close();
    }
}
