/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.prestamos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import payroll.logic.Prestamo;

/**
 *
 * @author Michelle
 */
public class PrestamosTableModel extends AbstractTableModel implements TableModel        
{
    String [] cols =  {"Monto","Plazo","Tasa Interes", "Pagos"};
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
        switch(columnIndex)
        {
            case 0:
                return p.getMonto();
            case 1:
                return p.getPlazo();
            case 2:
                return p.getTasaInteres();
            default:
                return "";
        }
    }
    

    
}

