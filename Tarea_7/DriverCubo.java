package Tarea_7;

public class DriverCubo {
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(32,"Xiaomi","blanco");
        Cubo cubo2 = new Cubo(15, "Onwang", "Negro");

        cubo1.setNumPiezas(20);
        cubo1.setMarca("GAN");
        cubo1.setColorFondo("amarillo");

        System.out.println(cubo1);
        System.out.println(cubo2);

        cubo1.girarCara(3);

        if (cubo1.estaCompleto()) {
            System.out.println("¡Cubo completo!");
        } else {
            System.out.println("El cubo no está completo aún");
        }
    }
}
