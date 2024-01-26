/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_joseacosta;

/**
 *
 * @author josed
 */
public class Articulos {
    
    private String titulo;
    private String autor;
    private String tema;
    private String fechaPublicacion;
    private boolean accesoLinea;

    public Articulos(String titulo, String autor, String tema, String fechaPublicacion, boolean accesoLinea) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fechaPublicacion = fechaPublicacion;
        this.accesoLinea = accesoLinea;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean AccesoEnLinea() {
        return accesoLinea;
    }

    public void setAccesoEnLinea(boolean accesoEnLinea) {
        this.accesoLinea = accesoEnLinea;
    }

    public String toString() {
        return "Articulo{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tema='" + tema + '\'' +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", accesoEnLinea=" + accesoLinea +
                '}';
    
}
}

