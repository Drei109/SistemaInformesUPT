package Utilidad;

import Presentacion.FrmInformePruebaEntrada;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author enzocv
 */
public class ClsRenderTable extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
        /*(sufi + bueno) > evaluados/2*/
        if (value instanceof Integer) {
            int valor  = (int) value;
            if (column == 3 || column == 5 || column == 7) {
                cell.setBackground(Color.yellow);
                cell.setForeground(Color.BLACK);
            }
            if (column == 0) {
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);
            }
            if (column == 8) {
                int sufi = Integer.parseInt(String.valueOf(FrmInformePruebaEntrada.tabla.getValueAt(row,4)));
                int bueno = Integer.parseInt(String.valueOf(FrmInformePruebaEntrada.tabla.getValueAt(row, 6)));
                int eva   = Integer.parseInt(FrmInformePruebaEntrada.txtEvaluados.getText());
                
                if ( (sufi+bueno) > (eva/2) ) {
                    cell.setBackground(Color.GREEN);
                    cell.setForeground(Color.BLACK);
                }
                else{
                    cell.setBackground(Color.RED);
                    cell.setForeground(Color.BLACK);
                }
                
            }
        }
        if (value instanceof String) {
            String valor  = (String) value;
            cell.setBackground(Color.WHITE);
            cell.setForeground(Color.BLACK);
        }
        return cell;
    }
    
}
