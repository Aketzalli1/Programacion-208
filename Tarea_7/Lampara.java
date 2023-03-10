package Tarea_7;

public class Lampara {
    private String marca;
    private String modelo;
    private int watts;

    public Lampara() {
    }

    public Lampara(String marca, String modelo, int watts) {
        this.marca = marca;
        this.modelo = modelo;
        this.watts = watts;
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

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", watts=" + watts +
                '}';
    }
    public void encender() {
        System.out.println("La lámpara está encendida.");
    }

    public void apagar() {
        System.out.println("La lámpara está apagada.");
    }
}
