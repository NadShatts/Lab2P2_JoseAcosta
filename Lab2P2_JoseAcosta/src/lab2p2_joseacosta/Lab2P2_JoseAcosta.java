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

        ArrayList recursos = new ArrayList<>();

        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        usuarios.add(new Usuario("estudiante", "123", "estudiante"));
        usuarios.add(new Usuario("profesor", "456", "profesor"));
        usuarios.add(new Usuario("bibliotecario", "789", "bibliotecario"));

        Scanner s = new Scanner(System.in);
        System.out.println("estudiante, profesor, bibliotecario");
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = s.next();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = s.next();

        Usuario usuarioActual = null;
        for (Usuario usuario : usuarios) {
            if (usuario.nombreUsuario.equals(nombreUsuario) && usuario.contraseña.equals(contrasena)) {
                usuarioActual = usuario;
                System.out.println("Seas bienvenido :) ");
                break;
            }
        }

        if (usuarioActual == null) {
            System.out.println("Nombre de usuario o contraseña incorrectos. El programa se cerrará.");
            return;
        }

        do {
            System.out.println("Bienvenido " + nombreUsuario);
            System.out.println("1. Listar Recurso.");
            System.out.println("2. Crear Recurso");
            System.out.println("3. Eliminar Recurso.");
            System.out.println("4. Modificar Recurso");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    if (usuarioActual.tipoUsuario.equals("estudiante") || usuarioActual.tipoUsuario.equals("profesor") || usuarioActual.tipoUsuario.equals("bibliotecario")) {

                        if (recursos.isEmpty()) {
                            System.out.println("No hay nada ingresado hasta el momento una disculpa");
                        } else {
                            for (Object recurso : recursos) {
                                System.out.println("Lista de recursos en la biblioteca virtual:");
                                System.out.println(recurso.toString());

                            }

                        }
                    } else {
                        System.out.println("No tiene permisos para listar recursos. Esta opción es solo para estudiantes y profesores.");
                    }
                    break;

                case 2:
                    if (usuarioActual.tipoUsuario.equals("bibliotecario") || usuarioActual.tipoUsuario.equals("profesor")) {
                        Scanner entrada1 = new Scanner(System.in);
                        System.out.println("Seleccione el tipo de recurso a crear:");
                        System.out.println("1. Libro");
                        System.out.println("2. Artículo");
                        System.out.println("3. Curso en Línea");
                        System.out.println("4. Conferencia Virtual");
                        System.out.print("Ingrese su elección: ");
                    } else {
                        System.out.println("No tiene permisos para hacer eso.");
                    }
                    Scanner entrada1 = new Scanner(System.in);
                    int tipoRecurso = entrada1.nextInt();
                    switch (tipoRecurso) {
                        case 1:
                            System.out.print("Ingrese el título del libro: ");
                            String tituloLibro = entrada1.next();
                            System.out.print("Ingrese el autor del libro:");
                            String autorLibro = entrada1.next();
                            System.out.print("Ingrese el genero del libro:");
                            String generoLibro = entrada1.next();
                            System.out.print("Ingrese el año de publicacion del libro: ");
                            int añoLibro = entrada1.nextInt();
                            System.out.print("Disponibilidad");

                            Libros nuevoLibro = new Libros(tituloLibro, autorLibro, generoLibro, añoLibro);
                            recursos.add(nuevoLibro);
                            System.out.println("Libro ingresado correctamente.");

                            break;
                        case 2:
                            System.out.print("Ingrese el título del artículo: ");
                            String tituloArticulo = entrada1.next();
                            System.out.print("Ingrese el autor del articulo: ");
                            String autorArticulo = entrada1.next();
                            System.out.print("Ingrese el tema del articulo: ");
                            String temaArticulo = entrada1.next();
                            System.out.print("Ingrese la fecha del articulo: ");
                            String fechaArticulo = entrada1.next();

                            Articulos nuevoArticulo = new Articulos(tituloArticulo, autorArticulo, temaArticulo, fechaArticulo);
                            recursos.add(nuevoArticulo);
                            System.out.println("Articulo ingresado correctamente.");
                            break;
                        case 3:
                            System.out.print("Ingrese el título del curso en línea: ");
                            String tituloCurso = entrada1.next();
                            System.out.print("Ingrese el instructor del curso:");
                            String instructorCurso = entrada1.next();
                            System.out.print("Ingrese la duracion: ");
                            int duracionCurso = entrada1.nextInt();
                            System.out.print("Ingrese la plataforma: ");
                            int plataformaCurso = entrada1.nextInt();

                            CursosEnLinea curso = new CursosEnLinea(tituloCurso, instructorCurso, duracionCurso, plataformaCurso);
                            recursos.add(curso);
                            System.out.println("Curso ingresado correctamente.");
                            break;
                        case 4:

                            System.out.print("Ingrese el título de la conferencia virtual: ");
                            String tituloConferencia = entrada1.next();
                            System.out.print("Ingrese el conferencista:");
                            int conferencistaConferencia = entrada1.nextInt();
                            System.out.print("Ingrese la fecha: ");
                            String fechaConferencia = entrada1.next();
                            System.out.print("Ingrese el enlace de acceso: ");
                            String enlaceAcceso = entrada1.next();

                            ConferenciasVirtuales conferencia = new ConferenciasVirtuales(tituloConferencia, conferencistaConferencia, fechaConferencia, enlaceAcceso);
                            recursos.add(conferencia);
                            System.out.println("Conferencia ingresada correctamente");

                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, seleccione un tipo de recurso válido.");
                    }

                    break;

                case 3:
                          if (usuarioActual.tipoUsuario.equals("bibliotecario") || usuarioActual.tipoUsuario.equals("profesor")) {
        System.out.println("Ingrese el título del recurso a eliminar:");
        String tituloEliminar = entrada.next();

        boolean recursoEncontrado = false;
        for (Object obj : recursos) {
            if (obj instanceof Libros) {
                Libros libro = (Libros) obj;
                if (libro.getTitulo().equals(tituloEliminar)) {
                    System.out.println("Eliminando libro:\n" + libro);
                    recursos.remove(obj);
                    recursoEncontrado = true;
                    System.out.println("Libro eliminado correctamente.");
                    break;
                }
            } else if (obj instanceof Articulos) {
                Articulos articulo = (Articulos) obj;
                if (articulo.getTitulo1().equals(tituloEliminar)) {
                    System.out.println("Eliminando artículo:\n" + articulo);
                    recursos.remove(obj);
                    recursoEncontrado = true;
                    System.out.println("Artículo eliminado correctamente.");
                    break;
                }
            } else if (obj instanceof CursosEnLinea) {
                CursosEnLinea curso = (CursosEnLinea) obj;
                if (curso.getTitulo2().equals(tituloEliminar)) {
                    System.out.println("Eliminando curso en línea:\n" + curso);
                    recursos.remove(obj);
                    recursoEncontrado = true;
                    System.out.println("Curso en línea eliminado correctamente.");
                    break;
                }
            } else if (obj instanceof ConferenciasVirtuales) {
                ConferenciasVirtuales conferencia = (ConferenciasVirtuales) obj;
                if (conferencia.getTitulo3().equals(tituloEliminar)) {
                    System.out.println("Eliminando conferencia virtual:\n" + conferencia);
                    recursos.remove(obj);
                    recursoEncontrado = true;
                    System.out.println("Conferencia virtual eliminada correctamente.");
                    break;
                }
            }
        }

        if (!recursoEncontrado) {
            System.out.println("No se encontró un recurso con el título proporcionado.");
        }
    } else {
        System.out.println("No tiene permisos para hacer eso.");
    }
    break;

                     
                case 4:
                   

                    break;

                case 5:
                    System.out.println("Saliendo de la Biblioteca ");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente denuevo.");

            }
        } while (opcion != 5);
    }

}
