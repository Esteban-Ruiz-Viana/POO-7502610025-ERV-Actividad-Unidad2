package Taller_10_Sobrescritura.Ejercicio_3;

//Uso Incorrecto de Sobrescritura
//1. Intenta sobrescribir un método en una clase derivada cambiando su firma y observa los errores de compilación.
//2. Sobrescribe un método sin usar @Override y analiza por qué es una mala práctica.

public class Ejercicio_3 {

    public static void main( String[] args ) {

        //Polimorfismo: variable de tipo Vehiculo, objeto de tipo Coche
        Vehiculo coche1 = new Coche();

        //Ejecuta el metodo del Coche con velocidad 80
        coche1.acelerar( 80 );

        //Polimorfismo: variable de tipo Animal, objeto de tipo Gato
        Animal gato1 = new Gato();

        //Ejecuta el metodo del Gato (funciona, pero sin @Override es mala practica)
        gato1.hacerSonido();

    }
}