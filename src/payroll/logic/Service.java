/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;

//da servicio a cualquiera de las pantallas, para diferentes peticiones como pagos 
//patron singleton 
/**
 *
 * @author natalia, michelle
 */
public class Service {
    
    private static Service theInstance;
     public static Service instance(){
        if (theInstance==null){ 
            theInstance=new Service();
        }
        return theInstance;
    }
    
    
    
}
