
package ui;

import data.GestorDatos;
import model.Recorridos;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
    
        GestorDatos gestor = new GestorDatos();
        
        ArrayList<Recorridos> misRecorridos = gestor.cargarTours("src/resources/Tours.txt"); //revisar este archivo
        
        System.out.println(" --- CATÁLOGO DE TOURS ---");
        for (Recorridos r : misRecorridos){
            System.out.println(r.toString());
        }
    
        System.out.println(" --- FILTRADO: TOURS DE 1 DÍA");
        for (Recorridos r : misRecorridos){
        
            //filtrado por día
            if (r.getDuracion() == 1){
                System.out.println("Encontrado: " + r.getNombre());
            
            }
        
        
        }
    
    }



    
    
}
