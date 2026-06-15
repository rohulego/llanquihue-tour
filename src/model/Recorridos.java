
package model;


public class Recorridos {
    
    private String nombre;
    private int duracion; // en dias
    private int valor;

    public Recorridos() {
    }

    public Recorridos(String nombre, int duracion, int valor) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\n" +
                "Duración en días: " + duracion + "\n" + 
                "Valor: " + valor + "\n";
    }
    
    
    
    
    
    
}
