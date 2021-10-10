/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

/**
 *
 * @author natalia, michelle
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Pago {
    private String fecha;
    private int numeroCuota;
    private float montoPagado;
    private float interes;
    private float amortizacion;

    public Pago(String fecha, int numeroCuota, float montoPagado, float interes, float amortizacion) {
        this.fecha = fecha;
        this.numeroCuota = numeroCuota;
        this.montoPagado = montoPagado;
        this.interes = interes;
        this.amortizacion = amortizacion;
    }

    public Pago() {
        this.fecha = "";
        this.numeroCuota = 0;
        this.montoPagado = 0;
        this.interes = 0;
        this.amortizacion = 0;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public float getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(float montoPagado) {
        this.montoPagado = montoPagado;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(float amortizacion) {
        this.amortizacion = amortizacion;
    }

    @Override
    public String toString() {
        return "Fecha" + fecha + "#" + numeroCuota + "Monto Pagado" + 
                montoPagado + "Interes" + interes + "Amortizacion" + amortizacion;
    }
    
    
    
}
