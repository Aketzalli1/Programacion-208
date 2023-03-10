package Tarea_7;

public class Cubo {
    private int numPiezas;
    private String marca;
    private String colorFondo;

    public Cubo() {
    }

    public Cubo(int numPiezas, String marca, String colorFondo) {
        this.numPiezas = numPiezas;
        this.marca = marca;
        this.colorFondo = colorFondo;
    }

    public int getNumPiezas() {
        return numPiezas;
    }

    public void setNumPiezas(int numPiezas) {
        this.numPiezas = numPiezas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "numPiezas=" + numPiezas +
                ", marca='" + marca + '\'' +
                ", colorFondo='" + colorFondo + '\'' +
                '}';
    }
    public boolean estaCompleto() {

        return false;
    }

    public void girarCara(int numCara) {
    }

}
