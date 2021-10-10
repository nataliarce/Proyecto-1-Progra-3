/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.prestamos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import payroll.Application;
import payroll.logic.Cliente;
import payroll.logic.Pago;
import payroll.logic.Prestamo;
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
        this.model.setPrestamo(new Prestamo());
        this.model.setPrestamos(new ArrayList<>());
        this.model.setPago(new Pago());
        this.model.setPagos(new ArrayList<>());
        this.model.setCliente(new Cliente());
        
        // invoke Model sets for initialization before linking to the view
        // problably get the data from Service
        view.setModel(model);
        view.setController(this);
        
    }
    
    public void agregarPrestamo(Prestamo prestamo, String ced)
    {
        try 
        {
            Service.instance().agregarPrestamo(prestamo, ced);
            model.setPrestamo(new Prestamo("",0,0,0,new ArrayList<>()));
            model.setPrestamos(Arrays.asList(prestamo));
            model.commit();
            Service.instance().store(); 
        } 
        catch (Exception e) 
        {  
        }
    }
    
          public void prestamoSearch(String cedulaCliente)
    {
        try
        {
        List<Prestamo> prestamo = Service.instance().PrestamoSearch(cedulaCliente);
        model.setPrestamo(new Prestamo(cedulaCliente,0,0,0));
        model.setPrestamos(prestamo);
        model.commit();
        }
        catch (Exception e)
        {
        }
    }
    
          public void agregarPago(String fecha, int monto, String cedula,String id)
          {
              try
              {
                  Service.instance().agregarPago(fecha, monto, cedula,id);
                  model.setPago(new Pago("",0,0,0,0));
                  model.commit();
              }
              catch (Exception e)
              {
                  
              }
              
          }
    public void show(){
        
        model.setCliente(Application.PRINCIPAL.getCliente());
        this.view.setVisible(true);
        model.commit();
    }
    
    public void hide(){
        this.view.setVisible(false);
        Application.PRINCIPAL.show();
    }
}