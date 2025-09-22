package TrabajosEnClase;

public class Main {

    public static void main(String[] args) {

        int direccion = 1;
        Casa casa = new Casa("Blanco","Cra3#1-5",2,3,1,4,true);
        casa.setColor("Beige");
        System.out.println(casa.getColor()+" "+casa.getHabitaciones());
        //System.out.println(casa.toString());
        System.out.println("----------------");
        Casa casa2 = new Casa("Verde",5);
        System.out.println(casa2.getColor()+" "+casa2.getHabitaciones());
        System.out.println("----------------");

    }
}
