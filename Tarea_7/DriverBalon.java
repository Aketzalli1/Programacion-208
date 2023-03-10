package Tarea_7;

public class DriverBalon {
    public static void main(String[] args) {
    Balon balon1 = new Balon("NewYersc", "Basquetbol", 3);
        System.out.println(balon1.toString());
        System.out.println(balon1.esParaFutbol());
        balon1.inflar();
}
}
