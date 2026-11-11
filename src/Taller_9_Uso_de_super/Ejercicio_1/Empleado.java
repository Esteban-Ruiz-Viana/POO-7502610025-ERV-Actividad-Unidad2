package Taller_9_Uso_de_super.Ejercicio_1;

public class Empleado extends Persona {

    //Atributo adicional
    private String departamento;

    //Constructor
    public Empleado( String nombre, int edad, String departamento ) {

        //Llama al constructor de Persona
        super( nombre, edad );
        this.departamento = departamento;

    }

    //Sobrescribe el metodo de Persona
    @Override
    public void mostrarDetalles() {

        //Reutiliza lo que ya hace Persona
        super.mostrarDetalles();
        System.out.println( "Departamento: " + departamento );

    }
}