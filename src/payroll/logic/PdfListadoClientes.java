/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
public class PdfListadoClientes 
{

    public PdfListadoClientes() 
    {      
    }
    
    public void crearPdfClientes(List<Cliente> clientes) throws Exception
    {
        //PdfFont font = PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
        Document documento = new Document();
        int x = 1;
        FileOutputStream archivo = new FileOutputStream(x+"." + "listadoClientes.pdf");
        
       PdfWriter.getInstance(documento, archivo);
        
        documento.open();     
        
        Paragraph titulo = new Paragraph ("Listado de Clientes");
        
        titulo.setAlignment(1);
        documento.add(titulo);
        
        
        for (int i = 0; i< clientes.size();i++)
        {
            documento.add(new Paragraph("ID: " + clientes.get(i).getCedula()));
            documento.add(new Paragraph("Nombre: " + clientes.get(i).getNombre()));
            documento.add(new Paragraph("Provincia: " + clientes.get(i).getProvincia()));
            documento.add(new Paragraph("Canton: " + clientes.get(i).getCanton()));
            documento.add(new Paragraph("Distrito: " + clientes.get(i).getDistrito()));
            documento.add(new Paragraph("Cantidad de Prestamos: " + clientes.get(i).getPrestamos().size()));
            documento.add(Chunk.NEWLINE);
        }

        documento.add(new Paragraph("-----------------------------------------------Fin del Documento-----------------------------------------------"));
        documento.close();
 
    }
}
