/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_joseacosta;

/**
 *
 * @author josed
 */
public class CursosEnLinea {
    
    private String instructor;
    private String titulo;
    private int duracionSemanas;
    private int plataforma;

    public CursosEnLinea(String instructor, String titulo, int duracionSemanas, int plataforma) {
        this.instructor = instructor;
        this.titulo = titulo;
        this.duracionSemanas = duracionSemanas;
        this.plataforma = plataforma;
    }
    
    public String getIntstructor(){
        return instructor;

    }
    public void setInstructor(String instructor){
        this.instructor = instructor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getDuracionSemanas(){
        return duracionSemanas;
        
    }
    
    public void setDuracionSemanas(int duracionSemanas){
        this.duracionSemanas = duracionSemanas;
    }
    
    public int getPlataforma(){
        return plataforma;
    }
    
    public void setPlataforma(int plataforma){
        this.plataforma = plataforma;
    }
    
}
