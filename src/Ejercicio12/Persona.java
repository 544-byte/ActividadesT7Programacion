package Ejercicio12;

public class Persona implements Comparable<Persona> {
    private String dni, apellidos, nombres;
    private boolean sexo;
    private int edad;
    private double peso;

    public Persona(){
        dni = apellidos = nombres = "";
        sexo = false;
        edad = -1;
        peso = -1;
    }

    public Persona(String dni, String apellidos, String nombres, boolean sexo, int edad, double peso){
        setDni(dni);
        setApellidos(apellidos);
        setNombres(nombres);
        setSexo(sexo);
        setEdad(edad);
        setPeso(peso);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString(){
        String setso="";
        if (isSexo()){
            setso = "Hombre";
        } else {
            setso = "Mujer";
        }
        return getNombres() + " " + getApellidos() + ", " + setso + " de " + getEdad() + " años y " + getPeso() + "KG de peso con DNI " + getDni() + ".";
    }

    public int compareTo(Persona p){
        return Integer.compare(this.getEdad(),p.getEdad());
    }
}
