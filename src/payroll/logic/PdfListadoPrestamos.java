/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.List;
/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
public class PdfListadoPrestamos
{


    public PdfListadoPrestamos()
    {
    }
    
    
       public void crearPdfPrestamos(String idCliente) throws Exception
    {
        Cliente resultado = payroll.logic.Service.instance().clienteGet(idCliente);
        //PdfFont font = PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
        Document documento = new Document();
        FileOutputStream archivo = new FileOutputStream("listadoPrestamos" + idCliente + ".pdf");
        
        
        PdfWriter.getInstance(documento, archivo);
        
        documento.open();
        
        Paragraph titulo = new Paragraph ("Prestamo de cliente " + idCliente);
        
        titulo.setAlignment(1);
        documento.add(titulo);
        
        List<Prestamo> prestamos = resultado.getPrestamos();
        
        for (int i = 0;i<prestamos.size();i++)
        {
            documento.add(new Paragraph("ID: " + resultado.getCedula()));
            documento.add(new Paragraph("Nombre: " + resultado.getNombre()));
            documento.add(new Paragraph("ID Prestamo: " + prestamos.get(i).getId()));
            documento.add(new Paragraph("Monto: " + prestamos.get(i).getMonto()));
            documento.add(new Paragraph("Plazo: " + prestamos.get(i).getPlazo() + "meses"));
            documento.add(new Paragraph("Tasa de Interes: " + prestamos.get(i).getTasaInteres()));
            documento.add(new Paragraph("Tasa de Interes: " + prestamos.get(i).calcularCuota()));
            documento.add(new Paragraph("Cantidad de pagos: " + prestamos.get(i).getPagos().size()));

            
            
            documento.add(Chunk.NEWLINE);

        }

               // documento.add(new Paragraph("ID Prestamo:  ))
        
//        for (int i = 0; i< clientes.size();i++)
//        {
//            documento.add(new Paragraph("ID: " + clientes.get(i).getCedula()));
//            documento.add(new Paragraph("Nombre: " + clientes.get(i).getNombre()));
//            documento.add(new Paragraph("Tasa de Interes: " + clientes.get(i).getPrestamos().toString()));
//            documento.add(new Paragraph("ID Prestamo: " + clientes.get(i).getPrestamos().get(i).getId()));
//            documento.add(new Paragraph("Monto: " + clientes.get(i).getPrestamos().get(i).getMonto()));
//            documento.add(new Paragraph("Plazo: " + clientes.get(i).getPrestamos().get(i).getPlazo()));
//            documento.add(new Paragraph("Tasa de Interes: " + clientes.get(i).getPrestamos().get(i).getTasaInteres()));
//            documento.add(new Paragraph("Tasa de Interes: " + clientes.get(i).getPrestamos().get(i)));
//
//            documento.add(Chunk.NEWLINE);
//        }

        documento.add(new Paragraph("-----------------------------------------------Fin del Documento-----------------------------------------------"));
        documento.close();
 
    }
}
    

