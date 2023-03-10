package Tarea_7;

public class Pais {
    private String nombre;


    private int población;


    private String capital;
    private double superficie;

    public Pais() {
    }

    public Pais(String nombre, int población, String capital, double superficie) {
        this.nombre = nombre;
        this.población = población;
        this.capital = capital;
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblación() {
        return población;
    }

    public void setPoblación(int población) {
        this.población = población;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean esCapital(String ciudad) {


        return ciudad.equals(capital);
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", población=" + población +
                ", capital='" + capital + '\'' +
                ", superficie=" + superficie +
                '}';
    }

    public double densidadPoblación() {
        if (superficie == 0) {


            return 0;
        } else {
            return población/superficie;
        }
    }
}
