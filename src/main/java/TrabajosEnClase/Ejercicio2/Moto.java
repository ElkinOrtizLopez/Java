package TrabajosEnClase.Ejercicio2;

public class Moto extends Vehiculo{

    public Moto(String nombre){
        super(nombre);
    }

    @Override
    public void marca() {
        System.out.println("Honda");
    }
}
