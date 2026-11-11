package Taller_9_Uso_de_super.Ejercicio_2;

//1. Define una clase Animal con un atributo especie y un método mostrarEspecie.
//2. Define una clase Pez que herede de Animal y agregue un atributo tipoDeAgua.
//3. Utiliza super para invocar el constructor y el método de la clase base desde Pez.

public class Ejercicio_2 {

    public static void main( String[] args ) {

        //Datos ingresados
        Animal animal1 = new Animal( "Perro" );
        Pez pez1 = new Pez( "Atun", "Salada" );

        //Retorno en pantalla
        animal1.mostrarEspecie();
        pez1.mostrarEspecie();

    }
}