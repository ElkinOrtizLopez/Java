package Clase6;

import java.util.ArrayList;
import java.util.List;

public class MainCiclos {

    public static void main(String[] args) {

        int contador = 0;

        while (contador<=5){
            System.out.println(contador);
            contador++;
        }

        contador = 0;
        //Do-while acordate primero hace y despues valida
        System.out.println("---------");
        do {
            System.out.println(contador);
            contador++;
        } while (contador<=5);

        //programas empresariales recorren rangos fijos

        //Creo la lista
        List<String> nombreLista = new ArrayList<>();
        nombreLista.add("Elkin");
        nombreLista.add("Armando");
        nombreLista.add("Karen");
        nombreLista.add("Daniela");

        //For clásico mas largo y especifico
        for (int i = 0; i < nombreLista.size(); i++){
            System.out.println(nombreLista.get(i));
        }
        System.out.println("---------");
        //for mas sencillo para recorrer toda una estuctura
        for (String tmp:nombreLista){
            System.out.println(tmp);
        }


    }
}
