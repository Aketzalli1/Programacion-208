package Tarea_7;

public class DriverLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("Moby Dic", "Herman Melville", 2004);
        libro1.imprimirDetalles();
        if (libro1.esViejo()) {
            System.out.println("Este libro es viejo");
        } else {
            System.out.println("Este libro es nuevo");
            libro2.imprimirDetalles();
            if (libro2.esViejo()) {
                System.out.println("Este libro es viejo");
            } else {
                System.out.println("Este libro es nuevo");
            }
        }
    }}
