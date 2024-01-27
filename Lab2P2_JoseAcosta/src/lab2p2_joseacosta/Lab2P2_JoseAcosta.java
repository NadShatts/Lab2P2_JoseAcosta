/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_joseacosta;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

        //Le pregunte a un estructor que si tenia que poner esta informacion dentro del ciclo while y me dijo que no, pero luego escuche que debia estar dentro o algo asi, entonces una disculpa de antemano
        Scanner s = new Scanner(System.in);
        System.out.println("user: estudiante, profesor, bibliotecario");
        System.out.println("contra: 123, 456, 789");
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
            System.out.println("Ingreso al sistema como " + nombreUsuario);
            System.out.println("1. Listar Recurso.");
            System.out.println("2. Crear Recurso");
            System.out.println("3. Eliminar Recurso.");
            System.out.println("4. Modificar Recurso");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    if (usuarioActual.tipoUsuario.equals("estudiante") || usuarioActual.tipoUsuario.equals("profesor") || usuarioActual.tipoUsuario.equals("bibliotecario")) {
                        if (recursos.isEmpty()) {
                            System.out.println("No hay nada ingresado hasta el momento una disculpa");
                        } else {
                            int contador = 1;
                            System.out.println("Lista de recursos en la biblioteca virtual:");
                            for (Object recurso : recursos) { 
                                System.out.println("");
                                System.out.println(contador+". " +recurso.toString());
                                contador++;

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

                        int tipoRecurso = entrada1.nextInt();
                        switch (tipoRecurso) {
                            case 1:
                                System.out.print("Ingrese el título del libro: ");
                                String tituloLibro = entrada1.next();
                                System.out.print("Ingrese el autor del libro: ");
                                String autorLibro = entrada1.next();
                                System.out.print("Ingrese el género del libro: ");
                                String generoLibro = entrada1.next();
                                System.out.print("Ingrese el año de publicación del libro: ");
                                String añoLibro = entrada1.next();

                                System.out.print("Disponibilidad (si o no): ");
                                String disponibilidadInput = entrada1.next().toLowerCase();
                                boolean disponibilidadLibro;

                                if (disponibilidadInput.equals("si") || disponibilidadInput.equals("Si")) {
                                    disponibilidadLibro = true;
                                } else if (disponibilidadInput.equals("no") || disponibilidadInput.equals("No")) {
                                    disponibilidadLibro = false;
                                } else {
                                    System.out.println("Entrada no válida para disponibilidad. Se asumirá falso.");
                                    disponibilidadLibro = false;
                                }

                                Libros nuevoLibro = new Libros(tituloLibro, autorLibro, generoLibro, añoLibro, disponibilidadLibro);
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
                                System.out.print("Ingrese la fecha del articulo(dd/MM/yyyy): ");
                                String fechaArticulo = entrada1.next();
                                System.out.print("Ingrese el acceso en linea (si o no): ");
                                String accesoLineaInput = entrada1.next().toLowerCase(); 
                                
                                
                                SimpleDateFormat formatoFecha1 = new SimpleDateFormat("dd/MM/yyyy");
                                Date fecha1;

                                boolean accesoLinea;

                                if (accesoLineaInput.equals("si") || accesoLineaInput.equals("Si") || accesoLineaInput.equals("sí")) {
                                    accesoLinea = true;
                                } else if (accesoLineaInput.equals("no")) {
                                    accesoLinea = false;
                                } else {
                                    System.out.println("Entrada no válida para acceso en línea. Se asumirá no.");
                                    accesoLinea = false;
                                }

                                Articulos nuevoArticulo = new Articulos(tituloArticulo, autorArticulo, temaArticulo, fechaArticulo, accesoLinea);
                                recursos.add(nuevoArticulo);
                                System.out.println("Articulo ingresado correctamente.");
                                break;
                            case 3:
                                System.out.print("Ingrese el título del curso en línea: ");
                                String tituloCurso = entrada1.next();
                                System.out.print("Ingrese el instructor del curso:");
                                String instructorCurso = entrada1.next();
                                System.out.print("Ingrese la duracion(ejem: 2semanas): ");
                                String duracionCurso = entrada1.next();
                                System.out.print("Ingrese la plataforma: ");
                                String plataformaCurso = entrada1.next();

                                CursosEnLinea curso = new CursosEnLinea(tituloCurso, instructorCurso, duracionCurso, plataformaCurso);
                                recursos.add(curso);
                                System.out.println("Curso ingresado correctamente.");
                                break;
                            case 4:

                                System.out.print("Ingrese el título de la conferencia virtual: ");
                                String tituloConferencia = entrada1.next();
                                System.out.print("Ingrese el conferencista:");
                                String conferencistaConferencia = entrada1.next();
                                System.out.print("Ingrese la fecha(dd/MM/yyyy): ");
                                String fechaConferencia = entrada1.next();
                                System.out.println("Ingrese la duracion(ejemplo 4horas): ");
                                String duracion = entrada.next();

                                System.out.print("Ingrese el enlace de acceso: ");
                                String enlaceAcceso = entrada1.next();

                                ConferenciasVirtuales conferencia = new ConferenciasVirtuales(tituloConferencia, conferencistaConferencia, fechaConferencia, enlaceAcceso, duracion);
                                recursos.add(conferencia);
                                System.out.println("Conferencia ingresada correctamente");

                                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                                Date fecha;

                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, seleccione un tipo de recurso válido.");
                        }
                    } else {
                        System.out.println("No tiene permisos para hacer eso.");
                    }
                    break;

                case 3:

                    if (usuarioActual.tipoUsuario.equals("bibliotecario")) {
                        if (recursos.isEmpty()) {
                            System.out.println("No hay nada ingresado hasta el momento una disculpa");
                        } else {
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
                        }
                    } else {
                        System.out.println("No tienes permiso para eso");
                    }
                    break;

                case 4:

                    if (usuarioActual.tipoUsuario.equals("bibliotecario")) {
                        if (recursos.isEmpty()) {
                            System.out.println("No hay nada ingresado hasta el momento una disculpa");
                        } else {
                            System.out.println("Ingrese el título del recurso a modificar:");

                            String tituloModificar = entrada.next();

                            boolean recursoEncontrado = false;
                            for (Object obj : recursos) {
                                if (obj instanceof Libros) {
                                    Libros libro = (Libros) obj;
                                    if (libro.getTitulo().equals(tituloModificar)) {
                                        System.out.print("El título actual del libro es: " + libro.getTitulo());
                                        System.out.print("Ingrese el nuevo título del libro:");
                                        String nuevoTitulo = entrada.next();
                                        libro.setTitulo(nuevoTitulo);
                                        System.out.print("Ingrese el nuevo autor: ");
                                        String nuevoAutorLibro = entrada.next();
                                        libro.setAutor(nuevoAutorLibro);
                                        System.out.print("Ingrese el nuevo genero: ");
                                        String nuevoGenero = entrada.next();
                                        libro.setGenero(nuevoGenero);
                                        System.out.print("Ingrese la nueva Fecha: ");
                                        String nuevaFecha = entrada.next();
                                        libro.setFecha(nuevaFecha);
                                        System.out.println("El libro ha sido modificado correctamente.");
                                        recursoEncontrado = true;
                                        break;
                                    }
                                } else if (obj instanceof Articulos) {
                                    Articulos articulo = (Articulos) obj;
                                    if (articulo.getTitulo1().equals(tituloModificar)) {
                                        System.out.print("El título actual del artículo es: " + articulo.getTitulo1());
                                        System.out.print("Ingrese el nuevo título del artículo:");
                                        String nuevoTitulo = entrada.next();
                                        articulo.setTitulo1(nuevoTitulo);
                                        System.out.print("Ingrese el nuevo autor: ");
                                        String nuevoAutor = entrada.next();
                                        articulo.setAutor(nuevoAutor);
                                        System.out.print("Ingrese el nuevo Tema: ");
                                        String nuevoTema = entrada.next();
                                        articulo.setTema(nuevoTema);
                                        System.out.print("Ingrese la nueva fecha ");
                                        String nuevaFecha = entrada.next();
                                        articulo.setFechaPublicacion(nuevaFecha);
                                        System.out.print("El artículo ha sido modificado correctamente.");
                                        recursoEncontrado = true;
                                        break;
                                    }
                                } else if (obj instanceof CursosEnLinea) {
                                    CursosEnLinea curso = (CursosEnLinea) obj;
                                    if (curso.getTitulo2().equals(tituloModificar)) {
                                        System.out.print("El título actual del curso en línea es: " + curso.getTitulo2());
                                        System.out.print("Ingrese el nuevo título del curso en línea:");
                                        String nuevoTitulo = entrada.next();
                                        curso.setTitulo2(nuevoTitulo);
                                        System.out.print("Ingrese el nuevo instructor: ");
                                        String nuevoInstructor = entrada.next();
                                        curso.setInstructor(nuevoInstructor);
                                        System.out.print("Ingrese la duracion en semanas.");
                                        String nuevaDuracion = entrada.next();
                                        curso.setDuracionSemanas(nuevaDuracion);
                                        System.out.print("Ingrese la plataforma nueva: ");
                                        String nuevaPlataforma = entrada.next();
                                        curso.setPlataforma(nuevaPlataforma);
                                        System.out.print("El curso en línea ha sido modificado correctamente.");
                                        recursoEncontrado = true;
                                        break;
                                    }
                                } else if (obj instanceof ConferenciasVirtuales) {
                                    ConferenciasVirtuales conferencia = (ConferenciasVirtuales) obj;
                                    if (conferencia.getTitulo3().equals(tituloModificar)) {
                                        System.out.print("El título actual de la conferencia virtual es: " + conferencia.getTitulo3());
                                        System.out.print("Ingrese el nuevo título de la conferencia virtual:");
                                        String nuevoTitulo = entrada.next();
                                        conferencia.setTitulo3(nuevoTitulo);
                                        System.out.print("Ingrese el njuevo conferencista: ");
                                        String nuevaConferencista = entrada.next();
                                        conferencia.setConferencista(nuevaConferencista);
                                        System.out.print("Ingrese la nueva fecha: ");
                                        String nuevaFecha2 = entrada.next();
                                        conferencia.setFecha(nuevaFecha2);
                                        System.out.print("Ingrese el nuevo enlace de acceso: ");
                                        String nuevoEnlace = entrada.next();
                                        conferencia.setEnlaceAcceso(nuevoEnlace);

                                        System.out.println("La conferencia virtual ha sido modificada correctamente.");
                                        recursoEncontrado = true;
                                        break;

                                    }
                                }
                            }

                            if (!recursoEncontrado) {
                                System.out.println("No se encontró un recurso con el título proporcionado.");
                            }
                        }
                    } else {
                        System.out.println("No tiene permiso para hacer este");
                    }

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
