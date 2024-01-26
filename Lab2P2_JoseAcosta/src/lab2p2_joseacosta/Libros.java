/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_joseacosta;

/**
 *
 * @author josed
 */
public class Libros {
    private String titulo;
    private String autor;
    private String genero;
    private int añoPublicacion;
    private boolean disponibilidad;

    public Libros(String titulo, String autor, String genero, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.añoPublicacion = añoPublicacion;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioPublicacion() {
        return añoPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.añoPublicacion = anioPublicacion;
    }

    public boolean Disponible() {
        return disponibilidad;
    }

    public void setDisponible(boolean disponible) {
        this.disponibilidad = disponible;
    }

    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", anioPublicacion=" + añoPublicacion +
                ", disponible=" + disponibilidad +
                '}';
    }
}

