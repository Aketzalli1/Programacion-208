package Tarea_9;

public class Automovil extends Vehiculo{
    private String TipoDeMotor;
    private double tanqueGas;
    private String tamaño;

    public Automovil() {
    }

    public Automovil(String tipoDeMotor, double tanqueGas, String tamaño) {
        TipoDeMotor = tipoDeMotor;
        this.tanqueGas = tanqueGas;
        this.tamaño = tamaño;
    }

    public String getTipoDeMotor() {
        return TipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        TipoDeMotor = tipoDeMotor;
    }

    public double getTanqueGas() {
        return tanqueGas;
    }

    public void setTanqueGas(double tanqueGas) {
        this.tanqueGas = tanqueGas;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "TipoDeMotor='" + TipoDeMotor + '\'' +
                ", tanqueGas=" + tanqueGas +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
    public void gasolina(){
        System.out.println("Se esta cargando gasolina");
    }
    public void encendid(){
        System.out.println("Esta encendido....");
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
