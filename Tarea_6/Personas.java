package Tarea_6;

import java.awt.*;
public class Personas {
    private int edad;
    private String nombre;
    private double estatura;
    private double peso;
    private String genero;



    public Personas(int edad, String nombre, double estatura, double peso, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public Personas(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Tarea_6.Personas{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }
    public void comer() {
        System.out.println(nombre + " está comiendo pozole.");
    }

    public void tomar() {
        System.out.println(nombre + " está tomando agua de jamaica.");
    }

    public void bañar() {
        System.out.println(nombre + " está bañándose en la noche con agua caliente.");
    }
    public void comer1() {
        System.out.println(nombre + " está comiendo arroz con pollo.");
    }

    public void tomar1() {
        System.out.println(nombre + " está tomando agua de limon.");
    }

    public void bañar1() {
        System.out.println(nombre + " está bañándose de dia con agua tibia.");
    }
}

