package Tarea_6;

public class MainPersonas {
    public static void main(String[] args) {
        Personas persona1 = new Personas(18, "Roberto", 1.65, 74.5, "Masculino");
        Personas persona2 = new Personas(17,"Monica");


        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        persona1.comer();
        persona1.tomar();
        persona1.bañar();

        persona1.comer1();
        persona1.tomar1();
        persona1.bañar1();

    }
}
