
package data;

import model.Recorridos;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class GestorDatos {
    public ArrayList<Recorridos> cargarTours(String rutaArchivo){
        ArrayList<Recorridos> lista = new ArrayList<>();
        
        try{
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);
            
            while (lector.hasNextLine()){
                String linea = lector.nextLine();
                
                String[] partes = linea.split(";");
                if (partes.length == 3){
                    String nombre = partes[0];
                    int dias = Integer.parseInt(partes[1]);
                    int precio = Integer.parseInt(partes[2]);
                    
                    lista.add(new Recorridos(nombre, dias, precio));      
                }
            }
            lector.close();
        } catch (Exception e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    
    }
    
}
