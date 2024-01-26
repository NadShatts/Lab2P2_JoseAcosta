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
    
    public static void main(String[] args) {

        ArrayList<Recurso> recursos = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        
        usuarios.add(new Usuario("estudiante1", "123", "estudiante"));
        usuarios.add(new Usuario("profesor1", "456", "profesor"));
        usuarios.add(new Usuario("bibliotecario1", "789", "bibliotecario"));


        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = s.next();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = s.next();

        Usuario usuarioActual = null;
        for (Usuario usuario : usuarios) {
            if (usuario.nombreUsuario.equals(nombreUsuario) && usuario.contraseña.equals(contrasena)) {
                usuarioActual = usuario;
                break;
            }
        }

        if (usuarioActual == null) {
            System.out.println("Nombre de usuario o contraseña incorrectos. El programa se cerrará.");
            return;
        }
        
        do {
            System.out.println("1. Listar Recurso.");
            System.out.println("2. Crear Recurso");
            System.out.println("3. Eliminar Recurso.");
            System.out.println("4. Modificar Recurso");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    break;

                case 2:
                    Scanner entrada1 = new Scanner(System.in);
                    System.out.println("Seleccione el tipo de recurso a crear:");
                    System.out.println("1. Libro");
                    System.out.println("2. Artículo");
                    System.out.println("3. Curso en Línea");
                    System.out.println("4. Conferencia Virtual");
                    System.out.print("Ingrese su elección: ");
                    int tipoRecurso = entrada1.nextInt();
                    switch (tipoRecurso) {
                        case 1:
                            System.out.print("Ingrese el título del libro: ");
                            String tituloLibro = entrada1.next();
                            System.out.println("Ingrese el autor del libro:");
                            String autorLibro = entrada1.next();
                            System.out.println("Ingrese el genero del libro:");
                            String generoLibro = entrada1.next();
                            System.out.println("Ingrese el año de publicacion del libro: ");
                            int añoLibro = entrada1.nextInt();
                            System.out.println("Disponibilidad");
                            
                              Libros nuevoLibro = new Libros(tituloLibro, autorLibro, generoLibro, añoLibro);

        recursos.add(nuevoLibro);
        
                            break;
                        case 2:
                            System.out.print("Ingrese el título del artículo: ");
                            String tituloArticulo = entrada1.next();
                            System.out.println("Ingrese el autor del articulo: ");
                            String autorArticulo = entrada1.next();
                            System.out.println("Ingrese el tema del articulo: ");
                            String temaArticulo = entrada1.next();
                            System.out.println("Ingrese la fecha del articulo: ");
                            String fechaArticulo = entrada1.next();
                            
                            Articulos nuevoArticulo = new Articulos(tituloArticulo, autorArticulo,  temaArticulo, fechaArticulo);
                            
                            break;
                        case 3:
                            System.out.print("Ingrese el título del curso en línea: ");
                            String tituloCurso =entrada1.next();
                            break;
                        case 4:

                            System.out.print("Ingrese el título de la conferencia virtual: ");
                            String tituloConferencia = entrada1.next();

                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, seleccione un tipo de recurso válido.");
                    }

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
        } while (opcion != 4);
    }

}
