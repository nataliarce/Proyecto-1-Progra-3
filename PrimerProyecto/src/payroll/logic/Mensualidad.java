/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;

/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
public class Mensualidad
{
    private double numero;
    private double saldo;
    private double amortizacion;
    private double interes;
    
      public Mensualidad(double n, double s,double i, double a)
    {
        this.numero = n;
        this.saldo = s;
        this.interes = i;
        this.amortizacion = a;
    }

    public Mensualidad()
    {
    }
    public double getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }
    
    public double getInteres() 
    {
        return interes;
    }

    public void setInteres(int interes) 
    {
        this.interes = interes;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(float saldo) 
    {
        this.saldo = saldo;
    }

    public double getAmortizacion() 
    {
        return amortizacion;
    }

    public void setAmortizacion(double amortizacion) {
        this.amortizacion = amortizacion;
    }
    
        public String toStringM()
    {
        return (int)getNumero() + ".  " +(int)getSaldo() + "   " + (int)getInteres() + "   " + (int)getAmortizacion() + "\n";
        
    }
}
