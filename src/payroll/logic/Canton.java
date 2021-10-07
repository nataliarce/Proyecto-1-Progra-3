/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
/**
 *
 * @author Michelle
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Canton
{
    @XmlID
    private String numero;
    private String nombre;
    @XmlIDREF
    private List<Distrito> arrayDistrito;

    public Canton(String numero, String nombre, List<Distrito> distritos) 
    {
       this.numero = numero;
       this.nombre = nombre;
       this.arrayDistrito = distritos;
    }

    public Canton()
    {
        this.numero = "";
        this.nombre = "";
        this.arrayDistrito = new ArrayList<>();
    }
    
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Distrito> getArrayDistrito() {
        return arrayDistrito;
    }

    public void setArrayDistrito(List<Distrito> arrayDistrito) {
        this.arrayDistrito = arrayDistrito;
    }

    @Override
    public String toString() {
        return  nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Canton other = (Canton) obj;
        if (!Objects.equals(this.arrayDistrito, other.arrayDistrito)) {
            return false;
        }
        return true;
    }

 
    
    
}
