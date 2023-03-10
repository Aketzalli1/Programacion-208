package Tarea_6;

public class MainCelular {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Iphone",4,64,"Bionic14");
        Celular celular2 = new Celular("Xiaomi",4);
        System.out.println(celular1);
        celular1.encendido1();
        celular2.apagado();
        System.out.println(celular2);
        celular2.presionando();
        celular2.encendido();
        celular2.apagado1();


    }
}