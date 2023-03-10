package Tarea_7;

public class DriverComputadora {
    public static void main(String[] args) {
        Computadora miComputadora = new Computadora("HP", "Pavilion", 8);
        System.out.println(miComputadora);

        miComputadora.encender();
        miComputadora.apagar();
    }
}
