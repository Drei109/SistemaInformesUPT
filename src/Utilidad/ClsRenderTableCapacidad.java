/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import Presentacion.FrmInformePruebaEntrada;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author enzocv
 */
public class ClsRenderTableCapacidad extends DefaultTableCellRenderer{
 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
        /*(sufi + bueno) > evaluados/2*/
        if (value instanceof Integer) {
            int valor  = (int) value;
            if (column == 1 || column == 2 || column == 3 || column == 4 || column == 5) {
                cell.add(new JRadioButton());
            }
        }
        if (value instanceof String) {
            String valor  = (String) value;
            cell.add(new JRadioButton());
        }
        return cell;
    }
}
