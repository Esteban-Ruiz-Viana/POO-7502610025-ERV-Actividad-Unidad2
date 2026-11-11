package Taller_10_Sobrescritura.Ejercicio_1;

public class Estudiante extends Persona {

    //Atributo adicional
    private String carrera;

    //Constructor
    public Estudiante( String carrera ) {

        //Java llama solo a super() de Persona porque no tiene parametros
        this.carrera = carrera;

    }

    //Sobrescribe el metodo de Persona
    @Override
    public void presentarse() {

        System.out.println( "\nHola, soy estudiante de " + carrera + "." );

    }
}