/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
public class Cliente {
    
    @XmlID
    private String cedula;
    private String nombre;
    @XmlIDREF
    private Provincia provincia;
    private Canton canton;
    private Distrito distrito;
    private ArrayList<Prestamo> prestamos; 

    public Cliente(String cedula, String nombre, Provincia provincia, 
            Canton canton, Distrito distrito) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
    }

    public Cliente() {
        this.cedula = "";
        this.nombre = "";
        this.provincia = new Provincia();
        this.canton = new Canton();
        this.distrito = new Distrito();
        
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    public void anadirPrestamo(double monto, double plazo, double tasaInteres)
    {
        Prestamo p = new Prestamo(monto, plazo, tasaInteres);
        prestamos.add(p);
    }
    
    public void anadirPago(Prestamo prestamo, String fecha, float monto)
    {
        for(Prestamo p : prestamos)
        {
            if(p.equals(prestamo))
            {
                p.anadirPago(fecha, monto);
                break;
            }
        }
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", canton=" 
                + canton + ", distrito=" + distrito + '}';
    }
    
    
    
}
