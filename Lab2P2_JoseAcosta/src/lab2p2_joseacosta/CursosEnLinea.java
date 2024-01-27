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
    private String titulo2;
    private String duracionSemanas;
    private String plataforma;

    public CursosEnLinea(String instructor, String titulo2, String duracionSemanas, String plataforma) {
        this.instructor = instructor;
        this.titulo2 = titulo2;
        this.duracionSemanas = duracionSemanas;
        this.plataforma = plataforma;
    }
    
    public String getIntstructor(){
        return instructor;

    }
    public void setInstructor(String instructor){
        this.instructor = instructor;
    }
    
    public String getTitulo2(){
        return titulo2;
    }
    
    public void setTitulo2(String titulo) {
        this.titulo2 = titulo;
    }
    
    public String getDuracionSemanas(){
        return duracionSemanas;
        
    }
    
    public void setDuracionSemanas(String duracionSemanas){
        this.duracionSemanas = duracionSemanas;
    }
    
    public String getPlataforma(){
        return plataforma;
    }
    
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    
     public String toString() {
         return "Curso en Linea.  |  Instructor " +instructor+ " |  Titulo: " +titulo2+ " |  Duracion "+duracionSemanas+ " |  Plataforma:  "+plataforma;
    
}
}
