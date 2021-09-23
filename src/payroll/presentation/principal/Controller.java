/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.principal;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import payroll.logic.Cliente;
import javax.swing.ImageIcon;
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
      //  this.model.setCliente(new Cliente());
      this.model.setProvincia(new Provincia());

        // invoke Model sets for initialization before linking to the view
        // problably get the data from Service
        view.setModel(model);
        view.setController(this);
        
    }
    
    public void show(){
        this.view.setVisible(true);
    }
    public Provincia consultarCoordenadas(int x,int y)
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
    // Controller methods that respond to View events
    // probably invoke methods from Service,
    // and set data to Model, which in turn causes the View to update 
}

//     for (int i=0;i<coordenadas.size();i++)
//      {
//          if (coordenadas.get(i).contains(coordenadas.get(i).x,coordenadas.get(i).y))
//          {
//              return data.getProvincia();
//          }
//      }
//      return null;