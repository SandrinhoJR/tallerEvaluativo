/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Actor;

/**
 *
 * @author sandro rendon
 */
public class ControladorActor {
    
    ArrayList <Actor> actores = new ArrayList<>();
    
    public ArrayList <Actor> getActores() {
        return actores;
    }
    public boolean guardar (Actor actor) {
        actores.add(actor);
        return true;
    }
    
    public Actor buscar(String Nombre) {
        for (Actor actor : actores) {
            if (actor.getNombre().equals(Nombre)) {
                return actor;
            }
        }
        return null;
    }
    
      public boolean editar(Actor actor) {
        Actor aux = buscar(actor.getNombre());
        if (aux != null) {
            aux.setNombre(actor.getNombre());
            aux.setPersonaje(actor.getPersonaje());

            return true;
        }
        return false;
    }
      
       public boolean eliminar(String nombre) {
        for (int i = 0; i < actores.size(); i++) {
            if (actores.get(i).getNombre().equals(nombre)) {
                actores.remove(i);
                return true;
            }
        }
        return false;
    }
       
         public DefaultTableModel listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Personaje"});
        ArrayList<Actor> propietarios = getActores();
        for (Actor actor : actores) {
            modelo.addRow(new Object[]{
                actor.getNombre(),
                actor.getPersonaje(),});
        }
        return modelo;
    }
      
}
