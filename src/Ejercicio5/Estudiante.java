package Ejercicio5;

public class Estudiante
{
    private String nombre;
    private String nota;


    public Estudiante(String nombre, String nota) {
        this.nombre = nombre;
        this.nota= nota;
    }


    public void mostrarEstudiantes() {
        System.out.println("Nombre: " + nombre + "Nota: " + nota);
    }
}
