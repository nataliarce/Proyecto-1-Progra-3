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
 * @author Michelle
 */
public class PrestamosTableModel extends AbstractTableModel implements TableModel        
{
    String [] cols =  {"Monto","Plazo","Tasa Interes", "Cuotas"};
    List<Prestamo> rows;
    
    public PrestamosTableModel(List<Prestamo> rows)
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
        Prestamo p = rows.get(rowIndex);
        int i = 0;
        switch(columnIndex)
        {
            case 0:
                return p.getMonto();
            case 1:
                return p.getPlazo();
            case 2:
                return p.getTasaInteres();
            case 3:
                return p.calcularCuota();
            default:
                return "";
        }
    }
    

    
}

