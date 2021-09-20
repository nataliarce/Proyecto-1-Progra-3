/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;


/*
Si el cliente hiciera un pago por un monto superior a la cuota eso disminuye de mayor manera el saldo del 
préstamo. En dicho caso deberá recalcularse la cuota, considerando el saldo remanente y el plazo restante. Así 
la nueva cuota mensual será menor que antes
*/
import java.util.ArrayList;
/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
public class Prestamo 
{
    private double monto;
    private double plazo;
    private double tasa;
    ArrayList<Mensualidad> men;
    
    public Prestamo(double m, double p, double t)
    {
        this.monto = m;
        this.plazo = p;
        this.tasa = t;
        this.men = getMensualidad();
      
    }
    
    public final ArrayList<Mensualidad> getMensualidad()
    {
        ArrayList<Mensualidad> mensualidades = new ArrayList();
        Mensualidad temp;
        double saldoActual = monto;
        double interesNuevo;
        double amortizacionActual;
        int nuevoNumero;
        
        for (int i=0;i<getPlazo();i++)
        {
            nuevoNumero = i+1;
            interesNuevo = (int) saldoActual * getTasa() / 100;
            amortizacionActual = (float) calcularCuota() - interesNuevo;
            temp = new Mensualidad(nuevoNumero, saldoActual, interesNuevo, amortizacionActual);
            mensualidades.add(temp);
            saldoActual = saldoActual - amortizacionActual;
            
        }
        
        return mensualidades;
    }

    public double getMonto()
    {
        return monto;
    }
    
    public void setMonto(double m)
    {
        this.monto = m;
    }
    
    public double getPlazo()
    {
        return plazo;
    }
    
    public void setPlazo(double p)
    {
        this.plazo = p;
    }
    
    public double getTasa()
    {
        return tasa;
    }
    
    public void setTasa(double tasa)
    {
        this.tasa = tasa;
    }
    
    public double calcularCuota()
    {
        double x;
        double cuota;
        x = Math.pow((1+(tasa/100)),-plazo);
        cuota= (monto*(tasa/100)/(1-x));
        
        return cuota;
    }
    
    public String toString()
    {
        return "Cuota: " + (int)getMonto() + "     Plazo: " + (int)getPlazo() + "      Interes: " + (int)getTasa() + "      Cuota: " + (int)calcularCuota();
    }
    
    public String toStringMensualidad()
    {
        System.out.println(toString());
        String imprime = " ";
        
        for (Mensualidad mensu : men)
        {
            imprime =  imprime + mensu.toStringM();
        } 
        
        return "Mensualidades: \n" + "No.  Saldo  Interes  Amort.\n" + imprime;
    }
    
        public double calcularInteres()
    {
        double aux = monto * (tasa/100);
        tasa = aux;
        return tasa;
    } 
}
