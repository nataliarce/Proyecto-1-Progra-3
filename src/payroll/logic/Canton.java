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
public class Canton
{
    private String numero;
    private String nombre;
    private ArrayList<Distrito> arrayDistrito;

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

    public ArrayList<Distrito> getArrayDistrito() {
        return arrayDistrito;
    }

    public void setArrayDistrito(ArrayList<Distrito> arrayDistrito) {
        this.arrayDistrito = arrayDistrito;
    }
    
}