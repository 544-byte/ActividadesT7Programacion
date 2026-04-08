package Ejercicio12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio12 {
    public ArrayList<Persona> personas;

    public Ejercicio12(){
        personas = new ArrayList<>();
    }

    public Persona buscarPersona(String dni){
        for(Persona p : personas){
            if (p.getDni().equals(dni)){
                return p;
            }
        }
        return null;
    }

    public Persona eliminarPersona(String nombre, String apellidos){
        for(Persona p : personas){
            if (p.getNombres().equals(nombre) && p.getApellidos().equals(apellidos)){
                personas.remove(p);
                return p;
            }
        }
        return null;
    }

    public void ordenarPersonas(){
        Collections.sort(personas);
    }

    public void mostrarPersonas(){
        for(Persona p : personas){
            System.out.println(p.toString());
        }
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
}
