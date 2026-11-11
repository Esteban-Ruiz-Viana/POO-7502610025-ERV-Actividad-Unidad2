package Taller_9_Uso_de_super.Ejercicio_2;

public class Animal {

        //Atributo
        protected String especie;

        //Constructor
        public Animal( String especie ) {

            this.especie = especie;

        }

        // Metodo
        public void mostrarEspecie() {

            System.out.println( "\nEspecie: " + especie );

        }
}
