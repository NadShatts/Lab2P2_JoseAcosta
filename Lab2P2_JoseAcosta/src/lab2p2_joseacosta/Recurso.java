/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_joseacosta;

/**
 *
 * @author josed
 */
public class Recurso {
    
    String titulo;
    String autor;
    // ... otros atributos comunes a todos los recursos

    public Recurso(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        // inicializar otros atributos comunes
    }

    // Getters y setters para los atributos comunes
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
    
}
