/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;


import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import payroll.data.Data;
import payroll.data.XmlPersister;

/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
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
    private PdfListadoClientes pdfClientes;
    private PdfListadoPrestamos pdfPrestamos;
    private PdfListadoPagos pdfPagos;
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
       pdfClientes = new PdfListadoClientes();
       pdfPrestamos = new PdfListadoPrestamos();
       pdfPagos = new PdfListadoPagos();
    }
    
    public void agregar()
    {
        coordenadas = new ArrayList<>();
        coordenadas.add(new Rectangle(424,395,62,20)); //San Jose 
        coordenadas.add(new Rectangle(300,132,90,138)); //Alajuela
        coordenadas.add(new Rectangle(459,315,95,52)); //Cartago
        coordenadas.add(new Rectangle(400,145,50,94)); //Heredia
        coordenadas.add(new Rectangle(80,159,124,44)); //Guanacaste
        coordenadas.add(new Rectangle(547,511,121,74));  //Puntarenas
        coordenadas.add(new Rectangle(588,329,72,106)); //Limon

    }
     
    //*****************************Cliente**************************************
    public Cliente buscarClientePorCedula(String cedula) throws Exception
    {
        Cliente result = data.getClientes().stream().filter(c->c.getCedula().equals(cedula)).findFirst().orElse(null);

            if (result != null)
            {
                return result;
            }
            throw new Exception("Cliente no encontrado");
    }
    
    public Cliente clienteGet(String cedula) throws Exception{
        Cliente result=data.getClientes().stream().filter(c->c.getCedula().equals(cedula)).findFirst().orElse(null);
        if (result!=null) return result;
        else throw new Exception("Cliente no existe");   
    }
      
    public List<Cliente> clienteSearch(String cedula){

        List<Cliente> result=data.getClientes().stream().filter(c->c.getCedula().startsWith(cedula)).collect(Collectors.toList());
       return result;        
    }
  
    public List<Cliente> clienteAll(){
        return data.getClientes();       
    }
    
    public void agregarCliente(Cliente cliente) throws Exception
    {
        Cliente old = 
                data.getClientes().stream().filter(c->c.getCedula().equals(cliente.getCedula())).findFirst().orElse(null);
        if (old==null) data.getClientes().add(cliente);
        else throw new Exception("Cliente ya existe en el sistema"); 
    }
    
    //***************************Provincia**************************************
    public Provincia buscar(int x, int y) throws Exception
    {
        
      Provincia resultado = null;
      for (int i=0;i<7;i++)
      {
          if (coordenadas.get(i).contains(x,y))
          {
              resultado = this.data.getProvincia().get(i);
              return resultado;
          }
      }
      throw new Exception("Provincia no existe");
    }  
        
    public Provincia buscarProvinciaPorNombre(String nombreProvincia) throws Exception
    {
        for(Provincia p: this.data.getProvincia())
        {
            if(p.getNombre().equals(nombreProvincia))
            {
                return p;
            }
        }
        throw new Exception("Provincia no encontrada");
    }
    
    //*******************************Canton*************************************
    public List<Canton> buscarCanton(String nombreProvincia) throws Exception
    {
        List<Canton> resultado = null;
        for (Provincia p: this.data.getProvincia())
        {
             if (!" ".equals(nombreProvincia) && p.getNombre().equals(nombreProvincia))
             {
                  resultado = p.getArrayCanton();
                  return resultado;
             }
        }
        throw new Exception("Canton no existe");
    }
    
    public Canton buscarCantonPorNombre(String nombreCanton) throws Exception
    {
        Canton canton;
        for(Canton c: this.data.getCantones())
        {
            if(c.getNombre().equals(nombreCanton))
            {
                return c;
            }
        }
        throw new Exception("Canton no encontrado");
    }
        	
        
    //*******************************Distrito***********************************
    public List<Distrito> buscarDistrito(String nombreProvincia,String nombreCanton) throws Exception
    {
        List<Distrito> resultado = null;
        List<Canton> cantones = buscarCanton(nombreProvincia);
               

        for (int i = 0; i<cantones.size(); i++)
        {
            if (!"".equals(nombreCanton) && cantones.get(i).getNombre().equals(nombreCanton))
            {
                resultado = cantones.get(i).getDistritos();
                return resultado;
            }
 

        }
        throw new Exception("Distrito no existe");
    }
    
    
    public Distrito buscarDistritoPorNombre(String nombreDistrito) throws Exception
    {
        Distrito distrito;
        for(Distrito d: this.data.getDistritos())
        {
            if(d.getNombre().equals(nombreDistrito))
            {
                return d;
            }
        }
        throw new Exception("Distrito no encontrado");
    }
    //**************************************************************************
    
