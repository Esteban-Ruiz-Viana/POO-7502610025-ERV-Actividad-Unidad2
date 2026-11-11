package Taller_10_Sobrescritura.Ejercicio_1;

//1. Define una clase Persona con un método presentarse que imprima un mensaje general.
//2. Define dos clases derivadas (Estudiante y Profesor) que sobrescriban el método presentarse para
// mostrar un mensaje específico.

public class Ejercicio_1 {

    public static void main( String[] args ) {

        //Polimorfismo: la lista es de tipo Persona, pero guarda tambien hijos
        Persona[] personas = {

                new Persona(),
                new Estudiante( "Ingenieria de Software" ),
                new Profesor( "Programacion Orientada a Objetos" )

        };

        //Recorre la lista y llama al mismo metodo en cada objeto
        for ( Persona persona : personas ) {

            //Java ejecuta la version del objeto real
            persona.presentarse();

        }
    }
}