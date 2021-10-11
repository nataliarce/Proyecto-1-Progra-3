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
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Prestamo 
{
    private String id;
    private double monto;
    private double plazo;
    private double tasaInteres;
    private List<Pago> pagos;
    
    public Prestamo()
    {
        this.id = "";
        this.monto = 0;
        this.plazo = 0;
        this.tasaInteres = 0;  
        this.pagos = new ArrayList<>();
    }

    public Prestamo(String id,double monto, double plazo, double tasaInteres, List<Pago> pagos) {
        this.id = id;
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
        this.pagos = pagos;
        
    }
    
    
    public Prestamo( String id,double monto, double plazo, double tasaInteres) {
        this.id = id;
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
        this.pagos = new ArrayList<>();
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }
    
    
    public double calcularCuota()
    {
        double x;
        double cuota;
        x = Math.pow((1+(tasaInteres/100)),-plazo);
        cuota= (monto*(tasaInteres/100)/(1-x));
        
        return (int)cuota;
    }
    
    @Override
    public String toString()
    {
        return "Id" + getId() + "Monto" + (double)getMonto() + "Plazo: " + (double)getPlazo() + "Tasa Interes" + 
                (double)getTasaInteres() + "Cuota" + (double)calcularCuota();
    }
    
    public String pdftoString()
    {
        return "Id: " + getId() + "\n" + "Monto: " + (int)getMonto() +  "\n" + "Plazo: " + (int)getPlazo() + "\n" + "Tasa de Interes: " +
                (int)getTasaInteres() + "\n" + "Cuota: " + (int)calcularCuota();
                
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
                JOptionPane.showMessageDialog(null, "El pago no puede ser menor a la cuota");
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
