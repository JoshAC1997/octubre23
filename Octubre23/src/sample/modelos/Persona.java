package sample.modelos;

import java.util.ArrayList;

/**
 * Created by Josue on 23/10/2017.
 */
public class Persona {

    public String nombre;
    public String apellido;
    public int edad;
    public int posicion;
    public String Nombre;


    private static Persona[] personas = new Persona[]{

            new Persona("David", "Martinez", 20),
            new Persona("David", "Delcid", 22),
            new Persona("Juan", "Veliz", 20),
            new Persona("Josue", "Cordova", 21),
            new Persona("Yarince", "Padilla", 25),
            new Persona("Tulio", "Garcia", 20),
            new Persona("Orlando", "Calix", 23),
    };

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static Persona buscarPorPosicion(int posicion){
     try{
            return personas[posicion];
        }
        catch(IndexOutOfBoundsException e){
        return null;}
    }


    public static Persona buscarporNombre(String nombre) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].nombre.equals(nombre)) {
                return personas[i];
            }
        }
        return null;
    }

    public static Persona getPersona() {
        if (personas.length > 0) {
            for (int x = 0; x < personas.length; x++) {
                return personas[x];
            }
        }
        return null;
    }


}
