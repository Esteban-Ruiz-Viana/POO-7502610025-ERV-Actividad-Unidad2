package Taller_10_Sobrescritura.Ejercicio_3;

public class Gato  extends Animal {

    //MALA PRACTICA: sobrescribe sin @Override
    //Compila, pero si se escribe mal el nombre (por ejemplo "hacerSonid0")
    //Java crea un metodo nuevo y no avisa del error
    public void hacerSonido() {

        System.out.println( "El gato maulla." );

    }
}