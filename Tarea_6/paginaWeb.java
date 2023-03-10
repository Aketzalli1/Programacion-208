package Tarea_6;

public class paginaWeb {
    private String nombre;
    private String tipo;
    private String url;
    private String contenido;
    private String fechaModificacion;

    public paginaWeb() {
    }

    public paginaWeb(String nombre, String tipo, String url, String contenido, String fechaModificacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.url = url;
        this.contenido = contenido;
        this.fechaModificacion = fechaModificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "paginaWeb{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", url='" + url + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fechaModificacion='" + fechaModificacion + '\'' +
                '}';
    }
    public void visitar(){
        System.out.println("Bienvenido a: "+ nombre);
        System.out.println("---------------");
                System.out.println(contenido);
        System.out.println("---------------");
    }
    public void cerrar(){
        System.out.println("Adios");
    }
    }



