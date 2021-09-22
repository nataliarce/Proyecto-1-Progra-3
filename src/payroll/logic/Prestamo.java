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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
public class Prestamo 
{
    @XmlID
    private double monto;
    private double plazo;
    private double tasaInteres;
    @XmlIDREF
    ArrayList<Pago> pagos;
    
    public Prestamo(double m, double p, double t)
    {
        this.monto = m;
        this.plazo = p;
        this.tasaInteres = t;  
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
    
    public double getTasaInteres()
    {
        return tasaInteres;
    }
    
    public void setTasaInteres(double tasa)
    {
        this.tasaInteres = tasa;
    }
    
    public double calcularCuota()
    {
        double x;
        double cuota;
        x = Math.pow((1+(tasaInteres/100)),-plazo);
        cuota= (monto*(tasaInteres/100)/(1-x));
        
        return cuota;
    }
    
    @Override
    public String toString()
    {
        return "Cuota: " + (int)getMonto() + "     Plazo: " + (int)getPlazo() + "      Interes: " + 
                (int)getTasaInteres() + "      Cuota: " + (int)calcularCuota();
    }
    
    public void anadirPago(String fecha, float monto)
    {
        Pago p;
        int numeroPago = pagos.size() + 1;
        
        if(monto == calcularCuota())
        {
            p = new Pago(fecha,numeroPago, monto, getInteresActual(), getAmortizacionActual());
            pagos.add(p);
        }
        else //caso especial, monto mayor a la cuota
        {
            if(monto > calcularCuota())
            {
                p = new Pago(fecha,numeroPago, monto, getInteresActual(), getAmortizacionActual());
                pagos.add(p);
                setMonto(this.monto - monto);
            }
            else
            {
                throw new IllegalArgumentException();
            }
        }
    }
    
    public float getInteresActual()
    {
        float interesActual = (float)(getMonto() * getTasaInteres() / 100);
        return interesActual;
    }
    
    public float getAmortizacionActual()
    {
        float amortizacionActual = (float)(calcularCuota() - getInteresActual());
        return amortizacionActual;
    }
    
    public String imprimeListaPagos()
    {
        String result = "";
        for(Pago p : pagos)
        {
            result += p.toString() + "\n";
        }
        return result;
    }
}
