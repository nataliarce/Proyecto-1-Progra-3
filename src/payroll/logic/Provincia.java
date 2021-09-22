/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;
import java.util.ArrayList;

/**
 *
 * @author Michelle
 */
public class Provincia
{
    private String numero;
    private String nombre;
    private ArrayList<Canton> arrayCanton;

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

    public ArrayList<Canton> getArrayCanton() {
        return arrayCanton;
    }

    public void setArrayCanton(ArrayList<Canton> arrayCanton) {
        this.arrayCanton = arrayCanton;
    }
    
}
