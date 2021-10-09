/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.prestamos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import payroll.logic.Prestamo;
import java.util.Calendar;
import payroll.logic.Pago;

/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
public class PagosTableModel extends AbstractTableModel implements TableModel        
{
    String [] cols =  {"Hora","#","Monto Pagado","Interes", "Amortizacion"};
    List<Pago> rows;
    
    public PagosTableModel(List<Pago> rows)
    {
        this.rows = rows;
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
        public String getColumnName(int col)
    {
        return cols[col];
    }
    
        
    @Override
    public int getRowCount() 
    {
        return rows.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pago p = rows.get(rowIndex);
        int i = 0;
        switch(columnIndex)
        {
            case 0:
                return p.getFecha();
            case 1:
                return p.getNumeroCuota();
            case 2:
                return p.getMontoPagado();
            case 3:
                return p.getInteres();
            case 4:
                return p.getAmortizacion();
            default:
                return "";
        }
    }
    

    
}
