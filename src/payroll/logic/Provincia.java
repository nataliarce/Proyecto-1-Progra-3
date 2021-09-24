/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

/**
 *
 * @author Michelle
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Provincia
{
    @XmlID
    private String numero;
    private String nombre;
    @XmlIDREF
    private List<Canton> cantones;
    
    public Provincia(String numero, String nombre, List<Canton> arrayCanton) {
        this.numero = numero;
        this.nombre = nombre;
        this.cantones = arrayCanton;
    }

    public Provincia() {
        this.numero = "";
        this.nombre = "";
        this.cantones = new ArrayList<>();
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

    public List<Canton> getArrayCanton() {
        return cantones;
    }

    public void setArrayCanton(List<Canton> arrayCanton) {
        this.cantones = arrayCanton;
    }
    
}
