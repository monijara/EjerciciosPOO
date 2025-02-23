import Ejercicio1.Persona;
import Ejercicio3.CuentaBancaria;
import Ejercicio4.Auto;
import Ejercicio5.Estudiante;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        /* Ejercicio 1   */


        //Voy a crear el objeto de persona

        /*Ejercicio 2  */

        // Persona pers= new Persona("Monica", 42);
       // Persona pers2= new Persona("Juan",35 );

        // Muestro el nombre y la edad
       //  pers.mostrarDatos();
         //pers2.mostrarDatos();



         /*Ejercicio 3 */

        //Acá cuando creo la cuenta en el main, cargo con los datos también
        //CuentaBancaria cuentaB1= new CuentaBancaria("Samuel", 1056);
       // CuentaBancaria cuentaB2= new CuentaBancaria("Samuel", 100);
        //Extends
        //Auto miAuto= new Auto("Audi3", 2025, 5);
        //miAuto.mostrarVehiculo();

       /* Ejercicio 4*/


        //Empiezo a operar
       // cuentaB1.depositar(1000);
        //cuentaB2.retirar(300);
        //System.out.println("Saldo final: "+cuentaB2.getSaldo());

        /* Ejercicio 5*/

        ArrayList<Estudiante> estudiantes= new ArrayList<>();
        //Agrego los 3 estudiantes
        estudiantes.add(new Estudiante("Juan   ", "9"));
        estudiantes.add(new Estudiante("Pedro  ","7"));
        estudiantes.add(new Estudiante("Maria  ","9"));

        //Ahora muestro los 3 estudiantes que agregue
        System.out.println("La lista de estudiantes");
        for(Estudiante estudiante: estudiantes)
        {
            estudiante.mostrarEstudiantes();
        }

    }
}
