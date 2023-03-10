package Tarea_7;

public class Balon {
    private String marca;
    private String modelo;
    private int tamaño;

    public Balon() {
    }

    public Balon(String marca, String modelo, int tamaño) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }

    public void inflar() {
        System.out.println("Inflando el balón...");
        this.tamaño++;
    }

    public boolean esParaFutbol() {
        return this.modelo.toLowerCase().equals("futbol");
    }
}
