package Utilidad;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;

/**
 *
 * @author enzocv
 */
public class ClsRadioEditor extends DefaultCellEditor implements ItemListener{

    JRadioButton radio;
    
    public ClsRadioEditor(JCheckBox chk){
        super(chk);
    }
  
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        if (value == null) return null;
        radio = (JRadioButton) value;
        radio.addItemListener(this);
        return (Component) value;
    }

    @Override
    public Object getCellEditorValue() {
        radio.removeItemListener(this);
        return radio;
    }

    
    @Override
    public void itemStateChanged(ItemEvent e) {
        super.fireEditingStopped();
        
//        JOptionPane.showMessageDialog(null, "");
    }
    
}
