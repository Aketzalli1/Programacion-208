package Tarea_7;

public class Computadora {
    private String marca;
    private String modelo;
    private int ramGB;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, int ramGB) {
        this.marca = marca;
        this.modelo = modelo;
        this.ramGB = ramGB;
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

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ramGB=" + ramGB +
                '}';
    }
    public void encender() {
        System.out.println("Encendiendo la computadora...");
    }

    public void apagar() {
        System.out.println("Apagando la computadora...");
    }
}
