package Clase6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        String[] nombres = new String[10];
        System.out.println(nombres.length);


        nombres[0]="Elkin";
        Arrays.stream(nombres).forEach(System.out::println);
        System.out.println("----------------");
        List<String> nombreLista = new ArrayList<>();
        nombreLista.add("Elkin");
        nombreLista.forEach(System.out::println);

        Long NombresContado=nombreLista.stream().filter(n -> n.contains("E")).count();
        System.out.println(NombresContado);
    }
}
