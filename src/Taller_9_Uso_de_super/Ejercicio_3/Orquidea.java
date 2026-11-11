package Taller_9_Uso_de_super.Ejercicio_3;

public class Orquidea extends Planta {


    //Constructor
    public Orquidea( String tipo ) {

        //Llama al constructor de Planta para guardar el tipo
        super( tipo );

    }

    //Metodo
    public void cambiarTipo() {

        //ERROR: tipo has private access in Planta
        //super no sirve para entrar a lo que es private
        //super.tipo = "Rosa";

    }
}