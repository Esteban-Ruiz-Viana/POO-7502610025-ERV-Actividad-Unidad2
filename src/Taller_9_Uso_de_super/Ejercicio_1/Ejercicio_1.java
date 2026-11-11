package Taller_9_Uso_de_super.Ejercicio_1;

//1. Define una clase Persona con los atributos nombre y edad, y un método mostrarDetalles.
//2. Define una clase Empleado que herede de Persona y agregue un atributo departamento.
//3. En la clase Empleado, sobrescribe el método mostrarDetalles para mostrar también el departamento utilizando super.

public class Ejercicio_1 {

    public static void main( String[] args ) {

        //Datos asignados
        Persona persona1 = new Persona( "Esteban", 18 );
        Empleado empleado1 = new Empleado( "John", 20, "Publicidad" );

        //Mostrar detalles
        persona1.mostrarDetalles();
        empleado1.mostrarDetalles();

    }
}