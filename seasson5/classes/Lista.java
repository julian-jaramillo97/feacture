package seasson5.classes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarea> listaDeTareas;
    private List<Persona> listaDePersonas;

    public Lista() {
        this.listaDeTareas = new ArrayList<>();
        this.listaDePersonas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        listaDeTareas.add(tarea);
    }

    public void agregarPersona(Persona persona) {
        listaDePersonas.add(persona);
    }

    public Persona buscarPersona(String nombre) {
        for (Persona persona : listaDePersonas) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return persona;
            }
        }
        return null;
    }

    public void mostrarLista() {
        for (Tarea tarea : listaDeTareas) {
            System.out.println(tarea.toString());
        }
    }

    public List<Tarea> obtenerTareasPorEstado(EstadoTarea estado) {
        List<Tarea> tareasPorEstado = new ArrayList<>();
        for (Tarea tarea : listaDeTareas) {
            if (tarea.getEstado() == estado) {
                tareasPorEstado.add(tarea);
            }
        }
        return tareasPorEstado;
    }
}