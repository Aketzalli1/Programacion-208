package Tarea_9;

public class Taxi extends Automovil{
    private String colores;
    private String compañia;
    private int asientos;

    public Taxi() {
    }

    public Taxi(String colores, String compañia, int asientos) {
        this.colores = colores;
        this.compañia = compañia;
        this.asientos = asientos;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "colores='" + colores + '\'' +
                ", compañia='" + compañia + '\'' +
                ", asientos=" + asientos +
                '}';
    }
    public void pasajero(){
        System.out.println("Se esta recogiendo a un cliente");
    }
    public void ruta(){
        System.out.println("El taxi esta haciendo su ruta");
    }

    @Override
    public void gasolina() {
        super.gasolina();
    }

    @Override
    public void encendid() {
        super.encendid();
    }

    @Override
    public void movimiento() {
        super.movimiento();
    }

    @Override
    public void velocidad() {
        super.velocidad();
    }
}
