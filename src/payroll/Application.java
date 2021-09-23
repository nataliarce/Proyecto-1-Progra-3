/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import payroll.presentation.principal.Controller;
import payroll.presentation.principal.Model;
import payroll.presentation.principal.View;
/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */



public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        View view = new View();
        Model model = new Model();           
        Controller controller = new Controller(model, view);
        controller.show();
    }
    
}
