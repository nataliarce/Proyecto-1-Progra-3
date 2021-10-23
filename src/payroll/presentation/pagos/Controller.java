/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.pagos;

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
        this.model.setPago(new Pago());
        this.model.setPagos(new ArrayList<>());
        this.model.setPrestamo(new Prestamo());
        this.model.setCliente(new Cliente());
        // invoke Model sets for initialization before linking to the view
        // problably get the data from Service
        view.setModel(model);
        view.setController(this);
        
    }
 
    public Pago getPago()
    {
        return this.model.getPago();
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

    public void consultarPago(String cedula, String idPrestamo, String fecha)
    {
        try
        {
            Pago pagos = Service.instance().pagoGet(cedula, idPrestamo,fecha);
            model.setPago(pagos);
            model.commit();
            
        }
        catch (Exception e)
        {
            model.setPago(new Pago());
            model.commit();
        }
    }
   
    public void getPagos()
    {
        try
        {
            List<Pago> pagos = Service.instance().pagoAll();
            model.setPagos(pagos);
            model.commit();
        }
        catch (Exception e)
        {
            
        }
    }
    public void pagoSearch(String cedulaCliente, String idPrestamo)
    {
        try
        {
        List<Pago> pago = Service.instance().PagoSearch(cedulaCliente, idPrestamo);
        model.setPago(new Pago(" ",0,0,0,0));
        model.setPagos(pago);
        model.commit();
        }
        catch (Exception e)
        {
        }
    }
    public void show(){
        
        model.setPrestamo(Application.PRESTAMOS.getPrestamo());
        model.setCliente(Application.PRINCIPAL.getCliente());
        this.view.setVisible(true);
        model.commit();
    }
    
    public void hide(){
        this.view.setVisible(false);
        Application.PRESTAMOS.show();
    }
    
    public void hide2()
    {
        this.view.setVisible(false);
    }
        //**************************REPORTES****************************************
    
    void mostrarReportes()
    {
        this.hide2();
        Application.REPORTES.show();
    }
}
