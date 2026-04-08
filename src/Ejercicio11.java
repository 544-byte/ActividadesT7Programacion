import java.util.ArrayList;

public class Ejercicio11 {
    private ArrayList<Double> lista;
    public Ejercicio11(){
        lista = null;
    }

    public Ejercicio11(ArrayList<Double> lista){
        this.lista = new ArrayList<>(lista);
    }

    public void setLista(ArrayList<Double> lista){
        this.lista = new ArrayList<>(lista);
    }

    public ArrayList<Double> getLista(){
        return lista;
    }

    public void agregarFinal(double elemento){
        lista.add(elemento);
    }

    public void agregarPosicion(double elemento, int posicion){
        lista.add(posicion,elemento);
    }

    public double buscarNumero(double numero){
        if (lista.contains(numero)){
            return numero;
        } else {
            return -1;
        }
    }

    public double buscarPosicion(int posicion){
        return lista.get(posicion);
    }

    public boolean modificaNumero(double viejoElemento, double nuevoElemento){
        if (lista.contains(viejoElemento)){
            lista.set(lista.indexOf(viejoElemento),nuevoElemento);
            return true;
        } else {
            return false;
        }
    }

    public boolean modicaPosicion(int posicion, double elemento){
        lista.set(posicion,elemento);
        return true;
    }

    public boolean eliminarPosicion(int posicion){
        if (lista.remove(posicion) == (null)){
            return false;
        }
        return true;
    }

    public int numeroElementos(){
        return lista.size();
    }
    public void vaciaLista(){
        lista.clear();
    }
    public void vuelcaArray(ArrayList<Double> otro){
        lista.addAll(otro);
    }

    public ArrayList<Double> sublista(int posicion){
        return (ArrayList<Double>) lista.subList(posicion,lista.size()-1);
    }

}
