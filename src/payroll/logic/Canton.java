/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
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
    //XmlIDREF
    //private ArrayList<Distrito> arrayDistrito;

    public Canton(String numero, String nombre) 
    {
       this.numero = numero;
       this.nombre = nombre;
    }

    public Canton()
    {
        this.numero = "";
        this.nombre = "";
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

//    public ArrayList<Distrito> getArrayDistrito() {
//        return arrayDistrito;
//    }
//
//    public void setArrayDistrito(ArrayList<Distrito> arrayDistrito) {
//        this.arrayDistrito = arrayDistrito;
//    }
    
}
