package TrabajosEnClase.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Medio de transporte");
        Moto moto = new Moto("Cb 110");
        Carro carro = new Carro("Spark");


        System.out.println(carro.nombre);
        carro.marca();
    }
}
