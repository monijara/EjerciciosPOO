package Ejercicio4;
//Esta es la clase deribada, uso extend
public class Auto extends Vehiculo{
    private int numPuerta;

    public Auto(String marca, int modelo, int numPuerta) {
        //Mi constructor llama al constructor original y ademas agrego el atributo propio de la clase Auto
        super(marca, modelo);
        this.numPuerta=numPuerta;
    }

    @Override
    public void mostrarVehiculo() {
        super.mostrarVehiculo();
        System.out.println("El auto tiene " + numPuerta + " puertas");
    }

}
