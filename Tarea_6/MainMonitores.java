package Tarea_6;

public class MainMonitores {
    public static void main(String[] args) {
        Monitores monitor1 = new Monitores(14, "XIAMO", "Y6J8GK7", "LED", 4500.0);
        Monitores monitor2 = new Monitores(27, "LG");

        System.out.println(monitor1);
        monitor1.encender();
        System.out.println(monitor2);
        monitor2.apagar();
        monitor1.proyectar();
        monitor2.proyectar();
    }}





