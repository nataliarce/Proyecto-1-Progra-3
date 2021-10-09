/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;

import java.util.ArrayList;
import java.util.Objects;
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
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente {
    
   @XmlID
    private String cedula;
    private String nombre;
   @XmlIDREF
    private Provincia provincias;
   @XmlIDREF
    private Canton cantones;
   @XmlIDREF
    private Distrito distritos;
   //@XmlIDREF
    private ArrayList<Prestamo> prestamos; 

    public Cliente(String cedula, String nombre, Provincia provincia, 
            Canton canton, Distrito distrito) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.provincias = provincia;
        this.cantones = canton;
        this.distritos = distrito;
    }

    public Cliente() {
        this.cedula = "";
        this.nombre = "";
        this.provincias = new Provincia();
        this.cantones = new Canton();
        this.distritos = new Distrito();        
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
        return provincias;
    }

    public void setProvincia(Provincia provincia) {
        this.provincias = provincia;
    }

    public Canton getCanton() {
        return cantones;
    }

    public void setCanton(Canton canton) {
        this.cantones = canton;
    }

    public Distrito getDistrito() {
        return distritos;
    }

    public void setDistrito(Distrito distrito) {
        this.distritos = distrito;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    public void anadirPrestamo(String id, double monto, double plazo, double tasaInteres)
    {
        Prestamo p = new Prestamo(id,monto, plazo, tasaInteres);
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
                + cantones + ", distrito=" + distritos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
