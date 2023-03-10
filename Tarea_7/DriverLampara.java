package Tarea_7;

public class DriverLampara {
    public static void main(String[] args) {
    Lampara lamp1 = new Lampara("Philips", "3GF3", 60);
    Lampara lamp2 = new Lampara("Samsumg","ASF3",35);
        System.out.println(lamp1);
        lamp1.encender();
        System.out.println(lamp2);
        lamp2.apagar();

}}
