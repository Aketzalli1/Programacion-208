package Tarea_8;

public class MaquinaCafe {
    private int crema;
    private int cafe;
    private int agua;
    private int vasos;

    public MaquinaCafe() {
        crema=1500;
        agua=5000;
        cafe=1000;
        vasos=50;

    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        if (crema <= 1500) {
        this.crema = crema;
    } else {
        System.out.println("No cabe mas crema");
    }
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        if (cafe <= 1000) {
            this.cafe = cafe;
        } else {
            System.out.println("No puede almacenarse mas café");
        }
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        if (agua <= 5000) {
            this.agua = agua;
        } else {
            System.out.println("No cabe mas agua");
        }
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        if (vasos <= 50) {
            this.vasos = vasos;
        } else {
            System.out.println("Ya no caben mas vasos");
        }
    }

    @Override
    public String toString() {
        return "MaquinaCafe{" +
                "crema=" + crema +
                ", cafe=" + cafe +
                ", agua=" + agua +
                ", vasos=" + vasos +
                '}';
    }
    public void hacerExpreso() {
        if (agua >= 120 && cafe >= 20 && vasos >= 1) {
            agua -= 120;
            cafe -= 20;
            vasos--;
            System.out.println("Cafe expreso listo¡¡");
        } else {
            System.out.println("No queda nada en la maquina para realizar otro cafe");
        }
    }
    public void hacerAmericano() {
        if (agua >= 180 && cafe >= 15 && vasos >= 1) {
            agua -= 180;
            cafe -= 15;
            vasos--;
            System.out.println("Cafe americano listo¡¡.");
        } else {
            System.out.println("No queda nada en la maquina para realizar otro cafe");
        }
    }
    public void hacerCapuchino() {
        if (agua >= 100 && crema >= 70 && cafe >= 14 && vasos >= 1) {
            agua -= 100;
            crema -= 70;
            cafe -= 14;
            vasos--;
            System.out.println("Cafe capuchino listo¡¡");
        } else {
            System.out.println("No queda nada en la maquina para realizar otro cafe");
        }}
    public void vasosActuales() {
        System.out.println("Los vasos actuales son:");
        System.out.println(vasos);
    }
    public void mostrarDeposito(){
        System.out.println("El deposito tiene");
        System.out.println("Agua: " + agua + " ml");
        System.out.println("Crema: " + crema + " ml");
        System.out.println("Café: " + cafe + " g");

}}
