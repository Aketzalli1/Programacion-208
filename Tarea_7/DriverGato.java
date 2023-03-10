package Tarea_7;

public class DriverGato {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Persa", "Grande", "Verdes");
        Gato gato2 = new Gato("Siames", "Mediano", "Azules");
        System.out.println(gato1.toString());
        gato1.rodar();
        System.out.println(gato2.toString());
        gato2.ronronear();
    }
}
