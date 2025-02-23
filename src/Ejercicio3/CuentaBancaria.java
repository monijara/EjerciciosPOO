package Ejercicio3;

public class CuentaBancaria
{
    private String titular;
    private double saldo;



    //No lleva void ni nada
    public  CuentaBancaria(String titular, double saldo)
    {
        this.titular=titular;
        this.saldo=saldo;
    }

    public void depositar(double cantidad)
    {
        if(cantidad>0)
        {
            saldo= saldo+cantidad;
            System.out.println("Deposito ok, Saldo Actual : "+saldo);
        }
        else {
            System.out.println("Para realizar depositos, el monto debe ser mayor a 0");
        }
    }

    public void retirar(double cantidad)
    {
        if(cantidad>0 && cantidad<=saldo)
        {
            saldo= cantidad - saldo;
            System.out.println("Retiraste el monto de: " +cantidad);
            System.out.println("Tu saldo actual es de : "+saldo);
        } else if (cantidad>saldo)
        {
            System.out.println("Ingrese un monto menor, saldo insuficiente");

        } else {
            System.out.println("El monto debe ser mayor a 0");
        }
    }
     //Obtengo el saldo
    public double getSaldo() {
        return saldo;
    }
}
