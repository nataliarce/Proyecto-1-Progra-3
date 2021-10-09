/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.prestamos;

import payroll.Application;
import payroll.logic.Cliente;
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
        this.model.setCliente(new Cliente());
        
        // invoke Model sets for initialization before linking to the view
        // problably get the data from Service
        view.setModel(model);
        view.setController(this);
        
    }
    
    public void agregarPrestamo(Prestamo prestamo)
    {
        try {
            Service.instance().agregarPrestamo(prestamo);
            model.commit();
            Service.instance().store(); 
        } catch (Exception e) {  
        
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