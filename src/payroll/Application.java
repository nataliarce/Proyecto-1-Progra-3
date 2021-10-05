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
       
        
        payroll.presentation.prestamos.Model modelPrestamos = new payroll.presentation.prestamos.Model();
        payroll.presentation.prestamos.View viewPrestamos = new payroll.presentation.prestamos.View();
        payroll.presentation.prestamos.Controller controllerPrestamos = new payroll.presentation.prestamos.Controller(modelPrestamos, viewPrestamos);
        PRESTAMOS = controllerPrestamos;
        
        payroll.presentation.principal.Model modelPrincipal=new payroll.presentation.principal.Model() ;
        payroll.presentation.principal.View viewPrincipal = new payroll.presentation.principal.View();
        payroll.presentation.principal.Controller controllerPrincipal = new payroll.presentation.principal.Controller(modelPrincipal,viewPrincipal);       
        PRINCIPAL = controllerPrincipal;
        
        PRINCIPAL.show();
    }
    
    public static payroll.presentation.principal.Controller PRINCIPAL;
    public static payroll.presentation.prestamos.Controller PRESTAMOS;
    
}
