package Taller_9_Uso_de_super.Ejercicio_1;

public class Persona {

    //Atributos ( protected )
    protected String nombre;
    protected int edad;

    //Constructor
    public Persona( String nombre, int edad ) {

        this.nombre = nombre;
        this.edad = edad;

    }

    //Metodo
    public void mostrarDetalles() {

        System.out.println( "\nPersona" + "\nNombre: " + nombre + "\nEdad: " + edad );

    }
}