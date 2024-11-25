package puntospc3;

import java.util.Scanner;

public class SistemaRegistro {
    public static void main(String[] args) {
        GestionLenguaje gestion = new GestionLenguaje();
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("\n--- Menú ---");
                System.out.println("1. Agregar lenguaje");
                System.out.println("2. Buscar lenguaje");
                System.out.println("3. Eliminar lenguaje");
                System.out.println("4. Imprimir lenguajes");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Año de creación: ");
                        int anio = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Característica principal: ");
                        String caracteristica = scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Utilización: ");
                        String utilizacion = scanner.nextLine();
                        gestion.agregarLenguaje(anio, caracteristica, nombre, utilizacion);
                        System.out.println("Lenguaje agregado.");
                    }
                    
                    case 2 -> {
                        System.out.print("Nombre del lenguaje a buscar: ");
                        String nombreBuscar = scanner.nextLine();
                        LenguajeProgramacion lenguaje = gestion.buscarLenguaje(nombreBuscar);
                        if (lenguaje != null) {
                            System.out.println("Lenguaje encontrado: " + lenguaje);
                        } else {
                            System.out.println("Lenguaje no encontrado.");
                        }
                    }
                    
                    case 3 -> {
                        System.out.print("Nombre del lenguaje a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        if (gestion.eliminarLenguaje(nombreEliminar)) {
                            System.out.println("Lenguaje eliminado.");
                        } else {
                            System.out.println("Lenguaje no encontrado.");
                        }
                    }
                    
                    case 4 -> {
                        System.out.println("Lista de lenguajes:");
                        gestion.imprimirLenguajes();
                    }
                    
                    case 5 -> System.out.println("Saliendo del sistema...");
                    
                    default -> System.out.println("Opción no válida.");
                }
            } while (opcion != 5);
        }
    }
}
