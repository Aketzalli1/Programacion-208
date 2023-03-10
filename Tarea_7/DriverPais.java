package Tarea_7;

public class DriverPais {
    public static void main(String[] args) {
        Pais portugal = new Pais("Portugal", 504718, "Lisboa",5546564);
        Pais rusia = new Pais("Rusia", 11980000, "Moscú",41456564);
        Pais alemania = new Pais("Alemania", 3650000, "Berlín",61816845);


        System.out.println(portugal);
        System.out.println(rusia.esCapital("Alemania"));
        System.out.println("La densidad de poblacion de alemania es :"+alemania.densidadPoblación());
    }
}
