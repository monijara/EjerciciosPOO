package Ejercicio1;

public class Persona
{
    //Estos son los atributos
    private String nombre;
    private int edad;

    //Mi constructor para persona
    public Persona(String nombre, int edad)
    {
        this.nombre= nombre;
        this.edad=edad;
    }

    //Agrego el metodo para mostrar los datos de la persona
    public void mostrarDatos()
    {
        System.out.println("Nombre : "+nombre);
        System.out.println("Edad: " + edad);
    }


}
