/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.data;

/**
 *
 * @author Michelle
 */
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import payroll.logic.Canton;
import payroll.logic.Cliente;
import payroll.logic.Prestamo;
import payroll.logic.Provincia;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {
    private List<Cliente> clientes;    
    //private List<Prestamo> prestamo;     
    private List<Provincia> provincias;
    //private List<Canton> cantones;

    public Data() {
        clientes = new ArrayList<>();
        //prestamo = new ArrayList<>();
        provincias = new ArrayList<>();

        
    }

//    public List<Prestamo> getPrestamo() {
//        return prestamo;
//    }
//
//    public void setPrestamo(List<Prestamo> prestamo) {
//        this.prestamo = prestamo;
//    }

    public List<Provincia> getProvincia() {
        return provincias;
    }

    public void setProvincia(List<Provincia> provincias) {
        this.provincias = provincias;
    }

//    public List<Canton> getCantones() {
//        return cantones;
//    }
//
//    public void setCantones(List<Canton> cantones) {
//        this.cantones = cantones;
//    }
   
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
