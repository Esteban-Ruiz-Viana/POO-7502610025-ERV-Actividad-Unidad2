package Taller_10_Sobrescritura.Ejercicio_3;

public class Coche extends Vehiculo {

    //ERROR de compilacion: method does not override or implement a method from a supertype
    //No recibe la velocidad, entonces no es el mismo metodo del padre
    //@Override
    //public void acelerar() {
        //System.out.println( "El coche acelera." );
    //}

    //Forma correcta: mismo nombre y mismo parametro que el padre
    @Override
    public void acelerar( int velocidad ) {

        System.out.println( "El coche acelera a " + velocidad + " km/h." );

    }
}