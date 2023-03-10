package Tarea_7;

public class DriverGiroscopio {
    public static void main(String[] args) {
        Giroscopio giroscopio1 = new Giroscopio("Modelo1", 50, 10);
        Giroscopio giroscopio2 = new Giroscopio("Modelo2", 150, 5);

        System.out.println("Giróscopio1: " + giroscopio1);
        System.out.println("Giróscopio2: " + giroscopio2);

        System.out.println("El giroscopio1 es caro? " + giroscopio1.esCaro());
        System.out.println("El giroscopio2 es caro? " + giroscopio2.esCaro());

        System.out.println("El total del giroscopio1 es: " + giroscopio1.calcularTotal());
        System.out.println("El total del giroscopio2 es: " + giroscopio2.calcularTotal());
    }
}
