package Taller_10_Sobrescritura.Ejercicio_2;

//1. Define una clase Vehiculo con un método moverse que imprima un mensaje general.
//2. Define una clase Bicicleta que sobrescriba el método moverse para mostrar un mensaje específico.
//3. Crea una clase de prueba para instanciar objetos de Vehiculo y Bicicleta y demostrar la sobrescritura de métodos.

public class Ejercicio_2 {

    public static void main( String[] args ) {

        //Objeto normal de Vehiculo
        Vehiculo vehiculo1 = new Vehiculo();

        //Polimorfismo: la variable es Vehiculo, pero el objeto es una Bicicleta
        Vehiculo bicicleta1 = new Bicicleta();

        //Muestra el mensaje general
        vehiculo1.moverse();

        //Muestra el mensaje de la bicicleta
        bicicleta1.moverse();

    }
}