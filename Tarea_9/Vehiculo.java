package Tarea_9;

public class Vehiculo {
    private String tipo;
    private String traccion;
    private String material;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String traccion, String material) {
        this.tipo = tipo;
        this.traccion = traccion;
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", traccion='" + traccion + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public void movimiento(){
        System.out.println("El vehiculo se encuentra en movimiento");
    }
     public void velocidad(){
         System.out.println("El vehiculo va a cierta velocidad");
     }
}
