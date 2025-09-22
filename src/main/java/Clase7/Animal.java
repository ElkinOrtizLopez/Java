package Clase7;

public class Animal {
    String nombre;

    public Animal(String nombre){
        this.nombre=nombre;
    }

    public void hacerSonido(){
        System.out.println("Sonido de animal");
    }

    public void caminar(){
        System.out.println("Animales Caminando");
    }
}
