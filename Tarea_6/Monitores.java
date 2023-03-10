package Tarea_6;

public class Monitores {
    private double pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;
    private boolean encendido;

    public Monitores(double pulgadas, String marca, String modelo, String tipo, double precio) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Monitores(double pulgadas, String marca) {
        this.pulgadas = pulgadas;
        this.marca = marca;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tarea_6.Monitores{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void encender() {
        encendido = true;
        System.out.println("El monitor está encendiéndose");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El monitor está apagándose");
    }

    public void proyectar() {
        if (encendido) {
            System.out.println("El monitor está mostrando imagen");
        } else {
            System.out.println("El monitor está apagado, no se puede mostrar imagen");
        }
    }
}

