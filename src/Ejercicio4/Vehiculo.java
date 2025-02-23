package Ejercicio4;

public class Vehiculo {
    private String marca;
    private int modelo;

//constructor
    public Vehiculo(String marca, int modelo)
    {
        this.marca= marca;
        this.modelo=modelo;

    }
    //No recibe nada
    public void mostrarVehiculo()
    {
        System.out.println("La marca del vehiculo es: " + marca);
        System.out.println("El modelo del vehiculo es: " + modelo);
    }


}
