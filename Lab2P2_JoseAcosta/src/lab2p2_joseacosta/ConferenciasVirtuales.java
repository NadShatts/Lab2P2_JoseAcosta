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
    private int conferencista;
    private String fecha;
    private String enlaceAcceso;

    public ConferenciasVirtuales(String titulo3, int conferencista, String fecha, String EnlaceScceso) {
        this.titulo3 = titulo3;
        this.conferencista = conferencista;
        this.fecha = fecha;
        this.enlaceAcceso = EnlaceScceso;
    }
    
    public String getTitul3o(){
        return titulo3;
    }
    
    public void setTitulo3(String titulo3){
        this.titulo3 = titulo3;
    }
    
    public int getConferencista(){
        return conferencista;
        
    }
    
    public void setConferencista(int conferencista){
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
    
}