//    
//    
//    
//    
//                          SEGUNDA PANTALLA
//    
//    
//    
//    
//    
    //*****************************Prestamo*************************************

    public void agregarPrestamo(Prestamo prestamo,String cedula) throws Exception
    {
        
        Cliente cliente = clienteGet(cedula);
        cliente.getPrestamos().add(prestamo);
        
    }
        
    public List<Prestamo> todosLosPrestamos()
    {
        List<Cliente> clientes = clienteAll();
        for (Cliente c:clientes)
        {
            return c.getPrestamos();
        }
        return null;
    }
    
    public List<Prestamo> PrestamoSearch(String cedula) throws Exception
    {

        Cliente cliente = clienteGet(cedula);

         List<Prestamo> resultado = cliente.getPrestamos();
         return resultado;

    }

    

    
    public Prestamo PrestamoGet (String cedula, String id) throws Exception
    {
        Cliente cliente = clienteGet(cedula);
        
        Prestamo resultado = cliente.getPrestamos().stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
        
        if (resultado != null)
        {
            return resultado;
        }
        else 
        {
            throw new Exception ("Prestamo no encontrado");
        }
        
    }
    
    public List<Prestamo> prestamoAll() throws Exception
    {
        List<Cliente> clientes = clienteAll();
        
        
        for (Cliente c : clientes)
        {
            return c.getPrestamos();
        }
        
        throw new Exception (" ");
        
    }
    

    
    //*****************************Pagos****************************************

    public void agregarPago (String fecha, int monto, String cedula, String id) throws Exception
    {
        
        Prestamo prestamo = PrestamoGet(cedula,id);
        if (prestamo.getMonto() != 0)
        {
            prestamo.anadirPago(fecha, monto);
        }
        else 
        {
            throw new Exception ("Ya se pago todo el monto");
        }
    }
    
    public Pago pagoGet(String cedula, String id, String numero) throws Exception
    {
        
        Prestamo prestamo = PrestamoGet(cedula, id);
        Pago resultado = prestamo.getPagos().stream().filter(p->p.getFecha().equals(numero)).findFirst().orElse(null);
        
        if (resultado != null)
        {
            return resultado;
        }
        else 
        {
            throw new Exception ("Pagos no encontrado");
        }
    }
        //**************************************************************************
    
//    
//    
//    
//    
//                          TERCERA PANTALLA
//    
//    
//    
//    
//    
    //*******************************PDF CLIENTES*******************************
    
    public void crearPdfClientes(List<Cliente> clientes) throws Exception
    {
        pdfClientes.crearPdfClientes(clientes);
    }
    
    //*******************************PDF PRESTAMOS******************************
    
    public void crearPdfPrestamos(String id) throws Exception
    {
 
             pdfPrestamos.crearPdfPrestamos(id);
        
   
    }
    
    //*******************************PDF PAGOS**********************************
    
    public void crearPdfPagos(String cedula, String idPrestamo) throws Exception
    {
        pdfPagos.crearPdfPagos(cedula,idPrestamo);
    }
    
    //**************************************************************************
    public void store()
    {
        try 
        {
            XmlPersister.instance().store(data);
        } 
        catch (Exception ex) 
        {
        }
    }
    
        
}
