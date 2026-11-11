package Taller_10_Sobrescritura.Ejercicio_2;

public class Bicicleta extends Vehiculo {

    //Sobrescribe el metodo de Vehiculo con un mensaje propio
    @Override
    public void moverse() {

        System.out.println( "\nLa bicicleta avanza con pedaleo." );

    }
}