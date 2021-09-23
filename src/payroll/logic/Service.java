/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;

//da servicio a cualquiera de las pantallas, para diferentes peticiones como pagos 

import java.awt.Rectangle;
import java.util.ArrayList;
import payroll.data.Data;
import payroll.data.XmlPersister;


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
     
     
    private Data data;
    //-----------------------------------
     
    ArrayList<Rectangle> coordenadas;
       
    
    public Service()
    {
       try 
       {
           data = XmlPersister.instance().load();
       }
       catch (Exception e)
       {
           data = new Data();
       }
       agregar();
    }
    
    public void agregar()
    {
        coordenadas.add(new Rectangle(424,395,62,20)); //San Jose 
        coordenadas.add(new Rectangle(300,132,90,138)); //Alajuela
        coordenadas.add(new Rectangle(459,315,95,52)); //Cartago
        coordenadas.add(new Rectangle(400,145,50,94)); //Heredia
        coordenadas.add(new Rectangle(80,159,124,44)); //Guanacaste
        coordenadas.add(new Rectangle(555,456,58,39));  //Puntarenas
        coordenadas.add(new Rectangle(588,329,72,106)); //Limon
       
//        coordenadas.add(new Rectangle(318,333,89,49)); //San Jose2
//        coordenadas.add(new Rectangle(188,91,168,35)); //Alajuela2     
//        coordenadas.add(new Rectangle(475,192,77,13)); //Limon2       
//        coordenadas.add(new Rectangle(555,456,58,39)); //Puntarenas2
//        coordenadas.add(new Rectangle(242,246,38,44)); //Puntarenas3
//        coordenadas.add(new Rectangle(173,314,33,42)); //Puntarenas4
//        coordenadas.add(new Rectangle(593,4,251,263)); //Normal
//        coordenadas.add(new Rectangle(10,404,428,324)); //Normal2
    }
     
    public Provincia buscar(double x, double y) throws Exception
    {
      Provincia resultado = null;
      for (int i=0;i<coordenadas.size();i++)
      {
          if (coordenadas.get(i).contains(x,y))
          {
              resultado = this.data.getProvincia().get(i+1);
              return resultado;
          }
      }
      throw new Exception("Provincia no existe");
    }               
}
