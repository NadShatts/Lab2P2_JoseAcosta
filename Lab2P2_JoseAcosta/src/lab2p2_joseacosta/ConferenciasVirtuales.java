/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_joseacosta;

/**
 *
 * @author josed
 */
public class ConferenciasVirtuales {
    private String titulo3;
    private String conferencista;
    private String fecha;
    private String enlaceAcceso;
    private String duracion;

    public ConferenciasVirtuales(String titulo3, String conferencista, String fecha, String enlaceAcceso, String duracion) {
        this.titulo3 = titulo3;
        this.conferencista = conferencista;
        this.fecha = fecha;
        this.enlaceAcceso = enlaceAcceso;
        this.duracion = duracion;
    }

    
    
    public String getTitulo3(){
        return titulo3;
    }
    
    public void setTitulo3(String titulo3){
        this.titulo3 = titulo3;
    }
    
    public String getConferencista(){
        return conferencista;
        
    }
    
    public void setConferencista(String conferencista){
        this.conferencista = conferencista;
    }
    
    
    public String getFecha(){
        return fecha;
        
        
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public String getEnlaceAcceso(){
        return enlaceAcceso;
    }
    
    public void setEnlaceAcceso(String enlaceAcceso){
        this.enlaceAcceso = enlaceAcceso;
    }
    
     public String toString() {
        return "Conferencia .  |  Titulo: " +titulo3+ " |  Conferencista: " +conferencista+ " |  Fecha "+fecha+ "  | Duracion: " +duracion+ " |  Enlace: "+enlaceAcceso;
    
}
}
