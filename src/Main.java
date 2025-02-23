import Ejercicio1.Persona;
import Ejercicio3.CuentaBancaria;
import Ejercicio4.Auto;

public class Main
{
    public static void main(String[] args) {

        //Voy a crear el objeto de persona

        //Persona pers= new Persona("Monica", 42); //Ejercicio 1
       // Persona pers2= new Persona("Juan",35 );

        // Muestro el nombre y la edad
       //  pers.mostrarDatos();
         //pers2.mostrarDatos();

         //Ejercicio 3
        //Acá cuando creo la cuenta en el main, cargo con los datos también
        CuentaBancaria cuentaB1= new CuentaBancaria("Samuel", 1056);
        CuentaBancaria cuentaB2= new CuentaBancaria("Samuel", 100);
        //Extends
        Auto miAuto= new Auto("Audi3", 2025, 5);
        miAuto.mostrarVehiculo();

        //Empiezo a operar
        cuentaB1.depositar(1000);
        cuentaB2.retirar(300);
        System.out.println("Saldo final: "+cuentaB2.getSaldo());


    }
}
