package Tarea_7;

public class Gato {
    private String tipoPelo;
    private String tamaño;
    private String colorOjos;

    public Gato() {
    }

    public Gato(String tipoPelo, String tamaño, String colorOjos) {
        this.tipoPelo = tipoPelo;
        this.tamaño = tamaño;
        this.colorOjos = colorOjos;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "tipoPelo='" + tipoPelo + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                '}';
    }
    public void rodar() {
        System.out.println("Esta rodando en el piso");
    }

    public void ronronear() {
        System.out.println("¡Purr! ¡Purr!");
    }
}

