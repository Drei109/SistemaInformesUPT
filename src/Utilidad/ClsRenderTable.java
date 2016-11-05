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
        if (value instanceof Integer) {
            int valor  = (int) value;
            if (column == 3 || column == 5 || column == 7) {
                if (valor <= 15) {
                    cell.setBackground(Color.red);
                    cell.setForeground(Color.BLACK);
                }
                else if (valor > 15 && valor < 50) {
                    cell.setBackground(Color.YELLOW);
                    cell.setForeground(Color.BLACK);
                }
                else if (valor >= 50 && valor <= 100) {
                    cell.setBackground(Color.GREEN);
                    cell.setForeground(Color.WHITE);
                }
            }
            if (column == 0) {
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);
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
