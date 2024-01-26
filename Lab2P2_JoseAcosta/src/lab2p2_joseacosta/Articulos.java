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
    
    private String titulo1;
    private String autor;
    private String tema;
    private String fechaPublicacion;
    private boolean accesoLinea;

    public Articulos(String titulo, String autor, String tema, String fechaPublicacion, boolean accesoLinea) {
        this.titulo1 = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fechaPublicacion = fechaPublicacion;
        this.accesoLinea = accesoLinea;
    }
    
    
    public String getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(String titulo) {
        this.titulo1 = titulo;
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
                "titulo='" + titulo1 + '\'' +
                ", autor='" + autor + '\'' +
                ", tema='" + tema + '\'' +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", accesoEnLinea=" + accesoLinea +
                '}';
    
}
}

