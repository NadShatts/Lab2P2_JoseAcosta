/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_joseacosta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josed
 */

public class Lab2P2_JoseAcosta {

    /**
     * @param args the command line arguments
     */
    ArrayList lista = new ArrayList();
    public static void main(String[] args) {
        
                
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("1. Listar Recurso.");
            System.out.println("2. Crear Recurso");
            System.out.println("3. Eliminar Recurso.");
            System.out.println("4. Modificar Recurso");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();
            
                    switch(opcion){
                        case 1:
                            
  
                            break;
                            
                        case 2:
                            break;
                            
                        case 3:
                            break;
                        case 4:
                            break;
                            
                        case 5:
                            break;
                            
                        case 6:
                            break;
                            
                        default:
                            System.out.println("Opcion invalida. Intente denuevo.");
                            
                            
                            
                    }
        } while(opcion!=4);    }
    
}

