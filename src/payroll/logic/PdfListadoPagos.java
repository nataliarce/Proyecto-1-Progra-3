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
public class PdfListadoPagos {
    
           public void crearPdfPagos(String cedula,String idPrestamo) throws Exception
    {
        //PdfFont font = PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
        Prestamo resultado = Service.instance().PrestamoGet(cedula, idPrestamo);
        Document documento = new Document();
        FileOutputStream archivo = new FileOutputStream("listadoPagos" +cedula+ idPrestamo + ".pdf");
        
        PdfWriter.getInstance(documento, archivo);
        
        documento.open();
        
        Paragraph titulo = new Paragraph ("Listado de Pagos");
        
        titulo.setAlignment(1);
        documento.add(titulo);
        
        List<Pago> pagos = resultado.getPagos();
        
        for (int i = 0; i< pagos.size();i++)
        {
            documento.add(new Paragraph("ID Prestamo: " + resultado.getId()));
            documento.add(new Paragraph("Monto: " + pagos.get(i).getFecha()));
            documento.add(new Paragraph("Numero de cuota: " + pagos.get(i).getNumeroCuota()));
            documento.add(new Paragraph("Monto pagado: " + pagos.get(i).getMontoPagado()));
            documento.add(new Paragraph("Interes: " + pagos.get(i).getInteres()));
            documento.add(new Paragraph("Amortizacion: " + pagos.get(i).getAmortizacion()));
            
            documento.add(Chunk.NEWLINE);
        }

        documento.add(new Paragraph("-----------------------------------------------Fin del Documento-----------------------------------------------"));
        documento.close();
 
    }
}
    

