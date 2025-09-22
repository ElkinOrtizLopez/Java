package TrabajosEnClase.Ejercicio2;

public class Carro extends Vehiculo{

    public Carro(String nombre){
        super(nombre);
    }

    @Override
    public void marca() {
        System.out.println("Chevrolet");
    }
}
