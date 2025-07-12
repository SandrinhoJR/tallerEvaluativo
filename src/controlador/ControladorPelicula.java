/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Pelicula;

/**
 *
 * @author sandro rendon
 */
public class ControladorPelicula {
    
    ArrayList <Pelicula> peliculas = new ArrayList <>();
    
    public ArrayList <Pelicula> getPelicula() {
        return peliculas;
    }
    
     public boolean guardar(Pelicula pelicula) {
        peliculas.add(pelicula);
        return true;
    }
    
}
