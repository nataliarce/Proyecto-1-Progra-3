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
        /*
        
        List<String> cantonesSJ = new ArrayList<>();
        Collections.addAll(cantonesSJ, "San Jose", "Escazu", "Desamparados", 
                "Puriscal", "Tarrazu", "Aserri", "Mora", "Goicoeches", "Santa Ana", "Alajuelita", "Coronoado",
                "Acosta", "Tibaa", "Moravia", "Montes de Oca", "Turrubares", "Dota", "Perez Zeledon", "León Cortés Castro",
                "Alajuelita");
        
        List<String> cantonesAlajuela = new ArrayList<>();
        Collections.addAll(cantonesAlajuela, "Alajuela", "San Ramón", "Grecia", "San Mateo", 
                "Atenas", "Naranjo", "Palmares", "Poás", "Orotina", "San Carlos", 
                "Zarcero", "Valverde Vega", "Upala", "Los Chiles", "Guatuso");

        List<String> cantonesCartago = new ArrayList<>();
        Collections.addAll(cantonesCartago, "Cartago", "Paraíso", "La Unión", 
                "Jiménez", "Turrialba", "Alvarado", "Oreamuno", "El Guarco");
        
        List<String> cantonesHeredia = new ArrayList<>();
        Collections.addAll(cantonesHeredia, "Heredia", "Barva", "Santo Domingo", "Santa Bárbara", 
                "San Rafael", "San Isidro", "Belén", "Flores", "San Pablo", "Sarapiquí");
        
        List<String> cantonesGuanacaste = new ArrayList<>();
        Collections.addAll(cantonesGuanacaste, "Liberia", "Nicoya", "Santa Cruz", "Bagaces", "Carrillo", "Cañas", 
                "Abangares", "Tilarán", "Nandayure", "La Cruz", "Hojancha");
        
        List<String> cantonesPuntarenas = new ArrayList<>();
        Collections.addAll(cantonesPuntarenas, "Puntarenas", "Esparza", "Buenos Aires", 
                "Montes de Oro", "Osa", "Aguirre", "Golfito", "Coto Brus", "Parrita", "Corredores", 
                "Garabito", "Monteverde");
        
        List<String> cantonesLimon = new ArrayList<>();
        Collections.addAll(cantonesLimon, "Limón", "Pococí", "Siquirres", "Talamanca", "Matina", "Guacimo");
        
        
        
        
        
        //View v = new View();
        view.setVisible(true);
*/
    }
    
}
