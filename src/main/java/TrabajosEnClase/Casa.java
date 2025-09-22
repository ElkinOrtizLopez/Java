package TrabajosEnClase;

public class Casa {
    private String color;
    private String direccion;
    private int pisos;
    private int habitaciones;
    private int balcones;
    private int ventanas;
    private boolean terraza;

    Casa() {}

    Casa(String color, String direccion, int pisos, int habitaciones, int balcones, int ventanas, boolean terraza){
        this.color = color;
        this.direccion = direccion;
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.balcones = balcones;
        this.ventanas = ventanas;
        this.terraza = terraza;
    }

    Casa(String color, int habitaciones){
        this.color = color;
        this.habitaciones = habitaciones;
    }
    public boolean terminada(){
        return true;
    }

  /*  @Override
    public String toString() {
        return "Casa{" +
                "color='" + color + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pisos=" + pisos +
                ", habitaciones=" + habitaciones +
                ", balcones=" + balcones +
                ", ventanas=" + ventanas +
                ", terraza=" + terraza +
                '}';
    }*/

    public String pintada(){
        return "La casa esta recién pintada";
    }

    public boolean isTerraza() {
        return terraza;
    }

   /* public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }*/

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public int getBalcones() {
        return balcones;
    }

    public void setBalcones(int balcones) {
        this.balcones = balcones;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getPisos() {
        return pisos;
    }

   /* public void setPisos(int pisos) {
        this.pisos = pisos;
    }*/

    public String getDireccion() {
        return direccion;
    }

   /* public void setDireccion(String direccion) {
        this.direccion = direccion;
    }*/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
