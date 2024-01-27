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
    private String añoPublicacion;
    private boolean disponibilidad;

    public Libros(String titulo, String autor, String genero, String añoPublicacion, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.añoPublicacion = añoPublicacion;
        this.disponibilidad = disponibilidad;
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

    public String getAnioPublicacion() {
        return añoPublicacion;
    }

    public void setFecha(String anioPublicacion) {
        this.añoPublicacion = anioPublicacion;
    }

    public boolean Disponible() {
        return disponibilidad;
    }

    public void setDisponible(boolean disponible) {
        this.disponibilidad = disponible;
    }

    
     public String toString(){
         return "Libro.  |  Titulo: " +titulo+ " |  Autor: " +autor+ " |  Genero: "+genero+ " |  Año: "+añoPublicacion+ " |  Disponible: " +disponibilidad;
     }
    
}

