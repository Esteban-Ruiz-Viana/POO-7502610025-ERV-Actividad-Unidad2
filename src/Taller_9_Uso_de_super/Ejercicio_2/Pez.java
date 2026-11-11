package Taller_9_Uso_de_super.Ejercicio_2;

public class Pez extends Animal {

    //Atributo adicional
    private String tipoDeAgua;

    //Constructor
    public Pez( String especie, String tipoDeAgua ) {

        //Llama al constructor de Animal
        super( especie );
        this.tipoDeAgua = tipoDeAgua;

    }

    //Sobrescribe el metodo de Animal
    @Override
    public void mostrarEspecie() {

        //Llama al metodo de Animal y agrega el tipo de agua
        super.mostrarEspecie();
        System.out.println( "Tipo de agua: " + tipoDeAgua );

    }
}