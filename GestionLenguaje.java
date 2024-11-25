package puntospc3;

import java.util.ArrayList;

public class GestionLenguaje {
    private final ArrayList<LenguajeProgramacion> lenguajes = new ArrayList<>();

    
    public void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        lenguajes.add(new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion));
    }

    
    public LenguajeProgramacion buscarLenguaje(String nombre) {
        for (LenguajeProgramacion lenguaje : lenguajes) {
            if (lenguaje.getNombre().equalsIgnoreCase(nombre)) {
                return lenguaje;
            }
        }
        return null;
    }

    
    public boolean eliminarLenguaje(String nombre) {
        LenguajeProgramacion lenguaje = buscarLenguaje(nombre);
        if (lenguaje != null) {
            lenguajes.remove(lenguaje);
            return true;
        }
        return false;
    }

    
    public void imprimirLenguajes() {
        if (lenguajes.isEmpty()) {
            System.out.println("No hay lenguajes registrados.");
        } else {
            for (LenguajeProgramacion lenguaje : lenguajes) {
                System.out.println(lenguaje);
            }
        }
    }
}
