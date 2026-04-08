import Ejercicio12.Ejercicio12;
import Ejercicio12.Persona;

import java.io.File;

public class Main {
    public static void main(String[] args) {
// 1. Instanciar la clase que gestiona la lista
        Ejercicio12 gestion = new Ejercicio12();

        // 2. Crear varias personas (DNI, Apellidos, Nombres, Sexo(H=true), Edad, Peso)
        Persona p1 = new Persona("12345678A", "Rake", "Anomander", true, 500, 95.5);
        Persona p2 = new Persona("87654321B", "Envy", "Lady", false, 25, 60.0);
        Persona p3 = new Persona("11223344C", "Purn, La Fiera", "Whiskeyjack", true, 45, 88.2);
        Persona p4 = new Persona("55667788D", "Tattersail", "Calot", false, 32, 70.5);
        Persona p5 = new Persona("99001122E", "Ganoes", "Paran", true, 19, 75.0);

        // 3. Añadir a la lista (Asegúrate de que tu ArrayList en Ejercicio12 sea público o tenga un método add)
        // Suponiendo que tienes un método personas.add() o similar:
        gestion.personas.add(p1);
        gestion.personas.add(p2);
        gestion.personas.add(p3);
        gestion.personas.add(p4);
        gestion.personas.add(p5);

        System.out.println("--- Lista antes de ordenar (por orden de inserción) ---");
        for(Persona p : gestion.getPersonas()) {
            System.out.println(p);
        }

        // 4. Ordenar (Esto usará tu compareTo basado en edad)
        gestion.ordenarPersonas();

        System.out.println("\n--- Lista después de ordenar (por Edad de menor a mayor) ---");
        gestion.mostrarPersonas();

        // 5. Probar buscarPersona
        System.out.println("\n--- Probando búsqueda por DNI (11223344C) ---");
        Persona encontrada = gestion.buscarPersona("11223344C");
        System.out.println(encontrada != null ? "Encontrada: " + encontrada : "No existe.");
    }
}