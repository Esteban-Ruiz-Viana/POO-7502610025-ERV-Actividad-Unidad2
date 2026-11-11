package Taller_9_Uso_de_super.Ejercicio_3;

public class Ejercicio_3 {

    public static void main( String[] args ) {

        //ERROR: non-static variable super cannot be referenced from a static context
        //El main no es una clase hija, por eso aqui no se puede usar super
        //super.tipo = "Orquidea";

        //Forma correcta
        Orquidea orquidea1 = new Orquidea( "Orquidea" );
        System.out.println("\nObjeto creado correctamente.");

    }
}