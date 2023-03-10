package Tarea_6;

import java.awt.*;
public class Celular {
    private String marca;
    private int ram;
    private int memoria;
    private String procesador;

    public Celular(String marca, int ram, int memoria, String procesador) {
        this.marca = marca;
        this.ram = ram;
        this.memoria = memoria;
        this.procesador = procesador;
    }

    public Celular(String marca, int ram) {
        this.marca = marca;
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Tarea_6.Celular{" +
                "marca='" + marca + '\'' +
                ", ram=" + ram +
                ", memoria=" + memoria +
                ", procesador='" + procesador + '\'' +
                '}';
    }


    public void encendido() {
        System.out.println("La pantalla se encuetra encendida");
    }

    public void apagado() {
        System.out.println("El celular se encuentra apagado");
    }

    public void presionando() {
        System.out.println("Estas presionando el boton de encendido del celular");
    }

    public void encendido1() {
        System.out.println("La pantalla se encuetra encendida");
    }

    public void apagado1() {
        System.out.println("El celular se encuentra apagado");
    }
}

