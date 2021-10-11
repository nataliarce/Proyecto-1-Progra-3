/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.reportes;
import java.util.List;
import javax.swing.JOptionPane;
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
    payroll.presentation.reportes.Model model;
    payroll.presentation.reportes.View view;
    
    public Controller(Model model, View view) 
    {
        this.model = model;
        this.view = view;     
        
        this.model.setClientes(payroll.logic.Service.instance().clienteAll());
        this.model.setCliente(new Cliente());
        this.model.setPrestamo(new Prestamo());

        // invoke Model sets for initialization before linking to the view
        // problably get the data from Service
        view.setModel(model);
        view.setController(this);
        
    }
    
    public void crearPdfClientes(List<Cliente> clientes)
    {
        try
        {
            Service.instance().crearPdfClientes(clientes);
            JOptionPane.showMessageDialog(null,"Se ha creado el pdf correctamente");
            model.commit();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se pudo crear el pdf");
        }
    }
    
    public void crearPdfPrestamos(String id)
    {
        try
        {
            Service.instance().crearPdfPrestamos(id);
            JOptionPane.showMessageDialog(null,"Se ha creado el pdf correctamente");
            model.commit();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se pudo crear el pdf");
        }
    }   
    
    public void crearPdfPagos(String cedula, String idPrestamo)
    {
        try
        {
            Service.instance().crearPdfPagos(cedula,idPrestamo);
            JOptionPane.showMessageDialog(null,"Se ha creado el pdf correctamente");
            model.commit();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se pudo crear el pdf");
        }
    }
    

    public void show(){
        model.setCliente(Application.PRINCIPAL.getCliente());
        model.setPrestamo(Application.PRESTAMOS.getPrestamo());
        this.view.setVisible(true);
        model.commit();
    }
    
    public void hide(){
        this.view.setVisible(false);
        Application.PRESTAMOS.show();
    }
    
    public void exit(){
        Service.instance().store();
    }
    

}
