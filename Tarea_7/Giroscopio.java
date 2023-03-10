package Tarea_7;

public class Giroscopio {
    private String modelo;
    private int precio;
    private int cantidad;

    public Giroscopio() {
    }

    public Giroscopio(String modelo, int precio, int cantidad) {
        this.modelo = modelo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
    public boolean esCaro() {
        return precio > 100;
    }

    public int calcularTotal() {
        return precio * cantidad;
    }
}

