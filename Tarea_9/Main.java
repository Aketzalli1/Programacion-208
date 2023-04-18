package Tarea_9;

public class Main {
    public static void main(String[] args) {
        Vehiculo vei= new Vehiculo("Motor","Trasera","Metal con aluminio");
        System.out.println(vei);
        vei.movimiento();
        Automovil au= new Automovil("Motor de gasolina",24.5,"Mediano");
        System.out.println(au);
        au.movimiento();
        au.gasolina();
        Taxi taxi1= new Taxi("Amarillo y negro","Taxis Don paco",5);
        System.out.println(taxi1);
        taxi1.gasolina();
        taxi1.movimiento();
        taxi1.ruta();
    }
}
