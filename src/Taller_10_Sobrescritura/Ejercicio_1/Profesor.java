package Taller_10_Sobrescritura.Ejercicio_1;

public class Profesor extends Persona {

    //Atributo adicional
    private String materia;

    //Constructor
    public Profesor( String materia ) {

        this.materia = materia;

    }

    //Sobrescribe el metodo de Persona
    @Override
    public void presentarse() {

        System.out.println( "\nHola, soy profesor de " + materia + "." );

    }
}