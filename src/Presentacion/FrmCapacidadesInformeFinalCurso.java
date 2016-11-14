
package Presentacion;

import Entidad.ClsEntidadCacidadInformeFinalCurso;
import Negocio.ClsNegocioCapadidadInformeFinalCurso;
import Negocio.ClsNegocioInformeFinalCurso;
import Utilidad.ClsRenderTableCapacidad;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enzocv
 */
public class FrmCapacidadesInformeFinalCurso extends javax.swing.JInternalFrame {

    int contador = 0;
    ArrayList<String> LogrosCapacidades = new ArrayList<>();
    int filaSeleccionada = -2;
    boolean filaRemovida = false;
    boolean guardarNuevo = true;
    String IdInfoFinalCurso = "";
    String TOdosIDFinalCurso[] = new String[50];
    
    public FrmCapacidadesInformeFinalCurso() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarFila = new javax.swing.JButton();
        btnRemoverFila = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCapacidades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        btnAgregarFila.setText("Agregar fila");
        btnAgregarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFilaActionPerformed(evt);
            }
        });

        btnRemoverFila.setText("Remover fila");
        btnRemoverFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFilaActionPerformed(evt);
            }
        });

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane1.setViewportView(txtComentario);

        TablaCapacidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaCapacidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaCapacidadesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCapacidades);

        jLabel1.setText("Logros de Capacidades del Curso:");

        jLabel2.setText("Cuál cree que ha sido el motivo por el cual los estudiantes no alcanzaron el logro de capacidades");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAgregarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addComponent(btnRemoverFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverFila)
                    .addComponent(btnAgregarFila)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFilaActionPerformed
        contador++;
        agregarFila(contador);
        TablaCapacidades.setDefaultRenderer(Object.class, new  ClsRenderTableCapacidad());
    }//GEN-LAST:event_btnAgregarFilaActionPerformed

    private void btnRemoverFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFilaActionPerformed
        contador--;
        removerFila();
    }//GEN-LAST:event_btnRemoverFilaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarTabla();
        cargarIDsInfoFinalCurso();
    }//GEN-LAST:event_formInternalFrameOpened

    private void TablaCapacidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCapacidadesMousePressed
        if (TablaCapacidades.getSelectedRow()!= -1) {
            if (filaSeleccionada == -2 || filaRemovida == true) {
                filaSeleccionada = TablaCapacidades.getSelectedRow();
                txtComentario.setText(LogrosCapacidades.get(filaSeleccionada));
                filaRemovida = false;
            } else {
                LogrosCapacidades.set(filaSeleccionada, txtComentario.getText());
                filaSeleccionada = TablaCapacidades.getSelectedRow();
                txtComentario.setText(LogrosCapacidades.get(filaSeleccionada));
            }
        }
    }//GEN-LAST:event_TablaCapacidadesMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //filas de la tabla capacidades
        int filas = TablaCapacidades.getRowCount();
        ArrayList<ClsEntidadCacidadInformeFinalCurso> datosCapacidad;
        ClsEntidadCacidadInformeFinalCurso entiCapacidad = new ClsEntidadCacidadInformeFinalCurso();
        /*AGREGAR EL NIVEL*/
        
        datosCapacidad = new ArrayList<>();
        if (filas != 0) {
            for (int i = 0; i < filas; i++) {
                entiCapacidad.setDescripcion((String)TablaCapacidades.getValueAt(filas, 0));
                
                String nivelN = (String) TablaCapacidades.getValueAt(filas, 1);
                String nivelP = (String) TablaCapacidades.getValueAt(filas, 2);
                String nivelA = (String) TablaCapacidades.getValueAt(filas, 3);
                String nivelB = (String) TablaCapacidades.getValueAt(filas, 4);
                String nivelM = (String) TablaCapacidades.getValueAt(filas, 5);
                
                
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void agregarFila(int contador){
        DefaultTableModel modelo = (DefaultTableModel) TablaCapacidades.getModel();
        modelo.addRow(new Object[]{contador, "","","","","",""});
        modelo.isCellEditable(0, 0);
        TablaCapacidades.setRowHeight(30);
        LogrosCapacidades.add("");
        
    }
    
    private void removerFila(){
        DefaultTableModel modelo = (DefaultTableModel) TablaCapacidades.getModel();
        if (TablaCapacidades.getSelectedRow()!= -1) {
            filaRemovida = true;
            LogrosCapacidades.remove(TablaCapacidades.getSelectedRow());
            modelo.removeRow(TablaCapacidades.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "¡Seleccione una fila!");
        }
    }
    
    private void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel(null,new Object[]{"Nro","Capacidades del Curso","N","P","A","B","M"});
        
        TablaCapacidades.setModel(modelo);
    }
    
    private void cargarIDsInfoFinalCurso() {
        try {
            //Instanciar la clase NegocioUsuario
            ClsNegocioCapadidadInformeFinalCurso informe = new ClsNegocioCapadidadInformeFinalCurso();
            
            //Obtiene el resultado de la consulta hecha a la BD
            ResultSet rsIdInforme = informe.obtenerIdInfoFinalCuro();
            int contador = 0;
            //itera los valores hechas en la consulta
            while (rsIdInforme.next()) {
                //cambiar de valor hasta llegar al ultimo ID
                IdInfoFinalCurso = rsIdInforme.getString(0);
                
                //guardamos todos los id para si en algun momneto lo necesitamos
                TOdosIDFinalCurso[contador] = rsIdInforme.getString(0);
                
                contador++;
            }
            informe.conexion.close();
        } catch (Exception e) {
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCapacidades;
    private javax.swing.JButton btnAgregarFila;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRemoverFila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtComentario;
    // End of variables declaration//GEN-END:variables

    
}
