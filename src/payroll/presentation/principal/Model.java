/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.principal;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import payroll.logic.Canton;
import payroll.logic.Cliente;
import payroll.logic.Provincia;


/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
public class Model extends Observable{
    
    
    private Cliente cliente;
    private Provincia provincia;
    private List<Canton> canton;
    private List<Cliente> clientes;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    public List<Canton> getCanton() {
        return canton;
    }

    public void setCanton(List<Canton> canton) {
        this.canton = canton;
    }


    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();
    }
    
}