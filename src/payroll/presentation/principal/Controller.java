/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import payroll.Application;
import payroll.logic.Canton;
import payroll.logic.Cliente;
import payroll.logic.Distrito;
import payroll.logic.Provincia;
import payroll.logic.Service;
/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
public class Controller  {
    Model model;
    View view;
    
    public Controller(Model model, View view) 
    {
        this.model = model;
        this.view = view;
        
      
        this.model.setProvincia(new Provincia());
        this.model.setCanton(new ArrayList<>());
        this.model.setDistritos(new ArrayList<>());
        this.model.setCliente(new Cliente());
        this.model.setClientes(new ArrayList<>());

        // invoke Model sets for initialization before linking to the view
        // problably get the data from Service
        view.setModel(model);
        view.setController(this);
        
    }
    
    public void show(){
        this.view.setVisible(true);
    }
    
    public void hide(){
        this.view.setVisible(false);
    }
    
    //*************************Provincia***************************************
    public Provincia consultarCoordenadas(int x, int y)
    {   
        try
        {
        Provincia result = Service.instance().buscar(x,y);
        model.setProvincia(result);
        model.commit();
        return result;
        }
        
        catch (Exception e)
        {
            model.setProvincia(new Provincia());
            model.commit();
        }
        return null;    
    }
    
    //****************************Provincia***************************************
    
    public Provincia buscarProvinciaPorNombre(String nombreProvincia)
    {
        try {
            Provincia result =
                    Service.instance().buscarProvinciaPorNombre(nombreProvincia);
            return result;
        } catch (Exception ex) {
            
        }
        return null;
    }
    
    //****************************Canton***************************************
    
    public List<Canton> consultarCanton(String text)
    {
        try 
        {
            List<Canton> result= Service.instance().buscarCanton(text);
            model.setCanton(result);
            model.commit();
            return result;
        }
        
        catch (Exception e)
        {
            model.setCanton(new ArrayList<>());
            model.commit();
        }
        return null;
    }
        
    //***************************Distrito***************************************
    public List<Distrito> consultarDistrito(String nombreProvincia, String nombreCanton)
    {
        try 
        {
            List<Distrito> result = Service.instance().buscarDistrito(nombreProvincia,nombreCanton);
            model.setDistritos(result);
            model.commit();
            return result;
        }
        
        catch (Exception e)
        {
            model.setDistritos(new ArrayList<>());
            model.commit();
        }
        return null;
    }
    
    //***************************Cliente****************************************
    public void consultarClientePorCedula(String cedula)
    {
        try
        {
        Cliente cliente = Service.instance().buscarClientePorCedula(cedula);
        model.setCliente(cliente);
        model.commit();
        }
        catch (Exception e)
        {
            model.setCliente(new Cliente());
            model.commit();
        }
    }
    
    public void agregarCliente(Cliente cliente)
    {
        try {
            Service.instance().agregarCliente(cliente);
            model.setCliente(new Cliente("","",new Provincia(), new Canton(), new Distrito()));
            model.commit();
        } catch (Exception e) {  
        
        }
    }
    
    //*************************Prestamos***************************************
    
    void mostrarPrestamos()
    {
        this.hide();
        Application.PRESTAMOS.show();
    }

}
