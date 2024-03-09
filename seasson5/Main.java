package seasson5;

import java.util.Scanner;

import seasson5.classes.Lista;
import seasson5.classes.Persona;
import seasson5.classes.Tarea;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Deseas crear una lista de tareas? (Sí/No)");
        String respuesta = scanner.nextLine().toLowerCase();

        if (respuesta.equals("sí") || respuesta.equals("si")) {
            Lista listaDeTareas = new Lista();

            for (int i = 1; i <= 5; i++) {
                System.out.println("Ingresa los detalles para la tarea " + i + ":");
                System.out.print("Nombre de la tarea: ");
                String nombreTarea = scanner.nextLine();

                System.out.print("Duración de la tarea (en horas): ");
                int duracionTarea = Integer.parseInt(scanner.nextLine());

                System.out.print("Nombre de la persona encargada: ");
                String nombrePersona = scanner.nextLine();

                // Verificar si la persona ya existe en la lista
                Persona personaEncargada = listaDeTareas.buscarPersona(nombrePersona);

                if (personaEncargada == null) {
                    // Si la persona no existe, pedir al usuario que cree una nueva persona
                    System.out.println("La persona no existe. Por favor, crea una nueva persona:");
                    System.out.print("Nombre de la persona nueva: ");
                    String nuevoNombrePersona = scanner.nextLine();

                    System.out.print("Email de la persona nueva: ");
                    String nuevoEmailPersona = scanner.nextLine();

                    System.out.print("Teléfono de la persona nueva: ");
                    String nuevoTelefonoPersona = scanner.nextLine();

                    System.out.print("ID de la persona nueva: ");
                    String nuevoIdPersona = scanner.nextLine();

                    personaEncargada = new Persona(nuevoNombrePersona, nuevoEmailPersona, nuevoTelefonoPersona, nuevoIdPersona);
                }

                Tarea nuevaTarea = new Tarea(nombreTarea, duracionTarea, personaEncargada);
                listaDeTareas.agregarTarea(nuevaTarea);

                System.out.println("Tarea agregada correctamente.");
            }

            // Preguntar si desea agregar más tareas
            while (true) {
                System.out.println("¿Deseas agregar otra tarea? (Sí/No)");
                respuesta = scanner.nextLine().toLowerCase();

                if (respuesta.equals("sí") || respuesta.equals("si")) {
                    System.out.println("Ingresa los detalles para la tarea:");
                    // Código similar al bloque anterior para agregar una tarea
                } else {
                    break;
                }
            }

            System.out.println("Lista completa de tareas:");
            listaDeTareas.mostrarLista();
        } else {
            System.out.println("¡Hasta luego!");
        }

        scanner.close();
    }
}